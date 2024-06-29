package ExClasseProduto;

import Utils.ValidadorInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
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

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void atualizarEstoque(int quantidade) {
        if (quantidade < 0) {
            System.out.println("A quantidade não pode ser negativa.");
        } else if (quantidade > this.getQuantidadeEstoque()) {
            System.out.println("Não há estoque suficiente.");
        } else {
            this.setQuantidadeEstoque(this.getQuantidadeEstoque() - quantidade);
        }
    }

    public void exibirDetalhes() {
        System.out.println("---- Detalhes do produto ----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preço: R$" + this.getPreco());
        System.out.println("Quantidade em estoque: " + this.getQuantidadeEstoque());
    }

    public String exibirOpcoes() {
        return "-----------------------------\n" +
                "Escolha uma opção:\n" +
                "[1] Atualizar estoque (comprar)\n" +
                "[2] Exibir detalhes\n" +
                "[0] Sair\n" +
                "-----------------------------";
    }

    public void cadastrar() {
        this.setNome(ValidadorInput.obterString("Digite o nome do produto: "));
        this.setPreco(ValidadorInput.obterDouble("Digite o preço do produto: "));
        this.setQuantidadeEstoque(ValidadorInput.obterInteiro("Digite a quantidade inicial em estoque: "));

        System.out.println("Produto Cadastrado!");

        this.exibirDetalhes();
    }
}
