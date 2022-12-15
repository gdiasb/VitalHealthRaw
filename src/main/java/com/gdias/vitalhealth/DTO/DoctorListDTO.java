package com.gdias.vitalhealth.DTO;

import com.gdias.vitalhealth.common.DoctorSpecialty;
import com.gdias.vitalhealth.entities.DoctorEntity;

public record DoctorListDTO(
        String username,
        int activeStatus,
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
