package com.ak.bitorganic.dto.fieldstructure;

import com.ak.bitorganic.dto.producer.ProducerDto;
import com.ak.bitorganic.dto.product.ProductDto;

import java.time.Year;

public class FieldStructureDto {

    private Long fieldStructureId;
    private ProducerDto producerDto;

    private ProductDto productDto;
    private Long acreage;

    private Year startYear;
    private Year endYear;

    public FieldStructureDto() {
    }

    public FieldStructureDto(Long fieldStructureId,
                             ProducerDto producerDto,
                             ProductDto productDto,
                             Long acreage,
                             Year startYear,
                             Year endYear) {
        this.fieldStructureId = fieldStructureId;
        this.producerDto = producerDto;
        this.productDto = productDto;
        this.acreage = acreage;
        this.startYear = startYear;
        this.endYear = endYear;
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

    public ProducerDto getProducerDto() {
        return producerDto;
    }

    public void setProducerDto(ProducerDto producerDto) {
        this.producerDto = producerDto;
    }

    public Year getStartYear() {
        return startYear;
    }

    public void setStartYear(Year startYear) {
        this.startYear = startYear;
    }

    public Year getEndYear() {
        return endYear;
    }

    public void setEndYear(Year endYear) {
        this.endYear = endYear;
    }
}
