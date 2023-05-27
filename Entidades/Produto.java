package SistemaBancaDeRevista.Entidades;

public abstract class Produto {

    private int codigo;
    private String nome;
    private double valorUnitario;
    private int estoque;

    public Produto() {

    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getEstoque() {
        return estoque;
    }

    public void incluirEstoque(int quantidade) {
        estoque = estoque + quantidade;
    }

    public void tirarEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque = estoque - quantidade;

        } else {
            System.out.println("ERRO: Estoque indisponivel!");
        }

    }
}
