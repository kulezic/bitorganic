package com.ak.bitorganic.dto.product;

public class FreshProductCreateDto {

    private String productName;
    private String productDesignation;

    public FreshProductCreateDto() {
    }

    public FreshProductCreateDto(String productName, String productDesignation) {
        this.productName = productName;
        this.productDesignation = productDesignation;
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
}
