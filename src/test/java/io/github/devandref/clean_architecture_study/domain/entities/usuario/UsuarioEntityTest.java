package io.github.devandref.clean_architecture_study.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioEntityTest {

    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456789-99", "André", LocalDate.parse("1990-09-08"), "email@email.com"));
    }

    @Test
    public void deveCriarUsuarioComAFabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("André", "367.387.567-90", LocalDate.parse("2000-01-01"));
        Assertions.assertEquals(usuario.getNome(), "André");
    }

}
