package com.ak.bitorganic.mapper;

import com.ak.bitorganic.domain.ProductionOrder;
import com.ak.bitorganic.dto.productionorder.ProductionOrderDto;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProductionOrderMapper {
    private BatchMapper batchMapper;

    public ProductionOrderMapper(BatchMapper batchMapper) {
        this.batchMapper = batchMapper;
    }

    public ProductionOrderDto productionOrderToProductionOrderDto(ProductionOrder productionOrder){
        ProductionOrderDto productionOrderDto = new ProductionOrderDto();
        productionOrderDto.setProductionOrderId(productionOrder.getProductionOrderId());
        productionOrderDto.setProductionOrderNumber(productionOrder.getProductionOrderNumber());
        productionOrderDto.setProductionDate(productionOrder.getProductionDate());
        productionOrderDto.setInputBatchDtoList(productionOrder.getInputBatches().stream()
                .map(batchMapper::batchToBatchDto).collect(Collectors.toList()));
        productionOrderDto.setOutputBatchDtoList(productionOrder.getOutputBatches().stream()
                .map(batchMapper::batchToBatchDto).collect(Collectors.toList()));
        return productionOrderDto;
    }
}
