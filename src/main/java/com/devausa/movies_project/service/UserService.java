package com.devausa.movies_project.service;

import com.devausa.movies_project.dto.MessageDTO;
import com.devausa.movies_project.dto.RegisterDTO;
import com.devausa.movies_project.dto.UserDTO;
import com.devausa.movies_project.model.User;
import com.devausa.movies_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public MessageDTO newUserRegister(RegisterDTO registerDTO) {
        //busco por email
        Optional<User> userFinded = userRepository.findByEmail(registerDTO.email());

        if (userFinded.isPresent()) {
            return new MessageDTO("Error ya existe alguien registrado con ese correo");
        }

        User user = new User();
        user.setName(registerDTO.name());
        user.setLastName(registerDTO.lastName());
        user.setTelephone(registerDTO.telephone());
        user.setEmail(registerDTO.email());
        user.setPassword(registerDTO.password());

        userRepository.save(user);
        return new MessageDTO("Gracias por registrarte, ¡Bienvenido a +Play!");
    }

    private UserDTO getUserByEmail(String email) {
        Optional<User> user =userRepository.findByEmail(email);
        if(user.isPresent()) {
            User u = user.get();
            return new UserDTO( u.getId(), u.getName(), u.getLastName(), u.getTelephone(), u.getEmail());
        }
        return null;
    }
}
