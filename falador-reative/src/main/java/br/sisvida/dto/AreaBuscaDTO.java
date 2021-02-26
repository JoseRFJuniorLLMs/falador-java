package br.sisvida.dto;

import com.googolplex.documents.Area;
import com.googolplex.documents.Exame;
import com.googolplex.documents.Leito;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 03/08/2020
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class AreaBuscaDTO {
    String id;
    String descricao;
    String status;
    Leito leito;
    LocalDateTime datacadastro;

    public AreaBuscaDTO(Area objArea) {
        id = objArea.getId();
        descricao = objArea.getDescricao();
        status = objArea.getStatus();
        leito = objArea.getLeito();
        datacadastro = objArea.getDatacadastro();
    }

}
