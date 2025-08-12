package unidade01.exercicios.lista01.questao03;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe a altura da pessoa:");
            double altura = teclado.nextDouble();

            System.out.println("Informe o peso da pessoa:");
            double peso = teclado.nextDouble();

            pessoa.altura = altura;
            pessoa.peso = peso;

            System.out.println("IMC calculado: "
                + pessoa.calcularImc());
        }
    }
}
