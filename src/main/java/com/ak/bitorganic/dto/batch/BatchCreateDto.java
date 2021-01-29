package com.ak.bitorganic.dto.batch;

import java.util.Date;

public class BatchCreateDto {

    private Long batchNumber;
    private String LOTNumber;
    private Date createdDate;
    private String productDesignation;
    private Long batchWeight;
    private Long groupId;

    public BatchCreateDto() {
    }

    public BatchCreateDto(Long batchNumber,
                          String LOTNumber,
                          Date createdDate,
                          String productDesignation,
                          Long batchWeight,
                          Long groupId) {
        this.batchNumber = batchNumber;
        this.LOTNumber = LOTNumber;
        this.createdDate = createdDate;
        this.productDesignation = productDesignation;
        this.batchWeight = batchWeight;
        this.groupId = groupId;
    }

    public Long getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getProductDesignation() {
        return productDesignation;
    }

    public void setProductDesignation(String productDesignation) {
        this.productDesignation = productDesignation;
    }

    public Long getBatchWeight() {
        return batchWeight;
    }

    public void setBatchWeight(Long batchWeight) {
        this.batchWeight = batchWeight;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getLOTNumber() {
        return LOTNumber;
    }

    public void setLOTNumber(String LOTNumber) {
        this.LOTNumber = LOTNumber;
    }
}
