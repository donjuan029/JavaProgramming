package br.com.estoque.modelo;

/**
 * Classe de Modelo (Dados): Representa um item no estoque.
 */
public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int valor) {
        this.quantidade += valor;
    }

    @Override
    public String toString() {
        return nome + " (Qtd: " + quantidade + ")";
    }
}
