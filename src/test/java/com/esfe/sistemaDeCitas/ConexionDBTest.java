package com.esfe.sistemaDeCitas;

import com.esfe.sistemaDeCitas.domain.model.Usuario;
import com.esfe.sistemaDeCitas.domain.port.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ConexionDBTest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    void probarConexionBaseDatos() {
        Usuario usuario = new Usuario(
                "Prueba Conexion",
                "test@correo.com",
                "1234",
                1,
                "ACTIVO"
        );

        Usuario guardado = usuarioRepository.save(usuario);

        assertThat(guardado).isNotNull();
        assertThat(guardado.getIdUsuario()).isNotNull(); // valida que se generó el ID
        assertThat(guardado.getNombreUsuario()).isEqualTo("Prueba Conexion");
        assertThat(guardado.getIdRol()).isEqualTo(1); // valida que el rol se guardó
    }
}
