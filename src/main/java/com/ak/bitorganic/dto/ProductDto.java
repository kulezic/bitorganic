package com.ak.bitorganic.dto;

import com.ak.bitorganic.domain.Product;

public class ProductDto {

    private Long productId;
    private String productName;
    private String productDesignation;
    private String productType;

    private String parentProductDesignation;
    private Integer parentWeightPercentage;

    public ProductDto() {
    }

    public ProductDto(Long productId,
                      String productName,
                      String productDesignation,
                      String productType,
                      String parentProductDesignation,
                      Integer parentWeightPercentage) {
        this.productId = productId;
        this.productName = productName;
        this.productDesignation = productDesignation;
        this.productType = productType;
        this.parentProductDesignation = parentProductDesignation;
        this.parentWeightPercentage = parentWeightPercentage;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
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
