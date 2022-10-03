package br.com.api.elatrampa.repository;

import br.com.api.elatrampa.data.model.Candidaturas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidaturasRepository extends JpaRepository<Candidaturas,Long> {
}
