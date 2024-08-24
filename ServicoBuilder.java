package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gabe
 */

public class ServicoBuilder implements Builder{
    
    private LocalDate data;
    private Map<Integer, Integer> pecas;
    private List<Funcionario> funcionarios;
    private int codServico;
    
    
    public ServicoBuilder(int cod){
        this.data = null;
        this.funcionarios = new ArrayList<Funcionario>();
        this.pecas = new HashMap<>();
        this.codServico = cod;
    }
    
    @Override
    public List<Funcionario> setFuncionario(List<Funcionario> f){
        this.funcionarios = new ArrayList<>(f);
        return this.funcionarios;
    }
    
    @Override
    public LocalDate setData(LocalDate d){
        if(this.valida()){
            this.data = d;
            return this.data;
        }
        return null;
    }
    
    @Override
    public Map<Integer, Integer> setPeca(Map<Integer,Integer> p){
        this.pecas = new HashMap<>(p);
        return this.pecas;
    }
    
    public Map<Integer,Integer> getPecas(){
        return this.pecas;
    }
    
    public int getCod(){
        return this.codServico;
    }
    
    public void setCod(int cod){
        this.codServico = cod;
    }
    
    public boolean valida(){
        return !this.funcionarios.isEmpty() && !this.pecas.isEmpty();
    }
    
    public boolean completo(){
        return this.valida() && this.data != null;
    }
    
}
