package com.esfe.sistemaDeCitas.domain.port;

import com.esfe.sistemaDeCitas.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
