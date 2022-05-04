package Grupo14.trabalhoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Grupo14.trabalhoapi.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}