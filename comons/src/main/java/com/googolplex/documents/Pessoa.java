package com.googolplex.documents;

import com.mongodb.internal.connection.Time;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */
@Data
@Document(collection = "pessoa")
public class Pessoa {
    @Id
    String id;
    String nome;
    String cpf;
    String sus; // 704.2032.3159.7587
    String matricula;
    String crm;
    String estado;
    String cidade;
    String endereco;
    String bairro;
    String cep;
    String telefone;
    String email;
    String status;
    String profissao;
    String especialidade;
    Date datanascimento;
    String sexo;
    String etinia;
    String raca;
    String sangue;
    String doador;
    String imagem;
    String obs;
    String pai;
    String mae;
    Time horanascimento;
    TipoPessoa tipopessoa;
    Area area;
    Pessoa medico;
    Pessoa enfermeiro;
    Procedimento procedimento;
    Exame exame;
    Laudo laudo;
   // Perfil perfil;
    LocalDateTime datacadastro = LocalDateTime.now();
    //LocalDateTime vistoDataVencimento = LocalDateTime.now().plusMonths(3); //adiciona mais 3 meses

    public Pessoa() {
    }

     public Pessoa(Pessoa objPessoa) {
        super();
        this.id = objPessoa.id;
        this.nome = objPessoa.nome;
        this.cpf = objPessoa.cpf;
        this.sus = objPessoa.sus;
        this.matricula = objPessoa.matricula;
        this.crm = objPessoa.crm;
        this.estado = objPessoa.estado;
        this.cidade = objPessoa.cidade;
        this.endereco = objPessoa.endereco;
        this.bairro = objPessoa.bairro;
        this.cep = objPessoa.cep;
        this.telefone = objPessoa.telefone;
        this.email = objPessoa.email;
        this.status = objPessoa.status;
        this.profissao = objPessoa.profissao;
        this.especialidade = objPessoa.especialidade;
        this.datanascimento = objPessoa.datanascimento;
        this.sexo = objPessoa.sexo;
        this.etinia = objPessoa.etinia;
        this.raca = objPessoa.raca;
        this.sangue = objPessoa.sangue;
        this.doador = objPessoa.doador;
        this.imagem = objPessoa.imagem;
        this.obs = objPessoa.obs;
        this.datacadastro = objPessoa.datacadastro;
        this.tipopessoa = objPessoa.tipopessoa;
        this.area = objPessoa.area;
        this.medico = objPessoa.medico;
        this.enfermeiro = objPessoa.enfermeiro;
        this.procedimento = objPessoa.procedimento;
        this.pai = objPessoa.pai;
        this.mae = objPessoa.mae;
        this.horanascimento = objPessoa.horanascimento;
        this.exame = objPessoa.exame;
        this.laudo = objPessoa.laudo;
        this.area = objPessoa.area;
    }

    public Pessoa(String id, String nome, String cpf,
                  String sus, String matricula, String crm, String estado,
                  String cidade, String endereco, String bairro, String cep,
                  String telefone, String email, String status,
                  String profissao, String especialidade, Date datanascimento,
                  String sexo, String etinia, String raca, String sangue,
                  String doador, String imagem, String obs, String pai,
                  String mae, Time horanascimento, TipoPessoa tipopessoa,
                  Area area, Pessoa medico, Pessoa enfermeiro,
                  Procedimento procedimento, Exame exame, Laudo laudo,
                  LocalDateTime datacadastro) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sus = sus;
        this.matricula = matricula;
        this.crm = crm;
        this.estado = estado;
        this.cidade = cidade;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.status = status;
        this.profissao = profissao;
        this.especialidade = especialidade;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.etinia = etinia;
        this.raca = raca;
        this.sangue = sangue;
        this.doador = doador;
        this.imagem = imagem;
        this.obs = obs;
        this.pai = pai;
        this.mae = mae;
        this.horanascimento = horanascimento;
        this.tipopessoa = tipopessoa;
        this.area = area;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.procedimento = procedimento;
        this.exame = exame;
        this.laudo = laudo;
        this.datacadastro = datacadastro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEtinia() {
        return etinia;
    }

    public void setEtinia(String etinia) {
        this.etinia = etinia;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSangue() {
        return sangue;
    }

    public void setSangue(String sangue) {
        this.sangue = sangue;
    }

    public String getDoador() {
        return doador;
    }

    public void setDoador(String doador) {
        this.doador = doador;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public Time getHoranascimento() {
        return horanascimento;
    }

    public void setHoranascimento(Time horanascimento) {
        this.horanascimento = horanascimento;
    }

    public TipoPessoa getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(TipoPessoa tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Pessoa getMedico() {
        return medico;
    }

    public void setMedico(Pessoa medico) {
        this.medico = medico;
    }

    public Pessoa getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Pessoa enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Laudo getLaudo() {
        return laudo;
    }

    public void setLaudo(Laudo laudo) {
        this.laudo = laudo;
    }

    public LocalDateTime getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDateTime datacadastro) {
        this.datacadastro = datacadastro;
    }
}