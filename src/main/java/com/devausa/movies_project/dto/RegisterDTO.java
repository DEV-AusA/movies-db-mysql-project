package com.devausa.movies_project.dto;

public record RegisterDTO(
        Long id,
        String name,
        String lastName,
        Integer telephone,
        String email,
        String password
) {
}
