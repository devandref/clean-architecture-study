package io.github.devandref.clean_architecture_study.infra.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record UsuarioDTO(
        String cpf,
        String nome,
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataNascimento,
        String email) {
}
