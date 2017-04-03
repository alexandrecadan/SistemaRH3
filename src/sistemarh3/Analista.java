/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh3;

import java.util.Date;

/**
 *
 * @author alexandre
 */
public class Analista extends Funcionario {
    
    private String especialidade;

    public Analista(String especialidade, double salario, String empresa, String nome, String cpf, Date dataNascimento, String endereco, Date dataAdmissao) {
        super("Analista", salario, empresa, nome, cpf, dataNascimento, endereco, dataAdmissao);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
}
