package br.com.estoque.app;

import br.com.estoque.modelo.Produto;
import br.com.estoque.servico.ServicoEstoque;

/**
 * Classe Principal da Aplicação (App): Ponto de entrada.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--- ESTRUTURA DE PACKAGES ---");
        System.out.println("Aplicação Principal: br.com.estoque.app");
        System.out.println("Modelo de Dados:     br.com.estoque.modelo");
        System.out.println("Lógica de Negócio:   br.com.estoque.servico");
        System.out.println("-----------------------------\n");

        Produto livro = new Produto("Livro Java Avançado", 10);
        ServicoEstoque servico = new ServicoEstoque();

        System.out.println("Produto antes da operação: " + livro);
        servico.adicionarProduto(livro, 5);
        System.out.println("Produto após a operação:  " + livro);
    }
}
