package com.ak.bitorganic.controller;

import com.ak.bitorganic.domain.PurchaseOrder;
import com.ak.bitorganic.dto.purchaseorder.PurchaseOrderCreateDto;
import com.ak.bitorganic.dto.purchaseorder.PurchaseOrderDto;
import com.ak.bitorganic.service.PurchaseOrderService;
import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase_order")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @PostMapping("/save")
    ResponseEntity<Boolean> savePurchaseOrder(@RequestBody PurchaseOrderCreateDto purchaseOrderCreateDto){
        return new ResponseEntity<>(purchaseOrderService.savePurchaseOrder(purchaseOrderCreateDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Boolean> deletePurchaseOrder(@PathVariable("id") Long id){
        return new ResponseEntity<>(purchaseOrderService.deletePurchaseOrder(id), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<PurchaseOrderDto>> findAllPurchaseOrders(){
        return new ResponseEntity<>(purchaseOrderService.findAllPurchaseOrders(), HttpStatus.OK);
    }

    @GetMapping("/search")
    ResponseEntity<List<PurchaseOrderDto>> searchPurchaseOrders(@SearchSpec Specification<PurchaseOrder> specs){
        return new ResponseEntity<>(purchaseOrderService.searchPurchaseOrders(specs), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<PurchaseOrderDto> findByPurchaseOrderId(@PathVariable("id") Long id){
        return new ResponseEntity<>(purchaseOrderService.findByPurchaseOrderId(id), HttpStatus.OK);
    }

}
