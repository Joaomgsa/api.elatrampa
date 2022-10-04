package br.com.api.elatrampa.data.model;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor
public class Profissao {

    private static final long serialVersionUID =1L;

    @Id
    private Long profissaoId;
    private String tituloProfissao;

}
