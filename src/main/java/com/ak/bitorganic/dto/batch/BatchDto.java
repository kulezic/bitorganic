package com.ak.bitorganic.dto.batch;


import com.ak.bitorganic.dto.group.GroupDto;
import com.ak.bitorganic.dto.product.ProductDto;

public class BatchDto {

    private Long batchId;

    private Long batchNumber;
    private String LOTNumber;
    private ProductDto productDto;
    private Long batchWeight;
    private GroupDto groupDto;

    public BatchDto() {
    }

    public BatchDto(Long batchId,
                    Long batchNumber,
                    String LOTNumber,
                    ProductDto productDto,
                    Long batchWeight,
                    GroupDto groupDto) {
        this.batchId = batchId;
        this.batchNumber = batchNumber;
        this.LOTNumber = LOTNumber;
        this.productDto = productDto;
        this.batchWeight = batchWeight;
        this.groupDto = groupDto;
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

    public String getLOTNumber() {
        return LOTNumber;
    }

    public void setLOTNumber(String LOTNumber) {
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

    public GroupDto getGroupDto() {
        return groupDto;
    }

    public void setGroupDto(GroupDto groupDto) {
        this.groupDto = groupDto;
    }
}
