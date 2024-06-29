package ExClasseProduto;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto() {}

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
        this.setQuantidadeEstoque(this.getQuantidadeEstoque() - quantidade);
    }

    public void exibirDetalhes() {
        System.out.println("---- Detalhes do produto ----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Preço: R$" + this.getPreco());
        System.out.println("Quantidade em estoque: " + this.getQuantidadeEstoque());
    }

    public void exibirOpcoes() {
        System.out.println("-----------------------------\n" +
                "Escolha uma opção:\n" +
                "[1] Atualizar estoque (comprar)\n" +
                "[2] Exibir detalhes\n" +
                "[0] Sair\n" +
                "-----------------------------");
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        this.setNome(sc.next());

        System.out.println("Digite o preço do produto: ");
        this.setPreco(sc.nextDouble());

        System.out.println("Digite a quantidade inicial em estoque: ");
        this.setQuantidadeEstoque(sc.nextInt());

        System.out.println("Produto Cadastrado!");
        this.exibirDetalhes();
    }
}
