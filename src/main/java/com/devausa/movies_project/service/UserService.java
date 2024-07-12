package com.devausa.movies_project.service;

import com.devausa.movies_project.dto.RegisterDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public RegisterDTO newUserRegister(RegisterDTO registerDTO) {
        return registerDTO;
    }
}
