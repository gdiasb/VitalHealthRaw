package com.gdias.vitalhealth.infrastructure.security;

import jakarta.validation.Valid;
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

    private final AuthenticationManager authenticationManager;

    private final TokenService tokenService;

    public UserController(AuthenticationManager authenticationManager, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping
    public ResponseEntity<UserTokenDTO> loginAPI(@RequestBody @Valid UserLoginDTO loginBody) {

        UsernamePasswordAuthenticationToken userPasswordToken = new UsernamePasswordAuthenticationToken(loginBody.userLogin(),
                loginBody.userPassword());

        Authentication authenticate = authenticationManager.authenticate(userPasswordToken);

        UserTokenDTO tokenJWT = tokenService.createUserToken((UserEntity) authenticate.getPrincipal());

        return ResponseEntity.ok(tokenJWT);

    }
}
