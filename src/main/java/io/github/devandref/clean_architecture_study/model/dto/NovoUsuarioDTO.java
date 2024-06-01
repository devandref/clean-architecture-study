package io.github.devandref.clean_architecture_study.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.devandref.clean_architecture_study.model.Usuario;

import java.time.LocalDate;


public class NovoUsuarioDTO {

    private String cpf;
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;
    private String email;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Usuario dtoToEntity(NovoUsuarioDTO novoUsuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setCpf(novoUsuarioDTO.getCpf());
        usuario.setNome(novoUsuarioDTO.getNome());
        usuario.setEmail(novoUsuarioDTO.getEmail());
        usuario.setDataNascimento(novoUsuarioDTO.getDataNascimento());
        return usuario;
    }
}
