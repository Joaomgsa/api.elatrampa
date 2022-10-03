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

import br.com.api.elatrampa.data.model.Vagas;
import br.com.api.elatrampa.services.VagasServices;

@RestController
@RequestMapping(value = "/vagas")
public class VagasController {
	
	@Autowired
	private VagasServices service;
	
	@GetMapping
	public ResponseEntity<List<Vagas>> buscarTodos() {
		return ResponseEntity.ok(service.buscaTodos());
	}
	
	@PostMapping
	public ResponseEntity<Vagas> salvar(@RequestBody Vagas vaga) {
		var novaVaga = service.salvar(vaga);
		return new ResponseEntity<>(novaVaga, null, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.ok().build();
	}
	

}
