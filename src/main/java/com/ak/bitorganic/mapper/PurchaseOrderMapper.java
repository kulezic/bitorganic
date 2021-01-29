package com.ak.bitorganic.mapper;

import com.ak.bitorganic.domain.PurchaseOrder;
import com.ak.bitorganic.dto.purchaseorder.PurchaseOrderDto;
import org.springframework.stereotype.Component;

@Component
public class PurchaseOrderMapper {
    private ProducerMapper producerMapper;

    public PurchaseOrderMapper(ProducerMapper producerMapper) {
        this.producerMapper = producerMapper;
    }

    public PurchaseOrderDto inputOrderToInputOrderDto(PurchaseOrder purchaseOrder){
        PurchaseOrderDto purchaseOrderDto = new PurchaseOrderDto();
        purchaseOrderDto.setInputOrderId(purchaseOrder.getPurchaseOrderId());
        purchaseOrderDto.setInputOrderNumber(purchaseOrder.getPurchaseOrderNumber());
        purchaseOrderDto.setCreatedDate(purchaseOrder.getCreatedDate());
        purchaseOrderDto.setDeliveredWeight(purchaseOrder.getDeliveredWeight());
        purchaseOrderDto.setProducerDto(producerMapper.producerToProducerDto(purchaseOrder.getProducer()));
        return purchaseOrderDto;
    }
}
