/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh3;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alexandre
 */
public class SistemaRH3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        
        data.set(1990, 0, 20);
        long dataNascimentoLong = data.getTimeInMillis();
        Date dataNascimento = new Date(dataNascimentoLong);
        
        data.set(2009, 0, 20);
        long dataNascimentoDepLong = data.getTimeInMillis();
        Date dataNascimentoDep = new Date(dataNascimentoDepLong);
        
        data.set(2012, 0, 20);
        long dataAdmissaoLong = data.getTimeInMillis();
        Date dataAdmissao = new Date(dataAdmissaoLong);
        
        
        Pessoa p = new Funcionario("Diretor",
                dataAdmissaoLong, 
                "XPTOJ", 
                "João do Bem", 
                "0001", 
                dataNascimento, 
                "Rua João",
                dataAdmissao
        );
        
        Funcionario f = new Funcionario("cargo", 
                dataAdmissaoLong, 
                "empresa", 
                "nome", 
                "cpf", 
                dataNascimento, 
                "Rua Xablau", 
                dataAdmissao
        );
        
        f.setNome("Maria");
        
        Dependente d1 = new Dependente ("Parentesco", 
                f, 
                "João da Silva 2", 
                "001", 
                dataNascimento, 
                "Rua Bla bla", 
                dataAdmissao
        );
        
        Pessoa p3 = d1;
        Pessoa p2 = f;
        Pessoa p1 = d1;
        
    }
    
}
