package unidade01.exercicios.lista02.questao03;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("Valor não pode ser negativo");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo = saldo - valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Valor não pode ser negativo");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
}
