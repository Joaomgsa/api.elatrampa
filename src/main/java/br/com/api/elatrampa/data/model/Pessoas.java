package br.com.api.elatrampa.data.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="Pessoa")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pessoas implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pessoaId;
	private String nomePessoa;
	private String localizacaoPessoa;
	private String nivelExperienciaPessoa;

	@Embedded
	private Profissao profissao;


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