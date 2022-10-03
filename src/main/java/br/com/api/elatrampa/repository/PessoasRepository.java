package br.com.api.elatrampa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.elatrampa.data.model.Pessoas;

public interface PessoasRepository extends JpaRepository<Pessoas,Long>{

}
