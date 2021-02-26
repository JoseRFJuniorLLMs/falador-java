package br.sisvida.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@Service
@RequiredArgsConstructor
public class PessoaKafkaService {

    private static final String KEY = "pessoa";

    private ReactiveMongoTemplate reactiveMongoTemplate;
    private KafkaSender<String, String> kafkaSender;

    private ObjectMapper objectMapper;

    @Value("${kafka.sisvida.topic}")
    String topicName;

     /*public Mono<Pessoa> findPessoaById(String id) {
        return reactivePessoaHashOperations().get(KEY, id.toString());
    }

   public Mono<String> savePessoa(Pessoa pessoa) {
        return reactivePessoaHashOperations().update(KEY, pessoa.getPessoaId().toString(), pessoa)
                .log()
                .flatMap(aBoolean -> {
                    return kafkaSender.send(Mono.just(pessoaSenderRecord(pessoa)))
                            .next()
                            .log()
                            .map(longSenderResult -> longSenderResult.exception() == null);
                })
                .map(aBoolean -> aBoolean ? "OK" : "NOK");
    }*/

    private ReactiveMongoOperations reactivePessoaHashOperations() {
        return reactiveMongoTemplate;
    }

}
