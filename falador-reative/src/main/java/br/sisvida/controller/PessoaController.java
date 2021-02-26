package br.sisvida.controller;

import br.sisvida.dto.PessoaBuscaFuncionarioDTO;
import br.sisvida.dto.PessoaBuscaPacienteDTO;
import br.sisvida.repository.PessoaRepository;
import br.sisvida.services.PessoaService;
import com.googolplex.documents.Pessoa;
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
@RequestMapping("pessoa")
@RestController
public class PessoaController {
/*
{
    "nome": "ALEXANDRE NORMANDIA DA ROCHA",
    "cpf": "6452545225888",
    "sus": "6452545225888",
    "matricula": "6452545225888",
    "crm": "6452545225888",
    "estado": "CE",
    "cidade": "FORTALEZA",
    "endereco": "RUA DOS JAVA",
    "bairro": "CENTRO",
    "cep": "60604440",
    "telefone": "+56 699125465465",
    "email": "email@gmail.com",
    "status": "Ativo",
    "profissao": "Programador",
    "especialidade": "CIENCIA DE DADOS",
    "data-nascimento": "2000-02-02",
    "sexo": "M",
    "etinia": "BRANCA",
    "raca": "BRANCA",
    "sangue": "A+",
    "doador": "SIM",
    "imagem": "www.google.com",
    "obs": "SEM OBS",
    "pai": "PAI JOSE",
    "mae": "MAE MARIA",
    "horanascimento":null,
    "area": {
             "descricao":"UTI",
             "leito":{
                 "descricao":"L2323"
                 }
             },
    "tipopessoa": {
        "descricao":"Paciente"
        },
    "medico": {
        "nome":"DR. NIETZSCHE"
        },
    "enfermeiro": {
        "nome":"RONILSON REIS"
        },
    "exame": {
        "descricao":"EXAME SANGUE",
        "procedimento":{"descricao":"TORAX"},
        "modalidade":{"descricao":"DX"},
        "datacadastro":null,
        "laudo":{"descricao":"PENDENTE"}

        },
    "laudo": {
        "descricao":"LAUDO DE COVID19"
        },
    "procedimento": {
        "descricao":"PROCEDIMENTO INVASIVO"
        },
    "datacadastro": "2020-08-01T21:26:14.913736"
}
 */
    @Autowired
    PessoaService pessoaService;

    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping(value = "/todos")
    public Flux<Pessoa> getAll() {
        return pessoaService.findAll();
    }

    @GetMapping(value = "/buscarid/{id}")
    public Mono<Pessoa> getById(@PathVariable String id) {
        return pessoaService.findById(id)
                .map(pessoa -> ResponseEntity.ok(pessoa))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping(value = "/buscacpf/{cpf}")
    public Mono<ResponseEntity<Pessoa>> getByCpf(@PathVariable String cpf) {
        return pessoaRepository.findByCpf(cpf)
                .filter(c -> c.getStatus().equals("Ativo"))
                //.filter(c -> c.getTipopessoa().toString().equals("Paciente"))
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/buscanome/{nome}")
    public Flux<ResponseEntity<Pessoa>> getByNome(@PathVariable String nome) {
        return pessoaRepository.findByNome(nome)
                .filter(c -> c.getStatus().equals("Ativo"))
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/buscamatricula/{matricula}")
    public Flux<ResponseEntity<Pessoa>> getByMatricula(@PathVariable String matricula) {
        return pessoaRepository.findByMatricula(matricula)
                .filter(c -> c.getStatus().equals("Ativo"))
                .filter(c -> c.getTipopessoa().equals("Funcionario"))
                .map(ResponseEntity::ok)
                //.collectList()
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @RequestMapping(value="/flux20Paciente", method=RequestMethod.GET)
    public ResponseEntity<List<PessoaBuscaPacienteDTO>> findAllPaciente() {
        Flux<Pessoa> listFlux = pessoaService.findAll();
        List<PessoaBuscaPacienteDTO> listDto = listFlux.toStream()
                .filter(c -> c.getStatus().equals("Ativo"))
                .filter(c -> c.getTipopessoa().getDescricao().equals("Paciente"))
                .sorted(Comparator.comparing(Pessoa::getId).reversed())
                .map(PessoaBuscaPacienteDTO::new)
                .limit(20)
                .collect( Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @RequestMapping(value="/flux20Funcionario", method=RequestMethod.GET)
    public ResponseEntity<List<PessoaBuscaFuncionarioDTO>> findAllFuncionario() {
        Flux<Pessoa> listFlux = pessoaService.findAll();
        List<PessoaBuscaFuncionarioDTO> listDto = listFlux.toStream()
                .filter(c -> c.getStatus().equals("Ativo"))
                .filter(c -> c.getTipopessoa().getDescricao().equals("Funcionario"))
                .sorted(Comparator.comparing(Pessoa::getId).reversed())
                .map(PessoaBuscaFuncionarioDTO::new)
                .limit(20)
                .collect( Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping("/buscaEmail/{email}")
    public Flux<ResponseEntity<Pessoa>> getByEmail(@PathVariable String email) {
        return pessoaRepository.findByEmail(email)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping("/paciente/post")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ResponseEntity<Pessoa>> create(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PutMapping("/put/{id}")
    public Mono<ResponseEntity<Pessoa>>
                    updatePessoa(@PathVariable(value="id") String id,
                                 @RequestBody Pessoa pessoa) {

        return pessoaService.findById(id)
                .flatMap(pessoaExiste -> {
                    pessoa.setNome(pessoa.getNome());
                    pessoa.setCpf(pessoa.getCpf());
                    pessoa.setSus(pessoa.getSus());
                    pessoa.setMatricula(pessoa.getMatricula());
                    pessoa.setEstado(pessoa.getEstado());
                    pessoa.setCidade(pessoa.getCidade());
                    pessoa.setEndereco(pessoa.getEndereco());
                    pessoa.setBairro(pessoa.getBairro());
                    pessoa.setCep(pessoa.getCep());
                    pessoa.setTelefone(pessoa.getTelefone());
                    pessoa.setEmail(pessoa.getEmail());
                    pessoa.setStatus(pessoa.getStatus());
                    pessoa.setProfissao(pessoa.getProfissao());
                    pessoa.setSexo(pessoa.getSexo());
                    pessoa.setEtinia(pessoa.getEtinia());
                    pessoa.setRaca(pessoa.getRaca());
                    pessoa.setSangue(pessoa.getSangue());
                    pessoa.setDatacadastro(pessoa.getDatacadastro());
                    return pessoaService.update(pessoa);
                })
                .map(updatePessoa -> ResponseEntity.ok(updatePessoa))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
    // https://localhost:8080/pessoa/fullsearch?nome=maria
    // https://localhost:8080/pessoa/fullsearch?nome=maria&?cpf=6452545225888
    @RequestMapping(value="/fullsearch", method=RequestMethod.GET)
    public ResponseEntity<Flux<Pessoa>> fullSearch(
            @RequestParam(value="nome", defaultValue="") String nome,
            @RequestParam(value="cpf", defaultValue="") String cpf,
            @RequestParam(value="email", defaultValue="") String email,
            @RequestParam(value="telefone", defaultValue="") String telefone,
            @RequestParam(value="cep", defaultValue="") String cep,
            @RequestParam(value="sus", defaultValue="") String sus,
            @RequestParam(value="mae", defaultValue="") String mae,
            @RequestParam(value="crm", defaultValue="") String crm,
            @RequestParam(value="matricula", defaultValue="") String matricula,
            @RequestParam(value="profissao", defaultValue="") String profissao,
            @RequestParam(value="sexo", defaultValue="") String sexo,
            @RequestParam(value="pai", defaultValue="") String pai
    )
    {
        Flux<Pessoa> list = pessoaRepository.fullSearch(nome, cpf, email, telefone, cep,
                sus, mae, crm, matricula, profissao, sexo, pai);
        return ResponseEntity.ok().body(list);
    }
}
