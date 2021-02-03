package com.tutorial.crud.security.repository;

import com.tutorial.crud.security.entity.Rol;
import com.tutorial.crud.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol,Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
