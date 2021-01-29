package com.ak.bitorganic.service.impl;

import com.ak.bitorganic.domain.Batch;
import com.ak.bitorganic.domain.Product;
import com.ak.bitorganic.domain.ProductionOrder;
import com.ak.bitorganic.dto.batch.BatchCreateDto;
import com.ak.bitorganic.dto.productionorder.ProductionOrderCreateDto;
import com.ak.bitorganic.dto.productionorder.ProductionOrderDto;
import com.ak.bitorganic.exception.NotFoundException;
import com.ak.bitorganic.mapper.ProductionOrderMapper;
import com.ak.bitorganic.repository.BatchRepository;
import com.ak.bitorganic.repository.ProductRepository;
import com.ak.bitorganic.repository.ProductionOrderRepository;
import com.ak.bitorganic.service.ProductionOrderService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductionOrderServiceImpl implements ProductionOrderService {

    private ProductionOrderRepository productionOrderRepository;
    private BatchRepository batchRepository;
    private ProductRepository productRepository;

    private ProductionOrderMapper productionOrderMapper;

    public ProductionOrderServiceImpl(ProductionOrderRepository productionOrderRepository,
                                      BatchRepository batchRepository,
                                      ProductRepository productRepository,
                                      ProductionOrderMapper productionOrderMapper) {
        this.productionOrderRepository = productionOrderRepository;
        this.batchRepository = batchRepository;
        this.productRepository = productRepository;
        this.productionOrderMapper = productionOrderMapper;
    }

    @Override
    public boolean saveProductionOrder(ProductionOrderCreateDto productionOrderCreateDto) {
        ProductionOrder productionOrder = new ProductionOrder();
        List<Batch> inputBatches = batchRepository.findAllById(productionOrderCreateDto.getInputBatchIdList());
        List<Batch> outputBatches = new ArrayList<>();
        for (BatchCreateDto batchCreate:
             productionOrderCreateDto.getOutputBatchCreateDtoList()) {
            Batch batch = new Batch();
            batch.setBatchNumber(batchCreate.getBatchNumber());
            batch.setBatchWeight(batchCreate.getBatchWeight());
            batch.setCreatedDate(batchCreate.getCreatedDate());
            Product product = productRepository.findByProductDesignation(batchCreate.getProductDesignation())
                    .orElseThrow(() -> new NotFoundException(String.format("Product with designation: %s not found.", batchCreate.getProductDesignation())));
            batch.setProduct(product);
            Batch savedBatch = batchRepository.save(batch);
            outputBatches.add(savedBatch);
        }
        productionOrder.setProductionOrderNumber(productionOrderCreateDto.getProductionOrderNumber());
        productionOrder.setProductionDate(productionOrderCreateDto.getProductionDate());
        productionOrder.setInputBatches(inputBatches);
        productionOrder.setOutputBatches(outputBatches);
        if(productionOrderRepository.save(productionOrder) == null) return false;
        return true;
    }

    @Override
    public boolean updateProductionOrder(ProductionOrderCreateDto productionOrderCreateDto) {
        return false;
    }

    @Override
    public boolean deleteProductionOrder(Long productionOrderId) {
        ProductionOrder productionOrder = productionOrderRepository.findByProductionOrderId(productionOrderId)
                .orElseThrow(() -> new NotFoundException(String.format("Product order with id: %d not found", productionOrderId)));
        for(Batch b: productionOrder.getOutputBatches()){
            batchRepository.delete(b);
        }
        if(productionOrderRepository.deleteByProductionOrderId(productionOrderId) == null) return false;
        return true;
    }

    @Override
    public ProductionOrderDto findByProductionOrderId(Long productionOrderId) {
        ProductionOrder productionOrder = productionOrderRepository.findByProductionOrderId(productionOrderId)
                .orElseThrow(() -> new NotFoundException(String.format("Product order with id: %d not found", productionOrderId)));
        return productionOrderMapper.productionOrderToProductionOrderDto(productionOrder);
    }

    @Override
    public List<ProductionOrderDto> findAllProductionOrders() {
        return productionOrderRepository.findAll().stream()
                .map(productionOrderMapper::productionOrderToProductionOrderDto).collect(Collectors.toList());
    }

    @Override
    public List<ProductionOrderDto> searchProductionOrders(Specification<ProductionOrder> specification) {
        return productionOrderRepository.findAll(Specification.where(specification)).stream()
                .map(productionOrderMapper::productionOrderToProductionOrderDto).collect(Collectors.toList());
    }
}
