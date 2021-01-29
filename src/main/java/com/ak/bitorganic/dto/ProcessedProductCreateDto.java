package com.ak.bitorganic.dto;

public class ProcessedProductCreateDto {

    private String productName;
    private String productDesignation;

    private String parentProductDesignation;
    private Integer parentWeightPercentage;

    public ProcessedProductCreateDto() {
    }

    public ProcessedProductCreateDto(String productName,
                                     String productDesignation,
                                     String parentProductDesignation,
                                     Integer parentWeightPercentage) {
        this.productName = productName;
        this.productDesignation = productDesignation;
        this.parentProductDesignation = parentProductDesignation;
        this.parentWeightPercentage = parentWeightPercentage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesignation() {
        return productDesignation;
    }

    public void setProductDesignation(String productDesignation) {
        this.productDesignation = productDesignation;
    }

    public String getParentProductDesignation() {
        return parentProductDesignation;
    }

    public void setParentProductDesignation(String parentProductDesignation) {
        this.parentProductDesignation = parentProductDesignation;
    }

    public Integer getParentWeightPercentage() {
        return parentWeightPercentage;
    }

    public void setParentWeightPercentage(Integer parentWeightPercentage) {
        this.parentWeightPercentage = parentWeightPercentage;
    }
}
