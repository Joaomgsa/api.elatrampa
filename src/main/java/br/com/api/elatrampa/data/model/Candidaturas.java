package br.com.api.elatrampa.data.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Candidaturas {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pessoaId")
    Pessoas pessoa;

    @ManyToOne
    @JoinColumn(name = "vagaId")
    Vagas vaga;

}
