package br.com.api.elatrampa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.elatrampa.data.model.Vagas;
import org.springframework.stereotype.Repository;

@Repository
public interface VagasRepository extends JpaRepository<Vagas,Long>{

}
