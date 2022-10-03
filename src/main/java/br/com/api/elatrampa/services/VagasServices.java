package br.com.api.elatrampa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.elatrampa.data.model.Vagas;
import br.com.api.elatrampa.exception.ResourceNotFoundException;
import br.com.api.elatrampa.repository.VagasRepository;


@Service
public class VagasServices {
	
	@Autowired
	private VagasRepository repository;
	
	public List<Vagas> buscaTodos(){
		return repository.findAll();
		
	}
	
	public Vagas salvar(Vagas vaga) {
		return repository.save(vaga);
	}
	
	public void delete(Long id) {
		Vagas entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pessoa Não Encontrada nesse ID"));
				repository.delete(entity);
	}

}
