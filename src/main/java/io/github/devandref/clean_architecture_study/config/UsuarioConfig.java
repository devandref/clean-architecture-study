package io.github.devandref.clean_architecture_study.config;

import io.github.devandref.clean_architecture_study.application.gateway.RepositorioDeUsuario;
import io.github.devandref.clean_architecture_study.application.usecases.CriarUsuarioUseCase;
import io.github.devandref.clean_architecture_study.infra.gateway.RepositorioDeUsuarioJPA;
import io.github.devandref.clean_architecture_study.infra.gateway.UsuarioEntityMapper;
import io.github.devandref.clean_architecture_study.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuarioUseCase criarUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        return new CriarUsuarioUseCase(repositorioDeUsuario);
    }

    @Bean
    RepositorioDeUsuarioJPA criarRepositorioJPA(UsuarioRepository usuarioRepository, UsuarioEntityMapper usuarioEntityMapper) {
        return new RepositorioDeUsuarioJPA(usuarioRepository, usuarioEntityMapper);
    }

    @Bean
    UsuarioEntityMapper usuarioEntityMapper() {
        return new UsuarioEntityMapper();
    }

}
