package ExClassePessoa;

import Utils.ValidadorInput;

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
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "kg");
    }

    public void cadastrar() {
        this.setNome(ValidadorInput.obterString("Digite o nome da pessoa: "));
        this.setIdade(ValidadorInput.obterInteiro("Digite a idade da pessoa: "));
        this.setAltura(ValidadorInput.obterDouble("Digite a altura da pessoa: "));
        this.setPeso(ValidadorInput.obterDouble("Digite o peso da pessoa: "));

        System.out.println("Pessoa Cadastrada!");

        this.mostrarInformacoes();
    }

    public String exibirOpcoes() {
        return "-----------------------------\n" +
                "Escolha uma opção:\n" +
                "[1] Mostrar informações\n" +
                "[2] Envelhecer\n" +
                "[3] Engordar\n" +
                "[4] Emagrecer\n" +
                "[0] Sair\n" +
                "-----------------------------";
    }
}
