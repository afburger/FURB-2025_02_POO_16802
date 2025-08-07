package exemplos.unidade01.aula02;

public class App2 {

    public static void main(String[] args) {
        // Declaração do objeto.
        Pessoa p1;
        Pessoa p2;
        Pessoa p3;
        // Criação do objeto
        p1 = new Pessoa();
        p3 = new Pessoa();
        p2 = p1;

        // Utilizando o objeto para atribuir valores
        p1.peso = 75;
        p1.altura = 1.75;

        p3.altura = 1.69;
        p3.peso = 60;

        // Utilizando o objeto para leitura
        System.out.println("O peso da pessoa é: " + p1.altura);

        p2.altura = 1.90;

        // Utilizando o objeto para leitura
        System.out.println("O peso da pessoa1 é: " + p1.altura);
        System.out.println("O peso da pessoa2 é: " + p1.altura);

        System.out.println("O altura da pessoa3 é: " + p3.altura);
        System.out.println("O peso da pessoa3 é: " + p3.peso);

    }
}
