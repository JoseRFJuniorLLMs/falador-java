package com.googolplex.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 28/07/2020
 */

@Document(collection = "exame")
public class Exame {
    @Id
    String id;
    String uid;
    String descricao;
    Area areahospital;
    String imagens;
    Pessoa paciente;
    Pessoa medico;
    Pessoa funcionario;
    Modalidade modalidade;
    Procedimento procedimento;
    Laudo laudo;
    String notamedico;
    String audio;
    String status;
    String prioridade;
    String maquina;
    LocalDateTime dataTermino;
    LocalDateTime datacadastro = LocalDateTime.now();

    public Exame() {
    }

    public Exame(String id, String uid, String descricao, Area areahospital, String imagens, Pessoa paciente, Pessoa medico, Pessoa funcionario, Modalidade modalidade, Procedimento procedimento, Laudo laudo, String notamedico, String audio, String status, String prioridade, String maquina, LocalDateTime dataTermino, LocalDateTime datacadastro) {
        this.id = id;
        this.uid = uid;
        this.descricao = descricao;
        this.areahospital = areahospital;
        this.imagens = imagens;
        this.paciente = paciente;
        this.medico = medico;
        this.funcionario = funcionario;
        this.modalidade = modalidade;
        this.procedimento = procedimento;
        this.laudo = laudo;
        this.notamedico = notamedico;
        this.audio = audio;
        this.status = status;
        this.prioridade = prioridade;
        this.maquina = maquina;
        this.dataTermino = dataTermino;
        this.datacadastro = datacadastro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Area getAreahospital() {
        return areahospital;
    }

    public void setAreahospital(Area areahospital) {
        this.areahospital = areahospital;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }

    public Pessoa getPaciente() {
        return paciente;
    }

    public void setPaciente(Pessoa paciente) {
        this.paciente = paciente;
    }

    public Pessoa getMedico() {
        return medico;
    }

    public void setMedico(Pessoa medico) {
        this.medico = medico;
    }

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public Laudo getLaudo() {
        return laudo;
    }

    public void setLaudo(Laudo laudo) {
        this.laudo = laudo;
    }

    public String getNotamedico() {
        return notamedico;
    }

    public void setNotamedico(String notamedico) {
        this.notamedico = notamedico;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public LocalDateTime getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDateTime dataTermino) {
        this.dataTermino = dataTermino;
    }

    public LocalDateTime getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDateTime datacadastro) {
        this.datacadastro = datacadastro;
    }
}
