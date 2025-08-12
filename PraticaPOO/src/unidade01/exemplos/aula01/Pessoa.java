package unidade01.exemplos.aula01;

public class Pessoa {

    double peso;
    double altura;

    double calcularImc() {
        return peso / (altura * altura);
    }

    void comer(double quantidade) {
        peso = peso + (quantidade/1000);
    }

}
