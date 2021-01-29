package com.ak.bitorganic.service.impl;

import com.ak.bitorganic.domain.Batch;
import com.ak.bitorganic.dto.batch.BatchCreateDto;
import com.ak.bitorganic.dto.batch.BatchDto;
import com.ak.bitorganic.repository.BatchRepository;
import com.ak.bitorganic.service.BatchService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchServiceImpl implements BatchService {

    private BatchRepository batchRepository;

    public BatchServiceImpl(BatchRepository batchRepository) {
        this.batchRepository = batchRepository;
    }

    @Override
    public boolean saveBatch(BatchCreateDto batchCreateDto) {

        return false;
    }

    @Override
    public boolean updateBatch(BatchCreateDto batchCreateDto) {
        return false;
    }

    @Override
    public boolean deleteBatch(Long batchId) {
        Long isDeleted = batchRepository.deleteByBatchId(batchId);
        if (isDeleted > 0) return true;
        return false;
    }

    @Override
    public BatchDto findByBatchId(Long batchId) {
        Batch batch = batchRepository.findByBatchId(batchId).get();
        return null;
    }

    @Override
    public List<BatchDto> findAllBatches() {
        return null;
    }

    @Override
    public List<BatchDto> searchBatches(Specification<Batch> specification) {
        return null;
    }
}
