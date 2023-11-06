package br.com.napoleao.projeto.dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.napoleao.projeto.entity.RecursoEntity;

public class RecursoDTO {

	private Long id;
	private String nome;
	private String chave;
	
	public RecursoDTO() {
		
	}
	
	public RecursoDTO(RecursoEntity recurso) {
		BeanUtils.copyProperties(recurso, this);
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecursoDTO other = (RecursoDTO) obj;
		return Objects.equals(id, other.id);
	}
	
}
