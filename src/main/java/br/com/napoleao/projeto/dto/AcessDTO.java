package br.com.napoleao.projeto.dto;

public class AcessDTO {

	private String token;

	//TODO implementar retornar o usuario e liberacoes (authorities)
	
	public AcessDTO(String token) {
		super();
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
	
}
