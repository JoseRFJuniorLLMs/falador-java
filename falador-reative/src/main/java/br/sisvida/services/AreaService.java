package br.sisvida.services;

import com.googolplex.documents.Area;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 03/08/2020
 */

public interface AreaService {
    Flux<Area> findAll();
    Mono<Area> save(Area area);
}
