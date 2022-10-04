package br.com.api.elatrampa.repository;

import br.com.api.elatrampa.data.model.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissaoRepository extends JpaRepository<Profissao,Long> {
}
