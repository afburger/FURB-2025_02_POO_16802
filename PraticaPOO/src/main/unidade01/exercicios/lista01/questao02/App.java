package unidade01.exercicios.lista01.questao02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Pessoa pessoa = new Pessoa();

        System.out.println("Informe a altura da pessoa:");
        // pessoa.altura = teclado.nextDouble();
        double altura = teclado.nextDouble();

        System.out.println("Informe o peso da pessoa:");
        double peso = teclado.nextDouble();

        Pessoa pessoa = new Pessoa();
        pessoa.altura = altura;
        pessoa.peso = peso;

        System.out.println("O IMC calculado é: "
                + pessoa.calcularImc());



    }
}
