package br.com.api.elatrampa.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Objects;


import javax.persistence.*;

@Entity
@Table(name="vagas")
public class Vagas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descricaoVaga", nullable=false, length=250)
	private String descricaoVaga;
	
	@Column(name = "localizacaoVaga", nullable=false, length=1)	
	private String localizacaoVaga;
	
	@Column(name = "experienciaVaga", nullable=false)
	private Integer experienciaVaga;

	@Embedded
	private Profissao profissao;


	@ManyToOne
	@JsonIgnore
	private Candidaturas candidatura;


	public Vagas() {
		
	}

	public Vagas(Long id, String descricaoVaga, String localizacaoVaga, Integer experienciaVaga, Profissao profissao, Candidaturas candidatura) {
		this.id = id;
		this.descricaoVaga = descricaoVaga;
		this.localizacaoVaga = localizacaoVaga;
		this.experienciaVaga = experienciaVaga;
		this.profissao = profissao;
		this.candidatura = candidatura;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVaga() {
		return descricaoVaga;
	}

	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}

	public String getLocalizacaoVaga() {
		return localizacaoVaga;
	}

	public void setLocalizacaoVaga(String localizacaoVaga) {
		this.localizacaoVaga = localizacaoVaga;
	}

	public Integer getExperienciaVaga() {
		return experienciaVaga;
	}

	public void setExperienciaVaga(Integer experienciaVaga) {
		this.experienciaVaga = experienciaVaga;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public Candidaturas getCandidatura() {
		return candidatura;
	}

	public void setCandidatura(Candidaturas candidatura) {
		this.candidatura = candidatura;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Vagas vagas = (Vagas) o;
		return Objects.equals(id, vagas.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
