package com.gdias.vitalhealth.DTO;

public record DoctorUpdateDTO(
        String username,
        int activeStatus,
        String fullName,
        String email,
        AddressDTO address
) {
}
