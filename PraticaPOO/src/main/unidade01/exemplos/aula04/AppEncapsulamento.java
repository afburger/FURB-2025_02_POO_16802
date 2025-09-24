package unidade01.exemplos.aula04;

public class AppEncapsulamento {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("André");
        conta.depositar(1000);
        conta.sacar(50);

        System.out.println("Saldo: " + conta.getSaldo());

        System.out.println("Todos os dados da conta:");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());



    }

}
