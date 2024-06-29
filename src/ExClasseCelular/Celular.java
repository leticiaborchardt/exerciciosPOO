package ExClasseCelular;

import Utils.ValidadorInput;

import java.util.ArrayList;

public class Celular {
    private String marca;
    private String modelo;
    private int armazenamento;
    private ArrayList<String> aplicativosInstalados = new ArrayList<>();

    public Celular() {
    }

    public Celular(String marca, String modelo, int armazenamento, ArrayList<String> aplicativosInstalados) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.aplicativosInstalados = aplicativosInstalados;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public ArrayList<String> getAplicativosInstalados() {
        return aplicativosInstalados;
    }

    public void setAplicativosInstalados(ArrayList<String> aplicativosInstalados) {
        this.aplicativosInstalados = aplicativosInstalados;
    }

    public void instalarAplicativo(String nome) {
        aplicativosInstalados.add(nome);
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Armazenamento: " + this.getArmazenamento() + " GB");

        if (!this.getAplicativosInstalados().isEmpty()) {
            System.out.println("Aplicativos instalados:");

            for (String aplicativo : this.getAplicativosInstalados()) {
                System.out.println(" - " + aplicativo);
            }
        }
    }

    public void cadastrar() {
        this.setMarca(ValidadorInput.obterString("Digite a marca do celular: "));
        this.setModelo(ValidadorInput.obterString("Digite o modelo do celular: "));
        this.setArmazenamento(ValidadorInput.obterInteiro("Digite armazenamento do celular em GB: "));

        System.out.println("Celular Cadastrado!");

        this.exibirInformacoes();
    }

    public String exibirOpcoes() {
        return "-----------------------------\n" +
                "Escolha uma opção:\n" +
                "[1] Exibir informações\n" +
                "[2] Instalar aplicativo\n" +
                "[0] Sair\n" +
                "-----------------------------";
    }
}
