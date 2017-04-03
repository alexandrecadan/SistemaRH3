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
public class Gerente extends Funcionario {

    private Funcionario[] subordinados;

    public Gerente(Funcionario[] subordinados, double salario, String empresa, String nome, String cpf, Date dataNascimento, String endereco, Date dataAdmissao) {
        super("Gerente", salario, empresa, nome, cpf, dataNascimento, endereco, dataAdmissao);
        this.subordinados = subordinados;
    }
    
    @Override
    public double getBonus(){
        return 0.2*subordinados.length*getSalario();
    }
    
}
