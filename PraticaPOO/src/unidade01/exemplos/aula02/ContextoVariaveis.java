package unidade01.exemplos.aula02;

public class ContextoVariaveis {

    int variavelA = 20;
    String variavelB = "André";

    void exibeValor(String variavelB) {
        int variavelA = 0;

        this.variavelA = 10;

        System.out.println(variavelA);
        System.out.println(this.variavelB);

        for (int i = 0; i < 10; i++) {
            String hora = "10:00";
            System.out.println(hora + i);
        }
        // Aqui vai gerar erro, pois a variável de bloco só pode ser utilizada no bloco
        //System.out.println(hora);
    }



}
