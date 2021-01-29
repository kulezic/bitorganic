package com.ak.bitorganic.dto;

import java.util.Date;

public class PurchaseOrderDto {
    private Long inputOrderId;

    private Long inputOrderNumber;
    private Date createdDate;
    private Long deliveredWeight;

    private ProducerDto producerDto;

    public PurchaseOrderDto() {
    }

    public PurchaseOrderDto(Long inputOrderId,
                            Long inputOrderNumber,
                            Date createdDate,
                            Long deliveredWeight,
                            ProducerDto producerDto) {
        this.inputOrderId = inputOrderId;
        this.inputOrderNumber = inputOrderNumber;
        this.createdDate = createdDate;
        this.deliveredWeight = deliveredWeight;
        this.producerDto = producerDto;
    }

    public Long getInputOrderId() {
        return inputOrderId;
    }

    public void setInputOrderId(Long inputOrderId) {
        this.inputOrderId = inputOrderId;
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

    public ProducerDto getProducerDto() {
        return producerDto;
    }

    public void setProducerDto(ProducerDto producerDto) {
        this.producerDto = producerDto;
    }
}
