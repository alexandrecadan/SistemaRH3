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
public class Dependente extends Pessoa{
    private String parentesco;
    private Funcionario funcionario;

    public Dependente(String parentesco, Funcionario funcionario, String nome, String cpf, Date dataNascimento, String endereco, Date dataAdmissao) {
        super(nome, cpf, dataNascimento, endereco, dataAdmissao);
        this.parentesco = parentesco;
        this.funcionario = funcionario;
    }    
}
