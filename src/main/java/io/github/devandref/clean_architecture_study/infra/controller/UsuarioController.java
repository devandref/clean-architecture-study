package io.github.devandref.clean_architecture_study.infra.controller;

import io.github.devandref.clean_architecture_study.application.usecases.CriarUsuarioUseCase;
import io.github.devandref.clean_architecture_study.domain.entities.usuario.Usuario;
import io.github.devandref.clean_architecture_study.infra.controller.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuarioUseCase criarUsuarioUseCase;

    public UsuarioController(CriarUsuarioUseCase criarUsuarioUseCase) {
        this.criarUsuarioUseCase = criarUsuarioUseCase;
    }

    @PostMapping
    public UsuarioDTO cadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usuarioSalvo = criarUsuarioUseCase.cadastrarUsuario(new Usuario(usuarioDTO.cpf(), usuarioDTO.nome(), usuarioDTO.dataNascimento(), usuarioDTO.email()));
        return new UsuarioDTO(usuarioSalvo.getCpf(), usuarioSalvo.getNome(), usuarioSalvo.getDataNascimento(), usuarioSalvo.getEmail());
    }
}
