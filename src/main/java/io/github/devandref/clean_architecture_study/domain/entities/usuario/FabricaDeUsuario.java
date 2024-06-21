package io.github.devandref.clean_architecture_study.domain.entities.usuario;

import io.github.devandref.clean_architecture_study.domain.Endereco;

import java.time.LocalDate;

public class FabricaDeUsuario {

    private Usuario usuario;

    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento) {
        return this.usuario = new Usuario(cpf, nome, nascimento, "");
    }

    private Usuario incluiEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
        return this.usuario;
    }

}
