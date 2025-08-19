package unidade01.exercicios.lista02.questao03;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        System.out.println("Informe o número da primeira conta bancária");
        conta1.setNumero(teclado.next());

        System.out.println("Informe o nome do titular da primeira conta bancária");
        conta1.setTitular(teclado.next());

        System.out.println("Informe o número da segunda conta bancária");
        conta2.setNumero(teclado.next());

        System.out.println("Informe o nome do titular da segunda conta bancária");
        conta2.setTitular(teclado.next());

        // a.
        conta1.depositar(1000.00);
        conta1.depositar(700.00);

        // b.
        conta2.depositar(5000.00);

        // c.
        conta2.sacar(3000.00);

        // d.
        conta2.transferir(conta1, 1800.00);

        System.out.println("Titular conta 1: " + conta1.getTitular());
        System.out.println("Saldo da conta 1: " + conta1.getSaldo());

        System.out.println("-----------------------");

        System.out.println("Titular conta 2: " + conta2.getTitular());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());

    }
}


