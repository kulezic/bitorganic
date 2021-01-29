package com.ak.bitorganic.dto;

public class FieldStructureDto {

    private Long fieldStructureId;
    private ProductDto productDto;
    private Long acreage;

    public FieldStructureDto() {
    }

    public FieldStructureDto(Long fieldStructureId, ProductDto productDto, Long acreage) {
        this.fieldStructureId = fieldStructureId;
        this.productDto = productDto;
        this.acreage = acreage;
    }

    public Long getFieldStructureId() {
        return fieldStructureId;
    }

    public void setFieldStructureId(Long fieldStructureId) {
        this.fieldStructureId = fieldStructureId;
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }

    public Long getAcreage() {
        return acreage;
    }

    public void setAcreage(Long acreage) {
        this.acreage = acreage;
    }
}
