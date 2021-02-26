package br.sisvida.repository;

import com.googolplex.documents.Pessoa;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

public interface PessoaRepository extends ReactiveMongoRepository<Pessoa, String>{
    Mono<Pessoa> findByCpf(String cpf);
    Flux<Pessoa> findByNome(String nome);
    Flux<Pessoa> findByMatricula(String matricula);
    Flux<Pessoa> findByEmail(String email);

    @Query("{'nome':{$regex:?0,$options:'i'}}")
    Flux<Pessoa> searchNome(String nome);

    @Query("{$or:[{'nome':{$regex:?0,$options:'i'}}," +
            "{'cpf':{$regex:?0,$options:'i'}}]}," +
            "{'email':{$regex:?0,$options:'i'}}]}," +
            "{'telefone':{$regex:?0,$options:'i'}}]}," +
            "{'cep':{$regex:?0,$options:'i'}}]}," +
            "{'sus':{$regex:?0,$options:'i'}}]}, " +
            "{'mae':{$regex:?0,$options:'i'}}]}, " +
            "{'crm':{$regex:?0,$options:'i'}}]}, " +
            "{'matricula':{$regex:?0,$options:'i'}}]}, " +
            "{'profissao':{$regex:?0,$options:'i'}}]}, " +
            "{'sexo':{$regex:?0,$options:'i'}}]}, {'pai':{$regex:?0,$options:'i'}}]}")
    Flux<Pessoa> fullSearch(String nome, String cpf,
                            String email, String telefone,
                            String cep, String sus, String mae,
                            String crm, String matricula,
                            String profissao, String sexo, String pai);
}
