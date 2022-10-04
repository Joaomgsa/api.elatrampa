package br.com.api.elatrampa.resource;


import br.com.api.elatrampa.data.model.Candidaturas;
import br.com.api.elatrampa.data.model.Vagas;
import br.com.api.elatrampa.resource.dto.VagaDTO;
import br.com.api.elatrampa.services.CandidaturasServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;

@Api(value="/desafio/candidaturas")
@RestController
@RequestMapping("/desafio/candidaturas")
@RequiredArgsConstructor
public class CandidaturasResource {

    private final CandidaturasServices service;

    @PostMapping
    public Vagas incluirVaga(@RequestBody VagaDTO vagaDTO){
        return service.incluirVaga(vagaDTO);
    }

    @GetMapping("/{id}")
    public Candidaturas verCandidatura(@PathVariable("id")Long id) {
        return service.verCandidatura(id);
    }

    @PatchMapping("/desativarCandidatura/{candidaturaId}")
    public Candidaturas desativarCandidatura(@PatchMapping("candiaturaId")){
        return service.desativarCandidatura(candidaturaId, false);
    }



}
