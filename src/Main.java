import ExClassePessoa.Pessoa;
import ExClasseProduto.Produto;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            exibirOpcoes();

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> exercicioPessoa();
                case 2 -> exercicioProduto();
                case 0 -> continuar = false;
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    public static void exibirOpcoes() {
        System.out.println("-----------------------------" + "\n" +
                "LISTA DE EXERCÍCIOS POO 3" + "\n" +
                "-----------------------------" + "\n" +
                "Escolha o exercício: " + "\n" +
                "[1] Classe Pessoa" + "\n" +
                "[2] Classe Produto" + "\n" +
                "[0] Sair" + "\n" +
                "-----------------------------");
    }

    public static void exercicioPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.cadastrar();

        boolean continuar = true;

        while (continuar) {
            pessoa.exibirOpcoes();

            switch (sc.nextInt()) {
                case 1:
                    pessoa.mostrarInformacoes();
                    break;
                case 2:
                    System.out.println("Idade anterior: " + pessoa.getIdade());
                    pessoa.envelhecer();
                    System.out.println("Feliz aniversário!\nIdade atual: " + pessoa.getIdade());
                    break;
                case 3:
                    System.out.println("Digite o peso para engordar:");
                    pessoa.engordar(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Digite o peso para emagrecer:");
                    pessoa.emagrecer(sc.nextDouble());
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
            produto.exibirOpcoes();

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Estoque anterior: " + produto.getQuantidadeEstoque());
                    System.out.println("Digite a quantidade que deseja comprar: ");
                    produto.atualizarEstoque(sc.nextInt());
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