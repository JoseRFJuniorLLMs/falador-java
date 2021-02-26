package br.sisvida.dto;

import org.springframework.data.annotation.Id;
import com.googolplex.documents.*;
import java.time.LocalDateTime;
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
public class ExameBuscaDTO {

        @Id
        String id;
        String uid; //TODO VER O TIPO CERTO
        String areahospital;
        String imagens;
        String paciente;
        String medico;
        String funcionario;
        String modalidade;
        String procedimento;
        String laudo;
        String notamedico;
        String audio;
        String status;
        String prioridade;
        String maquina;
        LocalDateTime datatermino;
        LocalDateTime datacadastro;

    public ExameBuscaDTO(Exame objExame) {
        id = objExame.getId();
        uid = objExame.getUid();
        areahospital = objExame.getAreahospital().getDescricao();
        imagens = objExame.getImagens();
        paciente = objExame.getPaciente().getNome();
        medico = objExame.getMedico().getNome();
        funcionario = objExame.getFuncionario().getNome();
        modalidade = objExame.getModalidade().getDescricao();
        procedimento = objExame.getProcedimento().getDescricao();
        laudo = objExame.getLaudo().getDescricao();
        notamedico = objExame.getNotamedico();
        audio = objExame.getAudio();
        status = objExame.getStatus();
        prioridade = objExame.getPrioridade();
        maquina = objExame.getMaquina();
        datacadastro = objExame.getDatacadastro();
        datatermino = objExame.getDataTermino();

    }
}


