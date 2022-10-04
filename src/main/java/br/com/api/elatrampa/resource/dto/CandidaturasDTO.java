package br.com.api.elatrampa.resource.dto;

import javax.persistence.Embeddable;

@Embeddable
public class CandidaturasDTO {
    private Long vagaId;
    private Long pessoaId;
    private Long id;
    private boolean inativo = false;

    public CandidaturasDTO() {
    }

    public CandidaturasDTO(Long vagaId, Long pessoaId, Long id, boolean inativo) {
        this.vagaId = vagaId;
        this.pessoaId = pessoaId;
        this.id = id;
        this.inativo = inativo;
    }

    public static class Builder{
        private Long vagaId;
        private Long pessoaId;
        private Long id;
        private boolean status;
    }
}
