package com.fatihdemir.libraryreservation.services;

import com.fatihdemir.libraryreservation.auth.AuthenticationRequest;
import com.fatihdemir.libraryreservation.auth.AuthenticationResponse;
import com.fatihdemir.libraryreservation.auth.RegisterRequest;

public interface IAuthenticationService {

    public AuthenticationResponse register(RegisterRequest request);

    public AuthenticationResponse authenticate(AuthenticationRequest request);

}
