package com.ak.bitorganic.controller;

import com.ak.bitorganic.domain.Product;
import com.ak.bitorganic.dto.product.FreshProductCreateDto;
import com.ak.bitorganic.dto.product.ProcessedProductCreateDto;
import com.ak.bitorganic.dto.product.ProductDto;
import com.ak.bitorganic.service.ProductService;
import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save_fresh")
    ResponseEntity<Boolean> saveFreshProduct(@RequestBody FreshProductCreateDto freshProductCreateDto){
        return new ResponseEntity<>(productService.saveFreshProduct(freshProductCreateDto), HttpStatus.OK);
    }

    @PostMapping("/save_processed")
    ResponseEntity<Boolean> saveProcessedProduct(@RequestBody ProcessedProductCreateDto processedProductCreateDto){
        return new ResponseEntity<>(productService.saveProcessedProduct(processedProductCreateDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Boolean> deleteProduct(@PathVariable("id") Long id){
        return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<ProductDto>> findAllGroups(){
        return new ResponseEntity<>(productService.findAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/search")
    ResponseEntity<List<ProductDto>> searchGroups(@SearchSpec Specification<Product> specs){
        return new ResponseEntity<>(productService.searchProducts(specs), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<ProductDto> findByGroupId(@PathVariable("id") Long id){
        return new ResponseEntity<>(productService.findByProductId(id), HttpStatus.OK);
    }
}
