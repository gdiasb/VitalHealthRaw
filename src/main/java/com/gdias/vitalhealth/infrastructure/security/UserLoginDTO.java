package com.gdias.vitalhealth.infrastructure.security;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserLoginDTO(
        @NotBlank @Size(min=4)
        String userLogin,
        @NotBlank @Size(min = 6)
        String userPassword) {
}
