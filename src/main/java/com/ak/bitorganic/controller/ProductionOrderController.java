package com.ak.bitorganic.controller;

import com.ak.bitorganic.domain.ProductionOrder;
import com.ak.bitorganic.dto.productionorder.ProductionOrderCreateDto;
import com.ak.bitorganic.dto.productionorder.ProductionOrderDto;
import com.ak.bitorganic.service.ProductionOrderService;
import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/production_order")
public class ProductionOrderController {

    @Autowired
    private ProductionOrderService productionOrderService;

    @PostMapping("/save")
    ResponseEntity<Boolean> saveProductionOrder(@RequestBody ProductionOrderCreateDto productionOrderCreateDto){
        return new ResponseEntity<>(productionOrderService.saveProductionOrder(productionOrderCreateDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Boolean> deleteProductionOrder(@PathVariable("id") Long id){
        return new ResponseEntity<>(productionOrderService.deleteProductionOrder(id), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<ProductionOrderDto>> findAllProductionOrders(){
        return new ResponseEntity<>(productionOrderService.findAllProductionOrders(), HttpStatus.OK);
    }

    @GetMapping("/search")
    ResponseEntity<List<ProductionOrderDto>> searchProductionOrders(@SearchSpec Specification<ProductionOrder> specs){
        return new ResponseEntity<>(productionOrderService.searchProductionOrders(specs), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<ProductionOrderDto> findByProductionOrderId(@PathVariable("id") Long id){
        return new ResponseEntity<>(productionOrderService.findByProductionOrderId(id), HttpStatus.OK);
    }
}
