package br.com.api.elatrampa.services;

import br.com.api.elatrampa.data.model.Candidaturas;
import br.com.api.elatrampa.data.model.Vagas;
import br.com.api.elatrampa.resource.dto.VagaDTO;

public interface CandidaturasServices {
    Vagas incluirVaga(VagaDTO vagaDTO);
    Candidaturas verCandidatura(Long id);
}
