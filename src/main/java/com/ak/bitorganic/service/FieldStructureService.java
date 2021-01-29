package com.ak.bitorganic.service;

import com.ak.bitorganic.dto.FieldStructureCreateDto;
import com.ak.bitorganic.dto.FieldStructureDto;

public interface FieldStructureService {

    boolean saveFieldStructure(FieldStructureCreateDto fieldStructureCreateDto);
    boolean updateFieldStructure(FieldStructureCreateDto fieldStructureCreateDto);
    boolean deleteFieldStructure(Long fieldStructureId);

    FieldStructureDto findByFieldStructureId(Long fieldStructureId);
}
