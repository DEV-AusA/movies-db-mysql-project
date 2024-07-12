package com.devausa.movies_project.service;

import com.devausa.movies_project.dto.MessageDTO;
import com.devausa.movies_project.dto.RegisterDTO;
import com.devausa.movies_project.model.User;
import com.devausa.movies_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public MessageDTO newUserRegister(RegisterDTO registerDTO) {
        User user = new User();
        user.setName(registerDTO.name());
        user.setLastName(registerDTO.lastName());
        user.setTelephone(registerDTO.telephone());
        user.setEmail(registerDTO.email());
        user.setPassword(registerDTO.password());

        userRepository.save(user);
        return new MessageDTO("Gracias por registrarte, ¡Bienvenido a +Plus!");
    }
}
