package com.devausa.movies_project.dto;

public record UserDTO(
        Long id,
        String name,
        String lastName,
        Integer telephone,
        String email
) {
}
