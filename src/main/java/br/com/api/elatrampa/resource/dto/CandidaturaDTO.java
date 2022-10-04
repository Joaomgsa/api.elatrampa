package br.com.api.elatrampa.resource.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor
public class CandidaturaDTO {

    private Long candidaturaId;
    private Long vagaId;
    private Long pessoaId;
    private boolean inativo;
}
