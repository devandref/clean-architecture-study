package io.github.devandref.clean_architecture_study.infra.gateway;

import io.github.devandref.clean_architecture_study.application.gateway.RepositorioDeUsuario;
import io.github.devandref.clean_architecture_study.domain.entities.usuario.Usuario;
import io.github.devandref.clean_architecture_study.infra.persistence.UsuarioRepository;
import io.github.devandref.clean_architecture_study.infra.persistence.UsuarioEntity;

import java.util.List;

public class RepositorioDeUsuarioJPA implements RepositorioDeUsuario {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper mapper;

    public RepositorioDeUsuarioJPA(UsuarioRepository usuarioRepository, UsuarioEntityMapper usuarioEntityMapper) {
        this.usuarioRepository = usuarioRepository;
        this.mapper = usuarioEntityMapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = mapper.toEntity(usuario);
        this.usuarioRepository.save(entity);
        return mapper.toDomain(entity);
    }


    @Override
    public List<Usuario> listarTodos() {
      // return usuarioRepository.findAll();
        return List.of();
    }

}
