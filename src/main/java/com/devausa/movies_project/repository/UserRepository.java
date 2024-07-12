package com.devausa.movies_project.repository;

import com.devausa.movies_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
