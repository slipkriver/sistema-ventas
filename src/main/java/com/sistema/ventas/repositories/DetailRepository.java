package com.sistema.ventas.repositories;

import com.sistema.ventas.entities.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
