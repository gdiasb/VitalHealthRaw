package com.gdias.vitalhealth.DTO;

import com.gdias.vitalhealth.common.DoctorSpecialty;
import com.gdias.vitalhealth.domain.DoctorEntity;

public record DoctorListDTO(
        String username,
        boolean activeStatus,
        String fullName,
        DoctorSpecialty doctorSpecialty,
        String doctorLicense

) {
    public DoctorListDTO(DoctorEntity doctorEntity) {
        this(doctorEntity.getUsername(), doctorEntity.getActiveStatus(),
                doctorEntity.getFullName(), doctorEntity.getDoctorSpecialty(),
                doctorEntity.getDoctorLicense());
    }
}
