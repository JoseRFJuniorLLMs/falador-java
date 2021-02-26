package br.sisvida.controller;

import br.sisvida.dto.ExameBuscaDTO;
import br.sisvida.repository.ExameRepository;
import br.sisvida.services.ExameService;
import com.googolplex.documents.Exame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("exame")
@RestController
public class ExameController {
/*
        {

        "uid": null,
        "areahospital": { "descricao":"AREA VERDE", "status":"Ativa"},
        "cpf": "7777",
        "imagens": null,
        "paciente": { "nome":"JOSE R F JUNIOR", "cpf":"64525430249"},
        "medico": { "nome":"DR. JAVA DA SILVA"
        },
        "funcionario": { "nome":"BOLSONARO"
        },
        "modalidade": { "descricao":"CT"
        },
        "procedimento": { "descricao":"TORAX COVID 19"
        },
        "laudo": { "status":"EMITIDO"
        },
        "notamedico": "PACIENTE COM COVID19",
        "audio": null,
        "status": "Ativo",
        "prioridade": "Alta",
        "maquina": "RADIOGRAFIA 2"

    }
* */
    @Autowired
    ExameService exameService;

    @Autowired
    ExameRepository exameRepository;

    @GetMapping(value = "/todos")
    public Flux<Exame> getAll() {
        return exameService.findAll();
    }

    @GetMapping(value = "/buscaid/{id}")
    public Mono<Exame> getById(@PathVariable String id) {
        return exameService.findById(id)
                .map(exame -> ResponseEntity.ok(exame))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/buscacpfpaciente/{cpf}")
    public Mono<ResponseEntity<Exame>> getByCpf(@PathVariable String cpf) {
        return exameRepository.findByPacienteCpf(cpf)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @RequestMapping(value="/flux20", method=RequestMethod.GET)
    public ResponseEntity<List<ExameBuscaDTO>> findAll() {
        Flux<Exame> listFlux = exameService.findAll();
        List<ExameBuscaDTO> listDto = listFlux.toStream()
                .sorted(Comparator.comparing(Exame::getId).reversed())
                .map(ExameBuscaDTO::new)
                .limit(20)
                .collect( Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ResponseEntity<Exame>> create(@RequestBody Exame exame) {
        return exameService.save(exame)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

}
