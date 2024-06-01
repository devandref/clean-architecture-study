package io.github.devandref.clean_architecture_study.controller;

import io.github.devandref.clean_architecture_study.model.Usuario;
import io.github.devandref.clean_architecture_study.model.dto.NovoUsuarioDTO;
import io.github.devandref.clean_architecture_study.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/v1/lista-usuarios")
    public List<Usuario> listaUsuarios() {
        return usuarioService.findAll();
    }

    @PostMapping("/v1/cria-usuarios")
    public ResponseEntity criaUsuarios(@RequestBody NovoUsuarioDTO novoUsuarioDTO, UriComponentsBuilder uriComponent) {
        Usuario usuario = NovoUsuarioDTO.dtoToEntity(novoUsuarioDTO);
        usuario.setId(UUID.randomUUID());
        usuarioService.save(usuario);
        var uri = uriComponent.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(usuario);
    }
}
