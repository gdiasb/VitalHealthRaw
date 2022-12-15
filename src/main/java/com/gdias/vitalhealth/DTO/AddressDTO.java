package com.gdias.vitalhealth.DTO;

public record AddressDTO(
        String streetSuffix,
        String streetName,
        String streetNumber,
        String postalCode,
        String state
) {}
