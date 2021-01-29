package com.ak.bitorganic.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long batchId;

    private Long batchNumber;
    private String LOTNumber;
    private Date createdDate;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Group group;

    private Long batchWeight;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "batch", orphanRemoval = true)
    private List<PurchaseOrder> purchaseOrders;

    @ManyToOne
    private ProductionOrder inputProductionOrder;

    @ManyToOne
    private ProductionOrder outputProductionOrder;

    public Batch() {
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getBatchWeight() {
        return batchWeight;
    }

    public void setBatchWeight(Long batchWeight) {
        this.batchWeight = batchWeight;
    }

    public List<PurchaseOrder> getInputOrders() {
        return purchaseOrders;
    }

    public void setInputOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public ProductionOrder getInputProductionOrder() {
        return inputProductionOrder;
    }

    public void setInputProductionOrder(ProductionOrder inputProductionOrder) {
        this.inputProductionOrder = inputProductionOrder;
    }

    public ProductionOrder getOutputProductionOrder() {
        return outputProductionOrder;
    }

    public void setOutputProductionOrder(ProductionOrder outputProductionOrder) {
        this.outputProductionOrder = outputProductionOrder;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }
}
