package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Classe auxiliar para validar a entrada de dados do usuário através do Scanner.
 */
public class ValidadorInput {
    static Scanner sc = new Scanner(System.in);

    public static String obterString(String mensagem) {
        return obterValor(mensagem, sc::next, "Entrada inválida");
    }

    public static int obterInteiro(String mensagem) {
        return obterValor(mensagem, sc::nextInt, "Insira somente valores inteiros.");
    }

    public static double obterDouble(String mensagem) {
        return obterValor(mensagem, sc::nextDouble, "Insira um valor numérico decimal (utilize vírgula).");
    }

    private static <T> T obterValor(String mensagem, Supplier<T> supplier, String mensagemErro) {
        System.out.println(mensagem);

        while (true) {
            try {
                var valor = supplier.get();
                sc.nextLine();

                return valor;
            } catch (InputMismatchException e) {
                System.out.println(mensagemErro);
                sc.next();
            }
        }
    }
}
