/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh3;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
        long dataAdmissaoLong = data.getTimeInMillis();
        Date dataAdmissao = new Date(dataAdmissaoLong);
        Pessoa p = new Pessoa("João", "001", dataNascimento, "Rua X, 10");
        Funcionario f = new Funcionario("Analista", 
                                        dataAdmissao, 
                                        3000, 
                                        "XPTO", 
                                        "Jose", 
                                        "002", 
                                        dataNascimento, 
                                        "Rua João de Oliveira, 2003");
        
        f.setNome("Maria");
        Pessoa p2 = f;
    }
    
}
