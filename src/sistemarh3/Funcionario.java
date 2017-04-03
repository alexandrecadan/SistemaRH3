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
public class Funcionario extends Pessoa {
    private String cargo;
    private Date dataAdminissao;
    private double salario;
    private String empresa;

//adicionando construtor com o Super, Funcionário vai ter todos os atributos de Pessoa e Funcionario juntos
    public Funcionario(String cargo, Date dataAdminissao, double salario, String empresa, String nome, String cpf, Date dataNascimento, String endereco) {
        super(nome, cpf, dataNascimento, endereco);
        this.cargo = cargo;
        this.dataAdminissao = dataAdminissao;
        this.salario = salario;
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdminissao() {
        return dataAdminissao;
    }

    public void setDataAdminissao(Date dataAdminissao) {
        this.dataAdminissao = dataAdminissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }  
    
}
