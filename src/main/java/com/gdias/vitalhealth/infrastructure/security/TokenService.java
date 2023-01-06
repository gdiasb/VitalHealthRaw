package com.gdias.vitalhealth.infrastructure.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

// Environment Variable
    @Value("${api.vitalhealth.secretTokenJWT}")
    private String secretTokenJWT;

    public UserTokenDTO createUserToken(UserEntity userEntity) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secretTokenJWT);
            String token = JWT.create()
                    .withIssuer("VitalHealth API")
                    .withSubject(userEntity.getUsername())
                    .withExpiresAt(defineTokenExpiration())
                    .sign(algorithm);
            return new UserTokenDTO(token);
        } catch (JWTCreationException exception){
            throw new RuntimeException("Token creation failed. ", exception);
        }

    }

    private Instant defineTokenExpiration() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }

}