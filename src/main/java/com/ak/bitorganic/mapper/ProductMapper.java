package com.ak.bitorganic.mapper;

import com.ak.bitorganic.domain.Product;
import com.ak.bitorganic.dto.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDto productToProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setProductDesignation(product.getProductDesignation());
        productDto.setProductType(product.getProductType().toString());
        productDto.setParentProductDesignation(product.getParentProduct().getProductDesignation());
        productDto.setParentWeightPercentage(product.getParentWeightPercentage());
        return productDto;
    }
}
