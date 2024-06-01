package io.github.devandref.clean_architecture_study.repository;

import io.github.devandref.clean_architecture_study.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
