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
@Document(collection = "area")
public class Area {
    @Id
    String id;
    String descricao;
    String status;
    Leito leito;
    LocalDateTime datacadastro = LocalDateTime.now();

    public Area() {
    }

    public Area(String id, String descricao, String status, Leito leito, LocalDateTime datacadastro) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
        this.leito = leito;
        this.datacadastro = datacadastro;
    }

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

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public LocalDateTime getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDateTime datacadastro) {
        this.datacadastro = datacadastro;
    }

}
