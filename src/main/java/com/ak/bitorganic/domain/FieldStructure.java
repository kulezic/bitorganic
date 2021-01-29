package com.ak.bitorganic.domain;

import javax.persistence.*;
import java.time.Year;

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

    private Year startYear;
    private Year endYear;

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

    public Year getStartYear() {
        return startYear;
    }

    public void setStartYear(Year startYear) {
        this.startYear = startYear;
    }

    public Year getEndYear() {
        return endYear;
    }

    public void setEndYear(Year endYear) {
        this.endYear = endYear;
    }
}
