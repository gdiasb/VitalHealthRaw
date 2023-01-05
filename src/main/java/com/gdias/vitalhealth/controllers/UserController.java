package com.gdias.vitalhealth.controllers;

import com.gdias.vitalhealth.DTO.UserLoginDTO;
import jakarta.validation.Valid;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/login")
public class UserController {

    private AuthenticationManager authenticationManager;

    public UserController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @PostMapping
    public ResponseEntity loginAPI(@RequestBody @Valid UserLoginDTO loginBody) {

        UsernamePasswordAuthenticationToken userPasswordToken = new UsernamePasswordAuthenticationToken(loginBody.userLogin(),
                loginBody.userPassword());

        Authentication authenticate = authenticationManager.authenticate(userPasswordToken);

        return ResponseEntity.ok().build();

    }
}
