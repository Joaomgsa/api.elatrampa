package br.com.api.elatrampa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.elatrampa.data.model.Pessoas;
import br.com.api.elatrampa.services.PessoaServices;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoasController {
	
	@Autowired
	private PessoaServices service;
	
	@GetMapping
	public ResponseEntity<List<Pessoas>> buscarTodos() {
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@PostMapping
	public ResponseEntity<Pessoas> salvar(@RequestBody Pessoas pessoa) {
		var novaPessoa = service.salvar(pessoa);
		return new ResponseEntity<>(novaPessoa, null, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{pessoaId}")
	public ResponseEntity<Void> remover(@PathVariable Long pessoaId){
		service.delete(pessoaId);
		return ResponseEntity.ok().build();
	}

}
