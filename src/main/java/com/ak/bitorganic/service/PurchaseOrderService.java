package com.ak.bitorganic.service;

import com.ak.bitorganic.domain.PurchaseOrder;
import com.ak.bitorganic.dto.PurchaseOrderCreateDto;
import com.ak.bitorganic.dto.PurchaseOrderDto;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface PurchaseOrderService {
    boolean savePurchaseOrder(PurchaseOrderCreateDto purchaseOrderCreateDto);
    boolean updatePurchaseOrder(PurchaseOrderCreateDto purchaseOrderCreateDto);
    boolean deletePurchaseOrder(Long inputOrderId);

    PurchaseOrderDto findByPurchaseOrderId(Long inputOrderId);

    List<PurchaseOrderDto> findAllPurchaseOrders();
    List<PurchaseOrderDto> searchPurchaseOrders(Specification<PurchaseOrder> specification);
}
