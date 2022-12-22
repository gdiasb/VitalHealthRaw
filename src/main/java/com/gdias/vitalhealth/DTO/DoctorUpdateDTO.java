package com.gdias.vitalhealth.DTO;

public record DoctorUpdateDTO(
        String username,
        String fullName,
        String email,
        AddressDTO address
) {
}
