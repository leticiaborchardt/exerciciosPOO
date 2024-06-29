package ExClasseFilme;

import Utils.ValidadorInput;

public class Filme {
    public String nome;
    public String sinopse;
    public String diretor;

    public Filme() {
    }

    public Filme(String nome, String sinopse, String diretor) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void mostrarDetalhes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sinopse: " + this.getSinopse());
        System.out.println("Diretor: " + this.getDiretor());
    }

    public static String exibirOpcoes() {
        return "-----------------------------\n" +
                "Escolha uma opção:\n" +
                "[1] Cadastrar filme\n" +
                "[2] Mostrar detalhes\n" +
                "[0] Sair\n" +
                "-----------------------------";
    }

    public void cadastrar() {
        this.setNome(ValidadorInput.obterString("Digite o nome do filme: "));
        this.setSinopse(ValidadorInput.obterString("Digite a sinopse do filme: "));
        this.setDiretor(ValidadorInput.obterString("Digite o nome do diretor do filme: "));

        System.out.println("Filme Cadastrado!");
    }
}
