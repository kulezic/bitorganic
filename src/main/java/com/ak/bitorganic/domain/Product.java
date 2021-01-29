package com.ak.bitorganic.domain;

import com.ak.bitorganic.enums.ProductType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    @Column(unique = true)
    private String productDesignation;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    @OneToMany(mappedBy="parentProduct")
    private List<Product> subProducts;
    @ManyToOne
    private Product parentProduct;
    private Integer parentWeightPercentage;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", orphanRemoval = true)
    private List<FieldStructure> fieldStructures;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product", orphanRemoval = true)
    private List<Batch> batchList;


    public Product() {
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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<Product> getSubProducts() {
        return subProducts;
    }

    public void setSubProducts(List<Product> subProducts) {
        this.subProducts = subProducts;
    }

    public Product getParentProduct() {
        return parentProduct;
    }

    public void setParentProduct(Product parentComment) {
        this.parentProduct = parentComment;
    }

    public Integer getParentWeightPercentage() {
        return parentWeightPercentage;
    }

    public void setParentWeightPercentage(Integer parentWeightPercentage) {
        this.parentWeightPercentage = parentWeightPercentage;
    }

    public List<FieldStructure> getFieldStructures() {
        return fieldStructures;
    }

    public void setFieldStructures(List<FieldStructure> fieldStructures) {
        this.fieldStructures = fieldStructures;
    }

    public List<Batch> getBatchList() {
        return batchList;
    }

    public void setBatchList(List<Batch> batchList) {
        this.batchList = batchList;
    }
}
