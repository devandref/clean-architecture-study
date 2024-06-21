package io.github.devandref.clean_architecture_study.application.usecases;

import io.github.devandref.clean_architecture_study.application.gateway.RepositorioDeUsuario;
import io.github.devandref.clean_architecture_study.domain.entities.usuario.Usuario;

public class CriarUsuarioUseCase {

    private final RepositorioDeUsuario repositorioDeUsuario;

    public CriarUsuarioUseCase(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return this.repositorioDeUsuario.cadastrarUsuario(usuario);
    }

}
