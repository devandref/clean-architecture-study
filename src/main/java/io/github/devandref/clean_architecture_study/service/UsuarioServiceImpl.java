package io.github.devandref.clean_architecture_study.service;

import io.github.devandref.clean_architecture_study.model.Usuario;
import io.github.devandref.clean_architecture_study.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public void save(Usuario usuario) {
        this.usuarioRepository.save(usuario);
    }
}
