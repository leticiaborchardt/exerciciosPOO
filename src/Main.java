import ExClasseFilme.Filme;
import ExClasseFuncionario.Funcionario;
import ExClassePessoa.Pessoa;
import ExClasseProduto.Produto;
import Utils.ValidadorInput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            switch (ValidadorInput.obterInteiro(exibirOpcoes())) {
                case 1 -> exercicioPessoa();
                case 2 -> exercicioProduto();
                case 3 -> exercicioFilme();
                case 4 -> exercicioFuncionario();
                case 0 -> continuar = false;
                default -> System.out.println("Opção inválida.");
            }
        }
    }


    public static String exibirOpcoes() {
        return "-----------------------------" + "\n" +
                "LISTA DE EXERCÍCIOS POO 3" + "\n" +
                "-----------------------------" + "\n" +
                "Escolha o exercício: " + "\n" +
                "[1] Classe Pessoa" + "\n" +
                "[2] Classe Produto" + "\n" +
                "[3] Classe Filme" + "\n" +
                "[4] Classe Funcionário" + "\n" +
                "[0] Sair" + "\n" +
                "-----------------------------";
    }

    /**
     * Descrição do exercício:
     * <p>
     * Crie uma classe chamada Pessoa para modelar informações sobre uma pessoa.
     * Atributos: Nome, Idade, Altura, Peso
     * Métodos: envelhecer, engordar, emagrecer e mostrarInformacoes.
     */
    private static void exercicioPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.cadastrar();

        boolean continuar = true;

        while (continuar) {
            switch (ValidadorInput.obterInteiro(pessoa.exibirOpcoes())) {
                case 1:
                    pessoa.mostrarInformacoes();
                    break;
                case 2:
                    System.out.println("Idade anterior: " + pessoa.getIdade());
                    pessoa.envelhecer();
                    System.out.println("Feliz aniversário!\nIdade atual: " + pessoa.getIdade());
                    break;
                case 3:
                    pessoa.engordar(ValidadorInput.obterDouble("Digite o peso para engordar:"));
                    System.out.println("Peso atualizado: " + pessoa.getPeso());
                    break;
                case 4:
                    pessoa.emagrecer(ValidadorInput.obterDouble("Digite o peso para emagrecer:"));
                    System.out.println("Peso atualizado: " + pessoa.getPeso());
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    /**
     * Descrição do exercício:
     * <p>
     * Crie uma classe chamada Produto para modelar informações sobre um produto.
     * Crie um pequeno sistema de compra simples.
     * Atributos: Nome, Preço, Quantidade em Estoque
     * Métodos: atualizarEstoque e exibirDetalhes.
     */
    private static void exercicioProduto() {
        Produto produto = new Produto();
        produto.cadastrar();

        boolean continuar = true;

        while (continuar) {
            switch (ValidadorInput.obterInteiro(produto.exibirOpcoes())) {
                case 1:
                    System.out.println("Estoque anterior: " + produto.getQuantidadeEstoque());
                    produto.atualizarEstoque(ValidadorInput.obterInteiro("Digite a quantidade que deseja comprar: "));
                    System.out.println("Estoque atual: " + produto.getQuantidadeEstoque());
                    break;
                case 2:
                    produto.exibirDetalhes();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    /**
     * Descrição do exercício:
     * <p>
     * Crie uma classe chamada Filme para modelar informações sobre um filme.
     * Crie um pequeno sistema de cadastro de filmes em uma lista.
     * Atributos: Nome, Sinopse, Diretor
     * Métodos: mostrarDetalhes.
     */
    private static void exercicioFilme() {
        ArrayList<Filme> filmes = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            switch (ValidadorInput.obterInteiro(Filme.exibirOpcoes())) {
                case 1:
                    Filme novoFilme = new Filme();
                    novoFilme.cadastrar();
                    filmes.add(novoFilme);
                    break;
                case 2:
                    if (filmes.isEmpty()) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {
                        System.out.println("---- Filmes cadastrados ----");
                        for (Filme filme : filmes) {
                            filme.mostrarDetalhes();
                            System.out.println("\n");
                        }
                    }
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    /**
     * Descrição do exercício:
     * <p>
     * Crie uma classe chamada Funcionário para modelar informações sobre um funcionário.
     * Atributos: Nome, Cargo, Salário, Departamento
     * Métodos: promover e exibirDetalhes.
     */
    private static void exercicioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.cadastrar();

        boolean continuar = true;

        while (continuar) {
            switch (ValidadorInput.obterInteiro(funcionario.exibirOpcoes())) {
                case 1:
                    funcionario.exibirDetalhes();
                    break;
                case 2:
                    funcionario.promover(
                            ValidadorInput.obterString("Digite o novo cargo do funcionário: "),
                            ValidadorInput.obterDouble("Digite o aumento de salário do funcionário: ")
                    );

                    System.out.println("Funcionário promovido a: " + funcionario.getCargo());
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}