package unidade01.exemplos.aula03;

public class AppSobrecarga {

    public static void main(String[] args) {

        PessoaSobrecarga p1 = new PessoaSobrecarga();

        p1.setAltura(1.79);
        p1.setPeso(60.5);

        System.out.println("IMC calculado: " + p1.calcularImc());

        System.out.println("---------------");

        System.out.println("IMC calculado com parâmetro: " + p1.calcularImc(20));


    }
}
