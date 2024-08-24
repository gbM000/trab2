package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gabe
 */

public class Servico {
    
    private int codServico;
    private LocalDate data;
    private Map<Integer, Integer> pecas;
    private List<Funcionario> funcionarios;
    
    public Servico(){}
    
    public Servico(LocalDate data, Map<Integer, Integer> pecas, List<Funcionario> funcionarios, int cs){
        this.data = data;
        this.pecas = pecas;
        this.funcionarios = funcionarios;
        this.codServico = cs;
    }
    
    public int getCod(){
        return codServico;
    }
    
    public LocalDate getData() {
        return data;
    }

    public Map<Integer, Integer> getPecas() {
        return pecas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
}
