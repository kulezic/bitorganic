package com.ak.bitorganic.service.impl;

import com.ak.bitorganic.domain.Batch;
import com.ak.bitorganic.domain.PurchaseOrder;
import com.ak.bitorganic.domain.Producer;
import com.ak.bitorganic.domain.Product;
import com.ak.bitorganic.dto.PurchaseOrderCreateDto;
import com.ak.bitorganic.dto.PurchaseOrderDto;
import com.ak.bitorganic.exception.NotFoundException;
import com.ak.bitorganic.mapper.PurchaseOrderMapper;
import com.ak.bitorganic.repository.BatchRepository;
import com.ak.bitorganic.repository.PurchaseOrderRepository;
import com.ak.bitorganic.repository.ProducerRepository;
import com.ak.bitorganic.repository.ProductRepository;
import com.ak.bitorganic.service.PurchaseOrderService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    private PurchaseOrderRepository purchaseOrderRepository;
    private ProducerRepository producerRepository;
    private ProductRepository productRepository;
    private BatchRepository batchRepository;

    private PurchaseOrderMapper purchaseOrderMapper;

    public PurchaseOrderServiceImpl(PurchaseOrderRepository purchaseOrderRepository,
                                    ProducerRepository producerRepository,
                                    ProductRepository productRepository,
                                    BatchRepository batchRepository,
                                    PurchaseOrderMapper purchaseOrderMapper) {
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.producerRepository = producerRepository;
        this.productRepository = productRepository;
        this.batchRepository = batchRepository;
        this.purchaseOrderMapper = purchaseOrderMapper;
    }

    @Override
    public boolean savePurchaseOrder(PurchaseOrderCreateDto purchaseOrderCreateDto) {
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        Producer producer = producerRepository.findByProducerId(purchaseOrderCreateDto.getProducerId())
                .orElseThrow(() -> new NotFoundException(String.format("Producer with id: %d not found.", purchaseOrderCreateDto.getProducerId())));
        Product product = productRepository.findByProductDesignation(purchaseOrderCreateDto.getProductDesignation())
                .orElseThrow(() -> new NotFoundException(String.format("Product with designation: %s not found.", purchaseOrderCreateDto.getProductDesignation())));
        Optional<Batch> optionalBatch = batchRepository.findByBatchNumberAndCreatedDateAndProduct(purchaseOrderCreateDto.getBatchNumber(),
                purchaseOrderCreateDto.getCreatedDate(), product);
        Batch batch;
        if (optionalBatch.isPresent()) {
            batch = optionalBatch.get();
            batch.setBatchWeight(batch.getBatchWeight() + purchaseOrderCreateDto.getDeliveredWeight());
        }
        else{
            batch = new Batch();
            batch.setBatchNumber(purchaseOrderCreateDto.getBatchNumber());
            batch.setCreatedDate(purchaseOrderCreateDto.getCreatedDate());
            batch.setProduct(product);
            batch.setBatchWeight(purchaseOrderCreateDto.getDeliveredWeight());
        }
        purchaseOrder.setPurchaseOrderNumber(purchaseOrderCreateDto.getInputOrderNumber());
        purchaseOrder.setCreatedDate(purchaseOrderCreateDto.getCreatedDate());
        purchaseOrder.setDeliveredWeight(purchaseOrderCreateDto.getDeliveredWeight());
        purchaseOrder.setProducer(producer);
        purchaseOrder.setBatch(batch);
        if(batchRepository.save(batch) == null) return false;
        if (purchaseOrderRepository.save(purchaseOrder) == null) return false;
        return true;
    }

    @Override
    public boolean updatePurchaseOrder(PurchaseOrderCreateDto purchaseOrderCreateDto) {
        return false;
    }

    @Override
    public boolean deletePurchaseOrder(Long inputOrderId) {
        PurchaseOrder purchaseOrder = purchaseOrderRepository.findByInputOrderId(inputOrderId)
                .orElseThrow(() -> new NotFoundException(String.format("Input order with id: %d not found", inputOrderId)));
        Batch batch = purchaseOrder.getBatch();
        batch.setBatchWeight(batch.getBatchWeight() - purchaseOrder.getDeliveredWeight());
        if (batchRepository.save(batch) == null) return false;
        if(purchaseOrderRepository.deleteByInputOrderId(inputOrderId) == 0) return false;
        return true;
    }

    @Override
    public PurchaseOrderDto findByPurchaseOrderId(Long inputOrderId) {
        PurchaseOrder purchaseOrder = purchaseOrderRepository.findByInputOrderId(inputOrderId)
                .orElseThrow(() -> new NotFoundException(String.format("Input order with id: %d not found", inputOrderId)));
        return purchaseOrderMapper.inputOrderToInputOrderDto(purchaseOrder);
    }

    @Override
    public List<PurchaseOrderDto> findAllPurchaseOrders() {
        return purchaseOrderRepository.findAll().stream()
                .map(purchaseOrderMapper::inputOrderToInputOrderDto).collect(Collectors.toList());
    }

    @Override
    public List<PurchaseOrderDto> searchPurchaseOrders(Specification<PurchaseOrder> specification) {
        return purchaseOrderRepository.findAll(Specification.where(specification)).stream()
                .map(purchaseOrderMapper::inputOrderToInputOrderDto).collect(Collectors.toList());
    }
}
