package br.sisvida.repository;

import com.googolplex.documents.Exame;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

public interface ExameRepository extends ReactiveMongoRepository<Exame, String> {

    Mono<Exame> findByPacienteCpf(String paciente);
    Flux<Exame> findByMedico(String medico);
    Flux<Exame> findByFuncionario(String funcionario);
    Flux<Exame> findByLaudo(String laudo);
}
