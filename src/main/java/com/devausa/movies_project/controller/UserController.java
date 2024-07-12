package com.devausa.movies_project.controller;

import com.devausa.movies_project.dto.MessageDTO;
import com.devausa.movies_project.dto.RegisterDTO;
import com.devausa.movies_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public MessageDTO newRegister(@RequestBody RegisterDTO registerDTO){
        return service.newUserRegister(registerDTO);
    }
}
