package br.com.napoleao.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.napoleao.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{

}
