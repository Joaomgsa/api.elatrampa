package br.com.api.elatrampa.data.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="candidaturas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Candidaturas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pessoas pessoa;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Vagas> vagas;

    private boolean status;
    public Candidaturas() {

    }

    public Candidaturas(Long id, Pessoas pessoa, List<Vagas> vagas, boolean status) {
        this.id = id;
        this.pessoa = pessoa;
        this.vagas = vagas;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoas getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoas pessoa) {
        this.pessoa = pessoa;
    }

    public List<Vagas> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vagas> vagas) {
        this.vagas = vagas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}


