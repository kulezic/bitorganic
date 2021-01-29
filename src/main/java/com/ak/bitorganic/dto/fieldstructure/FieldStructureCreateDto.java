package com.ak.bitorganic.dto.fieldstructure;

import java.time.Year;

public class FieldStructureCreateDto {

    private Long producerId;

    private String productDesignation;
    private Long acreage;

    private Year startYear;
    private Year endYear;

    public FieldStructureCreateDto(Long producerId,
                                   String productDesignation,
                                   Long acreage,
                                   Year startYear,
                                   Year endYear) {
        this.producerId = producerId;
        this.productDesignation = productDesignation;
        this.acreage = acreage;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public FieldStructureCreateDto() {
    }

    public Long getProducerId() {
        return producerId;
    }

    public void setProducerId(Long producerId) {
        this.producerId = producerId;
    }

    public String getProductDesignation() {
        return productDesignation;
    }

    public void setProductDesignation(String productDesignation) {
        this.productDesignation = productDesignation;
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
