package unidade01.exercicios.lista01.questao04;

public class Pessoa {

    double altura;
    double peso;
    String nome;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
