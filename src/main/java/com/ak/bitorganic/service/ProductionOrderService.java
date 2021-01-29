package com.ak.bitorganic.service;

import com.ak.bitorganic.domain.ProductionOrder;
import com.ak.bitorganic.dto.ProductionOrderCreateDto;
import com.ak.bitorganic.dto.ProductionOrderDto;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface ProductionOrderService {

    boolean saveProductionOrder(ProductionOrderCreateDto productionOrderCreateDto);
    boolean updateProductionOrder(ProductionOrderCreateDto productionOrderCreateDto);
    boolean deleteProductionOrder(Long productionOrderId);

    ProductionOrderDto findByProductionOrderId(Long productionOrderId);

    List<ProductionOrderDto> findAllProductionOrders();
    List<ProductionOrderDto> searchProductionOrders(Specification<ProductionOrder> specification);

}
