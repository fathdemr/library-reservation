package com.fatihdemir.libraryreservation.services.impl;

import com.fatihdemir.libraryreservation.dto.DtoUser;
import com.fatihdemir.libraryreservation.dto.DtoUserIU;
import com.fatihdemir.libraryreservation.entity.User;
import com.fatihdemir.libraryreservation.repository.UserRepository;
import com.fatihdemir.libraryreservation.security.Hash;
import com.fatihdemir.libraryreservation.services.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public DtoUser saveUser(DtoUserIU dtoUserIU) {

        DtoUser response = new DtoUser();
        User user = new User();
        Hash hash = new Hash();

        try {
            user.setHash(hash.HashMD5(dtoUserIU.getStudNum()));
        }catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());;
        }

        BeanUtils.copyProperties(dtoUserIU, user);

        User dbUser = userRepository.save(user);
        BeanUtils.copyProperties(dbUser, response);

        return response;
    }
}
