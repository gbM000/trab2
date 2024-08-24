package model;

/**
 *
 * @author gabe
 */

public class Empresa extends Entidade{
    private int CNPJ;
    private String nome_contato;

    public Empresa(int CNPJ, String contato, String nome, String email, String telefone, Endereco endereco) {
        super(nome, email, telefone, endereco);
        this.CNPJ = CNPJ;
        this.nome_contato = contato;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome_contato() {
        return nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }
}
