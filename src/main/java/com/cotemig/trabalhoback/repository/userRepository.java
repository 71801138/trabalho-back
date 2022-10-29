package com.cotemig.trabalhoback.repository;

import com.cotemig.trabalhoback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Long> {
}