package com.ak.bitorganic.mapper;

import com.ak.bitorganic.domain.FieldStructure;
import com.ak.bitorganic.dto.FieldStructureDto;
import org.springframework.stereotype.Component;

@Component
public class FieldStructureMapper {
    private ProductMapper productMapper;

    public FieldStructureMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public FieldStructureDto fieldStructureToFieldStructureDto(FieldStructure fieldStructure){
        FieldStructureDto fieldStructureDto = new FieldStructureDto();
        fieldStructureDto.setFieldStructureId(fieldStructure.getFiledStructureId());
        fieldStructureDto.setProductDto(productMapper.productToProductDto(fieldStructure.getProduct()));
        fieldStructureDto.setAcreage(fieldStructure.getAcreage());
        return fieldStructureDto;
    }
}
