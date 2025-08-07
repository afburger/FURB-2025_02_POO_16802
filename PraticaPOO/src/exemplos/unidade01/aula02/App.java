package exemplos.unidade01.aula02;

public class App {

    public static void main(String[] args) {
        // Declaração do objeto.
        Pessoa p1;

        // Criação do objeto
        p1 = new Pessoa();

        // Utilizando o objeto para atribuir valores
        p1.peso = 75;
        p1.altura = 1.75;

        // Utilizando o objeto para leitura
        System.out.println("O peso da pessoa é: " + p1.peso);
    }
}
