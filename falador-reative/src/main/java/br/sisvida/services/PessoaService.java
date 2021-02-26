package br.sisvida.services;

import com.googolplex.documents.Pessoa;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

public interface PessoaService {
    Flux<Pessoa> findAll();
    Mono findById(String id);
    Mono<Pessoa> save(Pessoa pessoa);
    Mono<Pessoa> update(Pessoa pessoa);
}
