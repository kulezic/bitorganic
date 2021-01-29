package com.ak.bitorganic.dto;

import java.util.Date;

public class PurchaseOrderCreateDto {

    private Long inputOrderNumber;
    private Date createdDate;
    private Long deliveredWeight;

    private Long producerId;
    private Long batchNumber;
    private String productDesignation;

    public PurchaseOrderCreateDto() {
    }

    public PurchaseOrderCreateDto(Long inputOrderNumber,
                                  Date createdDate,
                                  Long deliveredWeight,
                                  Long producerId,
                                  Long batchNumber,
                                  String productDesignation) {
        this.inputOrderNumber = inputOrderNumber;
        this.createdDate = createdDate;
        this.deliveredWeight = deliveredWeight;
        this.producerId = producerId;
        this.batchNumber = batchNumber;
        this.productDesignation = productDesignation;
    }

    public Long getInputOrderNumber() {
        return inputOrderNumber;
    }

    public void setInputOrderNumber(Long inputOrderNumber) {
        this.inputOrderNumber = inputOrderNumber;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getDeliveredWeight() {
        return deliveredWeight;
    }

    public void setDeliveredWeight(Long deliveredWeight) {
        this.deliveredWeight = deliveredWeight;
    }

    public Long getProducerId() {
        return producerId;
    }

    public void setProducerId(Long producerId) {
        this.producerId = producerId;
    }

    public Long getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getProductDesignation() {
        return productDesignation;
    }

    public void setProductDesignation(String productDesignation) {
        this.productDesignation = productDesignation;
    }
}
