package br.com.napoleao.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.napoleao.projeto.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long>{

}
