package com.sistema.ventas.repositories;

import com.sistema.ventas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
