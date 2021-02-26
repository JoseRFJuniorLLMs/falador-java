package com.googolplex.documents;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 28/07/2020
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Data
@Document(collection = "leito")
public class Leito {
    @Id
    String id;
    String descricao;
    String status;
    LocalDateTime datacadastro = LocalDateTime.now();

}
