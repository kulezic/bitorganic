package com.ak.bitorganic.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseOrderId;

    private Long purchaseOrderNumber;
    private Date createdDate;
    private Long deliveredWeight;

    @ManyToOne
    private Producer producer;

    @ManyToOne
    private Batch batch;

    public PurchaseOrder() {
    }


    public Long getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Long inputOrderId) {
        this.purchaseOrderId = inputOrderId;
    }

    public Long getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(Long inputOrderNumber) {
        this.purchaseOrderNumber = inputOrderNumber;
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

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}
