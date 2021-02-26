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
@Data
@Document(collection = "laudo")
public class Laudo {
    @Id
    String id;
    Pessoa medico;
    String descricao; // PENDENTE, ABERTO, LAUDADO, FINALIZADO
    String status;
    LocalDateTime datacadastro = LocalDateTime.now();

    public Laudo() {
    }

    public Laudo(String id, Pessoa medico, String descricao, String status, LocalDateTime datacadastro) {
        this.id = id;
        this.medico = medico;
        this.descricao = descricao;
        this.status = status;
        this.datacadastro = datacadastro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pessoa getMedico() {
        return medico;
    }

    public void setMedico(Pessoa medico) {
        this.medico = medico;
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

    public LocalDateTime getDataCadastro() {
        return datacadastro;
    }

    public void setDataCadastro(LocalDateTime datacadastro) {
        this.datacadastro = datacadastro;
    }
}
