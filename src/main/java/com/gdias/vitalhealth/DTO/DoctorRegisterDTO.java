package com.gdias.vitalhealth.DTO;

import com.gdias.vitalhealth.common.DoctorSpecialty;

public record DoctorRegisterDTO(
        String username,
        int activeStatus,
        String fullName,
        String email,
        String gender,
        DoctorSpecialty doctorSpecialty,
        String doctorLicense,
        AddressDTO address
) {
}
