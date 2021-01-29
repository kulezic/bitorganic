package com.ak.bitorganic.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "production_order")
public class ProductionOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productionOrderId;

    private Long productionOrderNumber;
    private Date productionDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "production_order")
    private List<Batch> inputBatches;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "production_order")
    private List<Batch> outputBatches;

    public ProductionOrder() {
    }

    public Long getProductionOrderId() {
        return productionOrderId;
    }

    public void setProductionOrderId(Long productionOrderId) {
        this.productionOrderId = productionOrderId;
    }

    public Long getProductionOrderNumber() {
        return productionOrderNumber;
    }

    public void setProductionOrderNumber(Long productionOrderNumber) {
        this.productionOrderNumber = productionOrderNumber;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public List<Batch> getInputBatches() {
        return inputBatches;
    }

    public void setInputBatches(List<Batch> inputBatches) {
        this.inputBatches = inputBatches;
    }

    public List<Batch> getOutputBatches() {
        return outputBatches;
    }

    public void setOutputBatches(List<Batch> outputBatches) {
        this.outputBatches = outputBatches;
    }
}
