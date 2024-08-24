package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author gabe
 */

public class Agenda {
    private Map<Integer,ServicoBuilder> agendamentosPendentes;
    private Map<Integer,ServicoBuilder> agendamentos;
    
    public Agenda(){
        this.agendamentosPendentes = new HashMap<>();
        this.agendamentos = new HashMap<>();
    }
    
    public void add(ServicoBuilder sv){
        if(sv.completo()){
            agendamentos.put(sv.getCod(),sv);
        }else{
            agendamentosPendentes.put(sv.getCod(),sv);
        }
    }
    
    public void update(int cod, ServicoBuilder sv){
        ServicoBuilder aux = agendamentos.get(cod);
        aux.setCod(cod);
        if(null!= aux && sv.completo()){
            agendamentos.put(cod,sv);
        }else{
            aux = agendamentosPendentes.get(cod);
            aux.setCod(cod);
            if(null != aux){
                if(sv.completo()){
                    agendamentosPendentes.remove(cod);
                }
                this.add(sv);
            }
        }
    }
    
    public void remove(int cod){
        agendamentos.remove(cod);
        agendamentosPendentes.remove(cod);
    }
    
    public boolean realizarServico(int cod){
        if(this.agendamentos.containsKey(cod)){
            System.out.println("Serviço de código " + this.agendamentos.get(cod).getCod() + " realizado\n");
            remove(cod);
            return true;
        }
        System.out.println("Esse serviço não está agendado");
        return false;
    }
    
    public Map<Integer,ServicoBuilder> agendadados(){
        return this.agendamentos;
    }
    public Map<Integer,ServicoBuilder> naoAgendadados(){
        return this.agendamentosPendentes;
    }
    
}
