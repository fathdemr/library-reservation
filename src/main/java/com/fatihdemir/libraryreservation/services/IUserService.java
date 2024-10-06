package com.fatihdemir.libraryreservation.services;

import com.fatihdemir.libraryreservation.dto.DtoUser;
import com.fatihdemir.libraryreservation.dto.DtoUserIU;

public interface IUserService {

    public DtoUser saveUser(DtoUserIU dtoUserIU);

}
