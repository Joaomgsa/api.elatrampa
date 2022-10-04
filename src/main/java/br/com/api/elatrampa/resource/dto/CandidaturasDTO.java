package br.com.api.elatrampa.resource.dto;

import javax.persistence.Embeddable;

@Embeddable
public class CandidaturasDTO {
    private Long vagaId;
    private Long pessoaId;
    private Long candidaturaId;
    private boolean status;

    public CandidaturasDTO() {
    }

    public CandidaturasDTO(Long vagaId, Long pessoaId, Long candidaturaId, boolean status) {
        this.vagaId = vagaId;
        this.pessoaId = pessoaId;
        this.candidaturaId = candidaturaId;
        this.status = status;
    }
}
