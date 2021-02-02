package com.tutorial.crud.security.service;

import com.tutorial.crud.security.entity.Usuario;
import com.tutorial.crud.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository repo;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return repo.findByNombreUsuario(nombreUsuario);
    }

    public boolean existByNombreUsuario(String nombreUsuario){
        return repo.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existByEmail(String email){
        return repo.existsByNombreUsuario(email);
    }

    public void save(Usuario usuario){
        repo.save(usuario);
    }
}
