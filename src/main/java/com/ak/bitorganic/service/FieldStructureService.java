package com.ak.bitorganic.service;

import com.ak.bitorganic.dto.fieldstructure.FieldStructureCreateDto;
import com.ak.bitorganic.dto.fieldstructure.FieldStructureDto;

public interface FieldStructureService {

    boolean saveFieldStructure(FieldStructureCreateDto fieldStructureCreateDto);
    boolean updateFieldStructure(FieldStructureCreateDto fieldStructureCreateDto);
    boolean deleteFieldStructure(Long fieldStructureId);

    FieldStructureDto findByFieldStructureId(Long fieldStructureId);
}
