package br.sisvida.services;

import br.sisvida.repository.PessoaRepository;
import com.googolplex.documents.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@Service
public class PessoaServiceImplements implements PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    @Override
    public Flux<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @Override
    public Mono<Pessoa> findById(String id) {
        return pessoaRepository.findById(id);
    }

    @Override
    public Mono<Pessoa> save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Mono<Pessoa> update(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}
