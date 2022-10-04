package br.com.api.elatrampa.data.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class Profissao {

    private static final long serialVersionUID =1L;

    @Id
    private Long profissaoId;

    @Column(name = "tituloProfissao", nullable=false, length=240)
    private String tituloProfissao;

    public Profissao() {

    }

    public Profissao(Long profissaoId, String tituloProfissao) {
        this.profissaoId = profissaoId;
        this.tituloProfissao = tituloProfissao;
    }

    public Long getProfissaoId() {
        return profissaoId;
    }

    public void setProfissaoId(Long profissaoId) {
        this.profissaoId = profissaoId;
    }

    public String getTituloProfissao() {
        return tituloProfissao;
    }

    public void setTituloProfissao(String tituloProfissao) {
        this.tituloProfissao = tituloProfissao;
    }
}
