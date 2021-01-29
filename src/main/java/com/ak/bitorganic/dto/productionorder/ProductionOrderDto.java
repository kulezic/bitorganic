package com.ak.bitorganic.dto.productionorder;

import com.ak.bitorganic.dto.batch.BatchDto;

import java.util.Date;
import java.util.List;

public class ProductionOrderDto {
    private Long productionOrderId;

    private Long productionOrderNumber;
    private Date productionDate;

    private List<BatchDto> inputBatchDtoList;
    private List<BatchDto> outputBatchDtoList;

    public ProductionOrderDto() {
    }

    public ProductionOrderDto(Long productionOrderId,
                              Long productionOrderNumber,
                              Date productionDate,
                              List<BatchDto> inputBatchDtoList,
                              List<BatchDto> outputBatchDtoList) {
        this.productionOrderId = productionOrderId;
        this.productionOrderNumber = productionOrderNumber;
        this.productionDate = productionDate;
        this.inputBatchDtoList = inputBatchDtoList;
        this.outputBatchDtoList = outputBatchDtoList;
    }

    public Long getProductionOrderId() {
        return productionOrderId;
    }

    public void setProductionOrderId(Long productionOrderId) {
        this.productionOrderId = productionOrderId;
    }

    public Long getProductionOrderNumber() {
        return productionOrderNumber;
    }

    public void setProductionOrderNumber(Long productionOrderNumber) {
        this.productionOrderNumber = productionOrderNumber;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public List<BatchDto> getInputBatchDtoList() {
        return inputBatchDtoList;
    }

    public void setInputBatchDtoList(List<BatchDto> inputBatchDtoList) {
        this.inputBatchDtoList = inputBatchDtoList;
    }

    public List<BatchDto> getOutputBatchDtoList() {
        return outputBatchDtoList;
    }

    public void setOutputBatchDtoList(List<BatchDto> outputBatchDtoList) {
        this.outputBatchDtoList = outputBatchDtoList;
    }
}
