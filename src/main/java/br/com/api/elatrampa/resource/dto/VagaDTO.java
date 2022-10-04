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
public class VagaDTO {
    private Long profissaoId;
    private String descricaoVaga;
    private String localizacaoVaga;
    private Integer experienciaVaga;
    private Long candidaturaId;

}
