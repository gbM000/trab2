package model;

/**
 *
 * @author gabe
 */

public class Pessoa extends Entidade{
    
    private int CPF;

    public Pessoa(int CPF, String nome, String email, String telefone, Endereco endereco) {
        super(nome, email, telefone, endereco);
        this.CPF = CPF;
    }
    
    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
}
