package com.fatihdemir.libraryreservation.controller.impl;

import com.fatihdemir.libraryreservation.controller.IUserController;
import com.fatihdemir.libraryreservation.dto.DtoUser;
import com.fatihdemir.libraryreservation.dto.DtoUserIU;
import com.fatihdemir.libraryreservation.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/user")
public class StudentControllerImpl implements IUserController {

    @Autowired
    private IUserService userService;

    @PostMapping(path = "/login")
    @Override
    public DtoUser saveUser(@RequestBody DtoUserIU dtoUserIU) {
        return userService.saveUser(dtoUserIU);
    }





}
