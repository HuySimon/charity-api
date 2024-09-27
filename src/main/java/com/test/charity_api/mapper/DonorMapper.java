package com.test.charity_api.mapper;

import com.test.charity_api.dto.DonorDTO;
import com.test.charity_api.entity.Donor;

public class DonorMapper {

    public static DonorDTO mapToDonorDto(Donor d) {
        if (d == null) {
            return null;
        }
        DonorDTO dto = new DonorDTO();
        dto.setId(d.getId());
        dto.setName(d.getName());
        dto.setStatus(d.isStatus());
        return dto;
    }
}