package com.fatihdemir.libraryreservation.controller;

import com.fatihdemir.libraryreservation.dto.DtoUser;
import com.fatihdemir.libraryreservation.dto.DtoUserIU;

public interface IUserController {

    public DtoUser saveUser(DtoUserIU dtoUserIU);

}
