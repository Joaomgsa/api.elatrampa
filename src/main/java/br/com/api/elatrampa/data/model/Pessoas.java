package br.com.api.elatrampa.data.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import br.com.api.elatrampa.data.model.Candidaturas;

import br.com.api.elatrampa.data.model.Pessoas;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="Pessoa")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pessoas implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pessoaId;
	
	@Column(name = "nomePessoa", nullable=false, length=180)
	private String nomePessoa;

	@Column(name = "localizacaoPessoa", nullable=false, length=1)
	private String localizacaoPessoa;
	
	@Column(name = "nivelExperienciaPessoa", nullable=false, length=180)	
	private String nivelExperienciaPessoa;

	@Embedded
	private Profissao profissao;


	public Pessoas() {

	}

	public Pessoas(Long pessoaId, String nomePessoa, String localizacaoPessoa, String nivelExperienciaPessoa, Profissao profissao) {
		this.pessoaId = pessoaId;
		this.nomePessoa = nomePessoa;
		this.localizacaoPessoa = localizacaoPessoa;
		this.nivelExperienciaPessoa = nivelExperienciaPessoa;
		this.profissao = profissao;
	}

	public Long getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getLocalizacaoPessoa() {
		return localizacaoPessoa;
	}

	public void setLocalizacaoPessoa(String localizacaoPessoa) {
		this.localizacaoPessoa = localizacaoPessoa;
	}

	public String getNivelExperienciaPessoa() {
		return nivelExperienciaPessoa;
	}

	public void setNivelExperienciaPessoa(String nivelExperienciaPessoa) {
		this.nivelExperienciaPessoa = nivelExperienciaPessoa;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pessoas pessoas = (Pessoas) o;
		return Objects.equals(pessoaId, pessoas.pessoaId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pessoaId);
	}
}