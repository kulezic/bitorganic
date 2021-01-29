package com.ak.bitorganic.service;

import com.ak.bitorganic.domain.Batch;
import com.ak.bitorganic.dto.BatchCreateDto;
import com.ak.bitorganic.dto.BatchDto;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface BatchService {

    boolean saveBatch(BatchCreateDto batchCreateDto);
    boolean updateBatch(BatchCreateDto batchCreateDto);
    boolean deleteBatch(Long batchId);

    BatchDto findByBatchId(Long batchId);

    List<BatchDto> findAllBatches();
    List<BatchDto> searchBatches(Specification<Batch> specification);
}
