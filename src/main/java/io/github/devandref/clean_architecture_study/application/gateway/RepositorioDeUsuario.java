package io.github.devandref.clean_architecture_study.application.gateway;

import io.github.devandref.clean_architecture_study.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {

    Usuario cadastrarUsuario(Usuario usuario);
    List<Usuario> listarTodos();

}
