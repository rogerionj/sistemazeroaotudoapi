package br.com.napoleao.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.napoleao.projeto.entity.UsuarioEntity;
import br.com.napoleao.projeto.entity.enums.TipoSituacaoUsuario;

public class UsuarioDTO {

	private Long id;	
	private String nome;	
	private String login;	
	private String senha;
	private String email;
	private TipoSituacaoUsuario situacao;
	
	public UsuarioDTO(UsuarioEntity usuario) {
		BeanUtils.copyProperties(usuario, this);
	}
	
	public UsuarioDTO() {
		
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public TipoSituacaoUsuario getSituacao() {
		return situacao;
	}

	public void setSituacao(TipoSituacaoUsuario situacao) {
		this.situacao = situacao;
	}
	
}
