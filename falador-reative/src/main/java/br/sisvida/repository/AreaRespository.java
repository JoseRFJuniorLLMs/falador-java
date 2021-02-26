package br.sisvida.repository;

import com.googolplex.documents.Area;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 03/08/2020
 */

public interface AreaRespository extends ReactiveMongoRepository<Area, String> {
}
