package com.gdias.vitalhealth.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserLoginDTO(
        @NotBlank @Size(min=4)
        String userLogin,
        @NotBlank @Size(min = 6)
        String userPassword) {
}
