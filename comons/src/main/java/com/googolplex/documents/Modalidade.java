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
@Data
@Document(collection = "modalidade")
public class Modalidade {
    @Id
    String id;
    String descricao; //CT, CR, DX, ECG, MR, NM, OT, PX, RF, SC, US, XA
    String status;
    LocalDateTime datacadastro = LocalDateTime.now();
    LocalDateTime datatermino;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDateTime datacadastro) {
        this.datacadastro = datacadastro;
    }

    public LocalDateTime getDatatermino() {
        return datatermino;
    }

    public void setDatatermino(LocalDateTime datatermino) {
        this.datatermino = datatermino;
    }
}
