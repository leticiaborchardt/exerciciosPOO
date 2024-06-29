package ExClasseFuncionario;

import Utils.ValidadorInput;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void promover(String novoCargo, double aumentoSalario) {
        this.setCargo(novoCargo);
        this.setSalario(this.getSalario() + aumentoSalario);
    }

    public void exibirDetalhes() {
        System.out.println("---- Informações do funcionário ----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salário: R$" + this.getSalario());
        System.out.println("Departamento: " + this.getDepartamento());
    }

    public void cadastrar() {
        this.setNome(ValidadorInput.obterString("Digite o nome do funcionário: "));
        this.setCargo(ValidadorInput.obterString("Digite o cargo do funcionário: "));
        this.setSalario(ValidadorInput.obterDouble("Digite salário do funcionário: "));
        this.setDepartamento(ValidadorInput.obterString("Digite o departamento do funcionário: "));

        System.out.println("Funcionário Cadastrado!");

        this.exibirDetalhes();
    }

    public String exibirOpcoes() {
        return "-----------------------------\n" +
                "Escolha uma opção:\n" +
                "[1] Exibir detalhes\n" +
                "[2] Promover\n" +
                "[0] Sair\n" +
                "-----------------------------";
    }
}
