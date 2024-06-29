package ExClassePessoa;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void envelhecer() {
        this.setIdade(this.getIdade() + 1);
    }

    public void engordar(double peso) {
        this.setPeso(this.getPeso() + peso);
    }

    public void emagrecer(double peso) {
        this.setPeso(this.getPeso() - peso);
    }

    public void mostrarInformacoes() {
        System.out.println("---- Informações ----");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Peso: " + getPeso() + "kg");
    }

    public void exibirOpcoes() {
        System.out.println("-----------------------------\n" +
                "Escolha uma opção:\n" +
                "[1] Mostrar informações\n" +
                "[2] Envelhecer\n" +
                "[3] Engordar\n" +
                "[4] Emagrecer\n" +
                "[0] Sair\n" +
                "-----------------------------");
    }

    public void cadastrar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        this.setNome(sc.next());

        System.out.println("Digite a idade da pessoa: ");
        this.setIdade(sc.nextInt());

        System.out.println("Digite a altura da pessoa: ");
        this.setAltura(sc.nextDouble());

        System.out.println("Digite o peso da pessoa: ");
        this.setPeso(sc.nextDouble());

        System.out.println("Pessoa Cadastrada!");
        this.mostrarInformacoes();
    }
}
