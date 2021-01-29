package com.ak.bitorganic.domain;

import javax.persistence.*;

@Entity
public class FieldStructure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filedStructureId;

    @ManyToOne
    private Producer producer;

    @ManyToOne
    private Product product;
    private Long acreage;

    public FieldStructure() {
    }

    public Long getFiledStructureId() {
        return filedStructureId;
    }

    public void setFiledStructureId(Long filedStructureId) {
        this.filedStructureId = filedStructureId;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getAcreage() {
        return acreage;
    }

    public void setAcreage(Long acreage) {
        this.acreage = acreage;
    }
}
