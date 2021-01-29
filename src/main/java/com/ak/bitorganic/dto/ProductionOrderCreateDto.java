package com.ak.bitorganic.dto;

import java.util.Date;
import java.util.List;

public class ProductionOrderCreateDto {

    private Long productionOrderNumber;
    private Date productionDate;

    private List<Long> inputBatchIdList;
    private List<BatchCreateDto> outputBatchCreateDtoList;

    public ProductionOrderCreateDto() {
    }

    public ProductionOrderCreateDto(Long productionOrderNumber,
                                    Date productionDate,
                                    List<Long> inputBatchIdList,
                                    List<BatchCreateDto> outputBatchCreateDtoList) {
        this.productionOrderNumber = productionOrderNumber;
        this.productionDate = productionDate;
        this.inputBatchIdList = inputBatchIdList;
        this.outputBatchCreateDtoList = outputBatchCreateDtoList;
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

    public List<Long> getInputBatchIdList() {
        return inputBatchIdList;
    }

    public void setInputBatchIdList(List<Long> inputBatchIdList) {
        this.inputBatchIdList = inputBatchIdList;
    }

    public List<BatchCreateDto> getOutputBatchCreateDtoList() {
        return outputBatchCreateDtoList;
    }

    public void setOutputBatchCreateDtoList(List<BatchCreateDto> outputBatchCreateDtoList) {
        this.outputBatchCreateDtoList = outputBatchCreateDtoList;
    }
}
