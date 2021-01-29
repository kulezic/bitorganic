package com.ak.bitorganic.mapper;

import com.ak.bitorganic.domain.Batch;
import com.ak.bitorganic.dto.BatchDto;
import org.springframework.stereotype.Component;

@Component
public class BatchMapper {
    private ProductMapper productMapper;

    public BatchMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public BatchDto batchToBatchDto(Batch batch){
        BatchDto batchDto = new BatchDto();
        batchDto.setBatchId(batch.getBatchId());
        batchDto.setBatchNumber(batch.getBatchNumber());
        batchDto.setLOTNumber(batch.getLOTNumber());
        batchDto.setBatchWeight(batch.getBatchWeight());
        batchDto.setProductDto(productMapper.productToProductDto(batch.getProduct()));
        return batchDto;
    }
}
