package br.com.api.elatrampa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.elatrampa.data.model.Vagas;

public interface VagasRepository extends JpaRepository<Vagas,Long>{

}
