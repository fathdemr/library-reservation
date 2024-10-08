package com.fatihdemir.libraryreservation.controller;

import com.fatihdemir.libraryreservation.auth.AuthenticationRequest;
import com.fatihdemir.libraryreservation.auth.AuthenticationResponse;
import org.springframework.http.ResponseEntity;

public interface IAuthenticationController {

    public ResponseEntity<AuthenticationResponse> register(AuthenticationRequest request);

    public ResponseEntity<AuthenticationResponse> authenticate();

}
