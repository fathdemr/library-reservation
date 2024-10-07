package com.fatihdemir.libraryreservation.controller.impl;

import com.fatihdemir.libraryreservation.auth.AuthenticationRequest;
import com.fatihdemir.libraryreservation.auth.AuthenticationResponse;
import com.fatihdemir.libraryreservation.auth.RegisterRequest;
import com.fatihdemir.libraryreservation.services.impl.AuthenticationServiceImpl;
import jdk.jfr.Registered;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationControllerImpl {

    private final AuthenticationServiceImpl authenticationServiceImpl;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
            ){
        return ResponseEntity.ok(authenticationServiceImpl.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(authenticationServiceImpl.authenticate(request));
    }

}
