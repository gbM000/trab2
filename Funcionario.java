package model;

/**
 *
 * @author gabe
 */
public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;

    public Funcionario(int matricula, double salario, int CPF, String nome, String email, String telefone, Endereco endereco) {
        super(CPF, nome, email, telefone, endereco);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
