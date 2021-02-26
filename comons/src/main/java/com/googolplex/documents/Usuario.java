package com.googolplex.documents;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Data
@Document(collection = "usuario")
public class Usuario  {
    @Id
    private long id;
    private String login;
    private String senha;
    private Perfil perfil;
    private Pessoa pessoaFisica;
    private String Status;
    LocalDateTime dataCadastro = LocalDateTime.now();

}