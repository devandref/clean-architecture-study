package io.github.devandref.clean_architecture_study.infra.gateway;

import io.github.devandref.clean_architecture_study.domain.entities.usuario.Usuario;
import io.github.devandref.clean_architecture_study.infra.persistence.UsuarioEntity;

public class UsuarioEntityMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getCpf(), usuario.getNome(), usuario.getDataNascimento(), usuario.getEmail());
    }

    public Usuario toDomain(UsuarioEntity usuario) {
        return new Usuario(usuario.getCpf(), usuario.getNome(), usuario.getDataNascimento(), usuario.getEmail());
    }

}
