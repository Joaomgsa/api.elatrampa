package br.com.api.elatrampa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.elatrampa.data.model.Pessoas;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas,Long>{

}
