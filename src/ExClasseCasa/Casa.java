package ExClasseCasa;

import Utils.ValidadorInput;

public class Casa {
    private Endereco endereco;
    private int numeroQuartos;
    private double area;
    private double valor;

    public Casa() {
    }

    public Casa(Endereco endereco, int numeroQuartos, double area, double valor) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.area = area;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirDetalhes() {
        System.out.println("---- Endereço ----");
        this.endereco.exibirDetalhes();

        System.out.println("------ Casa ------");
        System.out.println("Nº de quartos: " + this.getNumeroQuartos());
        System.out.println("Área: " + this.getArea() + "m²");
        System.out.println("Valor: R$" + this.getValor());
    }

    public double calcularValorImposto(double taxa) {
        return this.getValor() * taxa;
    }

    public void cadastrar() {
        Endereco endereco = new Endereco();
        endereco.cadastrar();

        this.setEndereco(endereco);

        this.setNumeroQuartos(ValidadorInput.obterInteiro("Digite a quantidade de quartos que a casa possui: "));
        this.setArea(ValidadorInput.obterDouble("Digite a área em m²: "));
        this.setValor(ValidadorInput.obterDouble("Digite o valor de venda da casa: "));

        System.out.println("Casa Cadastrada!");

        this.exibirDetalhes();
    }

    public String exibirOpcoes() {
        return "-----------------------------\n" +
                "Escolha uma opção:\n" +
                "[1] Exibir detalhes\n" +
                "[2] Calcular imposto de renda\n" +
                "[0] Sair\n" +
                "-----------------------------";
    }
}
