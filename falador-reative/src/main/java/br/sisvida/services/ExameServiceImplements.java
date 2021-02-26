package br.sisvida.services;

import br.sisvida.repository.ExameRepository;
import com.googolplex.documents.Exame;
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
public class ExameServiceImplements implements ExameService {

    @Autowired
    ExameRepository exameRepository;

    @Override
    public Flux<Exame> findAll() {
        return exameRepository.findAll();
    }

    @Override
    public Mono findById(String id) {
        return exameRepository.findById(id);
    }

    @Override
    public Mono<Exame> save(Exame exame) {
        return exameRepository.save(exame);
    }
}
