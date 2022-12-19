package com.gdias.vitalhealth.DTO;

import jakarta.validation.constraints.*;

public record AddressDTO(
        @NotBlank
        String streetSuffix,
        @NotBlank
        String streetName,
        @Digits(integer = 4, fraction = 0)
        @Min(0)
        String streetNumber,
        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String postalCode,
        @NotBlank
        @Size(min = 2, max = 2)
        String state
) {
}
