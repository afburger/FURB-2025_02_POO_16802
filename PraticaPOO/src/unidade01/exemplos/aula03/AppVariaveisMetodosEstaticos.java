package unidade01.exemplos.aula03;

import java.util.Scanner;

public class AppVariaveisMetodosEstaticos {

    public static void main(String[] args) {
        imprimeMensagem();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número 1");
        int numero = teclado.nextInt();

        System.out.println("Número elevado ao quadrado: " + Math.pow(numero, 2));

    }

    public static void imprimeMensagem() {
        System.out.println("Estou feliz!");
    }
}
