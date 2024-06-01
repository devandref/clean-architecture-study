package io.github.devandref.clean_architecture_study.service;

import io.github.devandref.clean_architecture_study.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    List<Usuario> findAll();
    void save(Usuario usuario);
}
