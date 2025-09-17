package com.hospital.agendamento.repository;

import com.hospital.agendamento.model.Usuario;
import com.hospital.common.enums.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
    Optional<Usuario> findByEmail(String email);
    List<Usuario> findByTipoUsuario(TipoUsuario tipoUsuario);
    List<Usuario> findByTipoUsuarioAndAtivoTrue(TipoUsuario tipoUsuario);
}