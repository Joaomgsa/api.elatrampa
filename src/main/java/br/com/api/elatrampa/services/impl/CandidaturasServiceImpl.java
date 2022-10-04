package br.com.api.elatrampa.services.impl;

import br.com.api.elatrampa.data.model.Candidaturas;
import br.com.api.elatrampa.data.model.Profissao;
import br.com.api.elatrampa.data.model.Vagas;
import br.com.api.elatrampa.repository.CandidaturasRepository;
import br.com.api.elatrampa.repository.PessoasRepository;
import br.com.api.elatrampa.repository.ProfissaoRepository;
import br.com.api.elatrampa.repository.VagasRepository;
import br.com.api.elatrampa.resource.dto.VagaDTO;
import br.com.api.elatrampa.services.CandidaturasServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidaturasServiceImpl implements CandidaturasServices {


    private final VagasRepository vagasRepository;
    private final PessoasRepository pessoasRepository;
    private final CandidaturasRepository candidaturasRepository;

    private final ProfissaoRepository profissaoRepository;

    @Override
    public Vagas incluirVaga(VagaDTO vagaDTO) {
        Candidaturas candidatura = verCandidatura(vagaDTO.getCandidaturaId());

        if(candidatura.isInativa()){
            throw new RuntimeException("Candidatura inativa");
        }

        Vagas novaVaga = Vagas.builder()
                .descricaoVaga(vagaDTO.getDescricaoVaga())
                .experienciaVaga(vagaDTO.getExperienciaVaga())
                .localizacaoVaga(vagaDTO.getLocalizacaoVaga())
                .candidatura(candidatura)
                .profissao(profissaoRepository.findById(vagaDTO.getProfissaoId()).orElseThrow(
                        () ->{
                            throw new RuntimeException("Essa Vaga não Existe");
                        }
                ))
                .build();

        List<Vagas> vagasEmCandidatura = candidatura.getVagas();
        if (vagasEmCandidatura.isEmpty()){
            vagasEmCandidatura.add(novaVaga);
        }else {
            Profissao profissaoDaVaga = vagasEmCandidatura.get(0).getProfissao();
            Profissao profissaoDaPessoa = novaVaga.getProfissao();
            if (profissaoDaVaga.equals(profissaoDaPessoa)) {
                vagasEmCandidatura.add(novaVaga);
            }else {
                throw new RuntimeException("Não é possível se candidatar em profissoes diferentes");
            }
        }
        candidaturasRepository.save(candidatura);
        return novaVaga;
    }

    @Override
    public Candidaturas verCandidatura(Long id) {
        return candidaturasRepository.findById(id).orElseThrow(
                () ->{
                    throw new RuntimeException("Essa Candidatura Não Existe");
                }
        );
    }

    @Override
    public Candidaturas desativarCandidatura(Long id, boolean status) {
        return null;
    }


}
