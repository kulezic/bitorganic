package com.ak.bitorganic.dto;

public class FieldStructureCreateDto {

    private Long producerId;

    private String productDesignation;
    private Long acreage;

    public FieldStructureCreateDto(Long producerId,
                                   String productDesignation,
                                   Long acreage) {
        this.producerId = producerId;
        this.productDesignation = productDesignation;
        this.acreage = acreage;
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
}
