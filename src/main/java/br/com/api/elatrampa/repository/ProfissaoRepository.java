package br.com.api.elatrampa.repository;

import br.com.api.elatrampa.data.model.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissaoRepository extends JpaRepository<Profissao,Long> {
}
