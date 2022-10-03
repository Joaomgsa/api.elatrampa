package br.com.api.elatrampa.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.elatrampa.repository.PessoasRepository;
import br.com.api.elatrampa.data.model.Pessoas;
import br.com.api.elatrampa.exception.ResourceNotFoundException;

@Service
public class PessoaServices {
	
	@Autowired
	private PessoasRepository repository;
	
	public List<Pessoas> buscarTodos() {
		return repository.findAll();
	}
	
	public Pessoas salvar(Pessoas pessoa) {
		return repository.save(pessoa);
	}
	
	public void delete(Long pessoaId) {
		Pessoas entity = repository.findById(pessoaId)
				.orElseThrow(() -> new ResourceNotFoundException("Pessoa Não Encontrada nesse ID"));
		repository.delete(entity);
	}
}

