package br.com.napoleao.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.napoleao.projeto.dto.PermissaoPerfilRecursoDTO;
import br.com.napoleao.projeto.service.PermissaoPerfilRecursoService;

@RestController
@RequestMapping(value = "/permissao-perfil-recurso")
@CrossOrigin
public class PermissaoPerfilRecursoController {

	@Autowired
	private PermissaoPerfilRecursoService permissaoPerfilRecursoService;
	
	@GetMapping
	public List<PermissaoPerfilRecursoDTO> listarTodos(){
		return permissaoPerfilRecursoService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
		permissaoPerfilRecursoService.inserir(permissaoPerfilRecurso);
	}
	
	@PutMapping
	public PermissaoPerfilRecursoDTO alterar(@RequestBody PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
		return permissaoPerfilRecursoService.alterar(permissaoPerfilRecurso);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
		permissaoPerfilRecursoService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
