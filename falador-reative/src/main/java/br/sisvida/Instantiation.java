package br.sisvida;

import br.sisvida.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 08/07/2020
 */

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void run(String... arg0) {

        /*
    String id;
    String nome;
    String cpf;
    String sus; // 704.2032.3159.7587
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
    String sexo;
    String etinia;
    String raca;
    String sangue;
    String dataCadastro;
    TipoPessoa tipoPessoa;
    Perfil perfil;

       Pessoa lourranio = new Pessoa(null,"LOURRANIO INDIGESTAO",
                "645.254.302-49", "704.2032.3159.7587", "1634972",
                "CE", "FORTALEZA", "RUA DOS JAVA", "CENTRO", "60060-440",
                "+56 85 91254360", "lourasindigest@gmail.com", "Ativo", "INDIGESTOR",
                "M","PARDO","BRANCA", "A+", "02/02/2020");

        pessoaRepository.saveAll(Arrays.asList(lourranio));
*/
    }
}