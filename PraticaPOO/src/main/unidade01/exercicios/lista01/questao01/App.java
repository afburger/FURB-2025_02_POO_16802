package unidade01.exercicios.lista01.questao01;

public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.75;
        pessoa.peso = 78;

        double imc = pessoa.calcularImc();

        System.out.println("O IMC calculado é: "
                + imc);
    }
}
