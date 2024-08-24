/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gabe
 */
public class Sistema {
    
    private Map<Integer,Peca> pecas = new HashMap();
    private Map<Integer,Funcionario> funcionarios = new HashMap();
    private Map<Integer,Pessoa> clientes = new HashMap();
    private Map<Integer,Empresa> empresas = new HashMap();
    private Agenda agenda = new Agenda();
    private static final double preco_servico = 205.75;
    
    public void addPeca(Peca p){
        pecas.put(p.getCodigo(),p);
    }
    
    public Peca getPeca(int cod){
        return pecas.get(cod);
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios.put(f.getMatricula(), f);
    }
    
    public Funcionario getFuncionario(int mat){
        return funcionarios.get(mat);
    }
    
    public void addCliente(Pessoa c){
        clientes.put(c.getCPF(),c);
    }
    
    public Pessoa getCliente(int cpf){
        return clientes.get(cpf);
    }
    
    public void addEmpesa(Empresa e){
        empresas.put(e.getCNPJ(),e);
    }
    
    public Empresa getEmpresa(int cnpj){
        return empresas.get(cnpj);
    }
    
    public void addAgendamento(ServicoBuilder servico){
        this.agenda.add(servico);
    }
    
    public double calculaPreco(int cod){
        double ret = this.preco_servico;
        Map<Integer,Peca> pecas_registradas = this.pecas;
        Map<Integer,Integer> pecas_servico = agenda.agendadados().get(cod).getPecas();
        System.out.println(pecas_servico);
        /*
        for(Map.Entry<Integer,Peca> peca : pecas_registradas.entrySet()){
            if(pecas_servico.containsKey(peca.getKey())){
                ret += (peca.getValue().getCusto() + pecas_servico.get(peca.getKey()));
            }
        } */
        return ret;
    }
    
    public void realizarServico(int cod){
        if(this.agenda.realizarServico(cod)){
            System.out.println("O preço do serviço é " + this.calculaPreco(cod));
        }
    }
    
    public void getAll(){
        System.out.println("Peças\n");
        pecas.keySet().forEach(cod -> {System.out.println("Nome: " + pecas.get(cod).getNome() +
                                                           "\nCódigo: " + pecas.get(cod).getCodigo() +
                                                            "\nPreço: R$ " + pecas.get(cod).getPreco());});
        System.out.println("Funcionarios\n");
        funcionarios.keySet().forEach(mat -> {System.out.println("Nome: " + funcionarios.get(mat).getNome() +
                                                                "\nMatricula: " + funcionarios.get(mat).getMatricula());});
        System.out.println("Clietes\n");
        clientes.keySet().forEach(cpf -> {System.out.println("Nome: " + clientes.get(cpf).getNome() +
                                                               "\nCPF: " + clientes.get(cpf).getCPF());});
        System.out.println("Empresas\n");
        empresas.keySet().forEach(cnpj -> {System.out.println("Nome: " + empresas.get(cnpj).getNome() +
                                                           "\nCNPJ: " + empresas.get(cnpj).getCNPJ());});
        System.out.println("AGENDADOS\n");
        agenda.agendadados().keySet().forEach(cod -> {System.out.println("Código: " + agenda.agendadados().get(cod).getCod());});
        System.out.println("\nPENDENTES\n");
        agenda.naoAgendadados().keySet().forEach(cod -> {System.out.println("Código: " + agenda.naoAgendadados().get(cod).getCod());});
    }
}