package controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import model.*;
/**
 *
 * @author gabe
 */

public class Controller {
    private Sistema sistema = new Sistema();
    
    public void CadastrarFuncionario(int matricula, double salario, int CPF, String nome, String email, String telefone, Endereco endereco){
        Funcionario f = new Funcionario(matricula,salario,CPF,nome,email,telefone,endereco);
        sistema.addFuncionario(f);
    }
    
    public void CadastrarPeca(int codigo, String nome, double preco, double custo){
        Peca p = new Peca(codigo,nome,preco,custo);
        sistema.addPeca(p);
    }
    
    public void CadastrarEmpresa(int CNPJ, String contato, String nome, String email, String telefone, Endereco endereco){
        Empresa e = new Empresa(CNPJ,contato,nome,email,telefone,endereco);
        sistema.addEmpesa(e);
    }
    
    public void CadastrarCliente(int CPF, String nome, String email, String telefone, Endereco endereco){
        Pessoa c = new Pessoa(CPF,nome,email,telefone,endereco);
        sistema.addCliente(c);
    }
    
    public void AgendarServico(int codigo, List<Funcionario> funcionarios, Map<Integer,Integer> pecas, LocalDate data){
        ServicoBuilder servico = new ServicoBuilder(codigo);
        servico.setFuncionario(funcionarios);
        servico.setPeca(pecas);
        servico.setData(data);
        sistema.addAgendamento(servico);
    }
    public void AgendarServico(int codigo, List<Funcionario> funcionarios, Map<Integer,Integer> pecas){
        ServicoBuilder servico = new ServicoBuilder(codigo);
        sistema.addAgendamento(servico);
    }
    
    public void realizarServico(int cod){
        sistema.realizarServico(cod);
    }
    
    public Funcionario getFuncionario(int mat){
        return sistema.getFuncionario(mat);
    }
    
    public Peca getPeca(int cod){
        return sistema.getPeca(cod);
    }
    
    public void Imprimir(){
        sistema.getAll();
    }
}

