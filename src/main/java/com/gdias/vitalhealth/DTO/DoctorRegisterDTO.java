package com.gdias.vitalhealth.DTO;

import com.gdias.vitalhealth.common.DoctorSpecialty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record DoctorRegisterDTO(
        @NotBlank
        @Size(min = 4)
        String username,
        int activeStatus,
        @NotBlank
        String fullName,
        @NotBlank
        String email,
        @NotBlank
        String gender,
        @NotNull
        DoctorSpecialty doctorSpecialty,
        @NotNull @Pattern(regexp = "\\d{6}")
        String doctorLicense,
        @NotNull @Valid AddressDTO address
) {
}
