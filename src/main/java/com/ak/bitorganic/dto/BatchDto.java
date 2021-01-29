package com.ak.bitorganic.dto;


public class BatchDto {

    private Long batchId;
    private Long batchNumber;
    private Long LOTNumber;
    private ProductDto productDto;
    private Long batchWeight;

    public BatchDto() {
    }

    public BatchDto(Long batchId, Long batchNumber, Long LOTNumber, ProductDto productDto, Long batchWeight) {
        this.batchId = batchId;
        this.batchNumber = batchNumber;
        this.LOTNumber = LOTNumber;
        this.productDto = productDto;
        this.batchWeight = batchWeight;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Long getLOTNumber() {
        return LOTNumber;
    }

    public void setLOTNumber(Long LOTNumber) {
        this.LOTNumber = LOTNumber;
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }

    public Long getBatchWeight() {
        return batchWeight;
    }

    public void setBatchWeight(Long batchWeight) {
        this.batchWeight = batchWeight;
    }
}
