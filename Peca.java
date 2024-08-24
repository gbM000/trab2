package model;

/**
 *
 * @author gabe
 */
public class Peca {

    private int codigo;
    private String nome;
    private double preco, custo;

    public Peca(int codigo, String nome, double preco, double custo) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
