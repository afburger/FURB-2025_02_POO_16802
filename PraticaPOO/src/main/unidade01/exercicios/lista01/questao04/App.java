package unidade01.exercicios.lista01.questao04;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe o nome da pessoa:");
            String nome = teclado.next();

            System.out.println("Informe a altura da pessoa:");
            double altura = teclado.nextDouble();

            System.out.println("Informe o peso da pessoa:");
            double peso = teclado.nextDouble();

            Pessoa pessoa = new Pessoa();
            pessoa.nome = nome;
            pessoa.altura = altura;
            pessoa.peso = peso;

            pessoas[i] = pessoa;
        }

        for (int i = pessoas.length - 1; i >= 0; i--) {
            Pessoa pessoaLeitura = pessoas[i];
            System.out.println("Nome: " + pessoaLeitura.nome);
            System.out.println("Altura: " + pessoaLeitura.altura);
            System.out.println("Peso: " + pessoaLeitura.peso);
            System.out.println("IMC: " + pessoaLeitura.calcularImc());

            System.out.println();
            System.out.println("-----------------");
            System.out.println();



        }
    }
}
