package com.ak.bitorganic.service.impl;

import com.ak.bitorganic.domain.Product;
import com.ak.bitorganic.dto.FreshProductCreateDto;
import com.ak.bitorganic.dto.ProcessedProductCreateDto;
import com.ak.bitorganic.dto.ProductDto;
import com.ak.bitorganic.dto.ProductUpdateDto;
import com.ak.bitorganic.enums.ProductType;
import com.ak.bitorganic.exception.DeleteForbidden;
import com.ak.bitorganic.exception.NotFoundException;
import com.ak.bitorganic.mapper.ProductMapper;
import com.ak.bitorganic.repository.ProductRepository;
import com.ak.bitorganic.service.ProductService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public boolean saveFreshProduct(FreshProductCreateDto freshProductCreateDto) {
        Product product = new Product();
        product.setProductName(freshProductCreateDto.getProductName());
        product.setProductDesignation(freshProductCreateDto.getProductDesignation());
        product.setProductType(ProductType.FRESH_PRODUCT);
        product.setParentProduct(null);
        product.setParentWeightPercentage(100);
        if (productRepository.save(product) == null) return false;
        return true;
    }

    @Override
    public boolean saveProcessedProduct(ProcessedProductCreateDto processedProductCreateDto) {
        Product product = new Product();
        product.setProductName(processedProductCreateDto.getProductName());
        product.setProductDesignation(processedProductCreateDto.getProductDesignation());
        product.setProductType(ProductType.PROCESSED_PRODUCT);
        Product parentProduct = productRepository.findByProductDesignation(processedProductCreateDto.getParentProductDesignation())
                .orElseThrow(() -> new NotFoundException(String.format("Product with product designation: %s not found", processedProductCreateDto.getParentProductDesignation())));
        product.setParentProduct(parentProduct);
        product.setParentWeightPercentage(processedProductCreateDto.getParentWeightPercentage());
        if (productRepository.save(product) == null) return false;
        return true;
    }

    @Override
    public boolean updateProduct(ProductUpdateDto productUpdateDto) {
        return false;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        Product product = productRepository.findByProductId(productId)
                .orElseThrow(() -> new NotFoundException(String.format("Product with id: %d not found", productId)));
        if(product.getBatchList().size() > 0 || product.getFieldStructures().size() > 0)
            throw new DeleteForbidden("You can not delete products that are already assigned");
        if (productRepository.deleteByProductId(productId) == 0) return false;
        return true;
    }

    @Override
    public ProductDto findByProductId(Long productId) {
        Product product = productRepository.findByProductId(productId)
                .orElseThrow(() -> new NotFoundException(String.format("Product with id: %d not found", productId)));
        return productMapper.productToProductDto(product);
    }

    @Override
    public List<ProductDto> findAllProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::productToProductDto).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> searchProducts(Specification<Product> specification) {
        return productRepository.findAll(Specification.where(specification)).stream()
                .map(productMapper::productToProductDto).collect(Collectors.toList());
    }
}
