package br.sisvida.dto;

import org.springframework.data.annotation.Id;
import com.googolplex.documents.Pessoa;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.*;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class PessoaBuscaPacienteDTO {
    @Id
    String id;
    String nome;
    String cpf;
    String sus;
    String matricula;
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
    String tipopessoa;
    String area;
    LocalDateTime datacadastro;

    public PessoaBuscaPacienteDTO(Pessoa objPessoa) {
        id = objPessoa.getId();
        nome = objPessoa.getNome();
        cpf = objPessoa.getCpf();
        sus = objPessoa.getSus();
        matricula = objPessoa.getMatricula();
        estado = objPessoa.getEstado();
        cidade = objPessoa.getCidade();
        endereco = objPessoa.getEndereco();
        bairro = objPessoa.getBairro();
        cep = objPessoa.getCep();
        telefone = objPessoa.getTelefone();
        email = objPessoa.getEmail();
        status = objPessoa.getStatus();
        profissao = objPessoa.getProfissao();
        especialidade = objPessoa.getEspecialidade();
        datanascimento = objPessoa.getDatanascimento();
        sexo = objPessoa.getSexo();
        etinia = objPessoa.getEtinia();
        raca = objPessoa.getRaca();
        sangue = objPessoa.getSangue();
        doador = objPessoa.getDoador();
        imagem = objPessoa.getImagem();
        datacadastro = objPessoa.getDatacadastro();
        area = objPessoa.getArea().getDescricao();
        tipopessoa = objPessoa.getTipopessoa().getDescricao();
        obs = objPessoa.getObs();

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

    public String getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(String tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public LocalDateTime getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDateTime datacadastro) {
        this.datacadastro = datacadastro;
    }
}
