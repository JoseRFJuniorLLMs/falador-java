package br.sisvida.services;

import com.googolplex.documents.Exame;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

public interface ExameService {
    Flux<Exame> findAll();
    Mono findById(String id);
    Mono<Exame> save(Exame exame);
  /*  Mono findByUiid(String uid);
    Mono<Exame> update(Exame exame);*/
}
