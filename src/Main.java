import ExClassePessoa.Pessoa;
import ExClasseProduto.Produto;
import Utils.ValidadorInput;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            switch (ValidadorInput.obterInteiro(exibirOpcoes())) {
                case 1 -> exercicioPessoa();
                case 2 -> exercicioProduto();
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
                "[0] Sair" + "\n" +
                "-----------------------------";
    }

    public static void exercicioPessoa() {
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

    public static void exercicioProduto() {
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
}