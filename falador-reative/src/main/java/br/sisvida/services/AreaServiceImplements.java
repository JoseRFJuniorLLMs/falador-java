package br.sisvida.services;

import br.sisvida.repository.AreaRespository;
import com.googolplex.documents.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 03/08/2020
 */

@Service
public class AreaServiceImplements implements AreaService {

    @Autowired
    AreaRespository areaRespository;

    @Override
    public Flux<Area> findAll() {
        return areaRespository.findAll();
    }

    @Override
    public Mono<Area> save(Area area) {
        return areaRespository.save(area);
    }
}
