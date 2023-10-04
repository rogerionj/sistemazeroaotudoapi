package br.com.napoleao.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.napoleao.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
