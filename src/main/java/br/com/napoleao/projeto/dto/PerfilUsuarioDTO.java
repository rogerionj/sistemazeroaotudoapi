package br.com.napoleao.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.napoleao.projeto.entity.PerfilUsuarioEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PerfilUsuarioDTO {

	private Long id;
	private UsuarioDTO usuario;
	private PerfilDTO perfil;
	
	public PerfilUsuarioDTO(PerfilUsuarioEntity perfilUsuario) {
		BeanUtils.copyProperties(perfilUsuario, this);
		if(perfilUsuario != null && perfilUsuario.getUsuario() != null) {
			this.usuario = new UsuarioDTO(perfilUsuario.getUsuario());
		}
		if(perfilUsuario != null && perfilUsuario.getPerfil() != null) {
			this.perfil = new PerfilDTO(perfilUsuario.getPerfil());
		}		
	}
	
}
