package br.com.api.elatrampa.resource.dto;

import javax.persistence.Embeddable;

@Embeddable
public class VagaDTO {
    private long profissaoID;
    private String descricaoVaga;
    private String localizacaoVaga;
    private Integer experienciaVaga;


}
