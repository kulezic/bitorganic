package com.ak.bitorganic.dto;

import java.util.Date;

public class BatchCreateDto {

    private Long batchNumber;
    private Date createdDate;
    private String productDesignation;
    private Long batchWeight;

    public BatchCreateDto() {
    }

    public BatchCreateDto(Long batchNumber, Date createdDate, String productDesignation, Long batchWeight) {
        this.batchNumber = batchNumber;
        this.createdDate = createdDate;
        this.productDesignation = productDesignation;
        this.batchWeight = batchWeight;
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
}
