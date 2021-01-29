package com.ak.bitorganic.service;

import com.ak.bitorganic.domain.Product;
import com.ak.bitorganic.dto.FreshProductCreateDto;
import com.ak.bitorganic.dto.ProcessedProductCreateDto;
import com.ak.bitorganic.dto.ProductDto;
import com.ak.bitorganic.dto.ProductUpdateDto;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface ProductService {

    boolean saveFreshProduct(FreshProductCreateDto freshProductCreateDto);
    boolean saveProcessedProduct(ProcessedProductCreateDto processedProductCreateDto);
    boolean updateProduct(ProductUpdateDto productUpdateDto);
    boolean deleteProduct(Long productId);

    ProductDto findByProductId(Long productId);

    List<ProductDto> findAllProducts();
    List<ProductDto> searchProducts(Specification<Product> specification);

}
