package unidade03.exemplos.aula14.main;

import unidade03.exemplos.aula14.ContaBancaria;
import unidade03.exemplos.aula14.ContaEspecial;

public class MainConta {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		cb.depositar(1000.00);
		cb.setNumero(1);

		ContaBancaria c2 = new ContaBancaria();
		c2.depositar(2000.00);
		c2.setNumero(1);

		ContaEspecial ce = new ContaEspecial();
		ce.depositar(1000.00);
		ce.setLimiteCredito(5000.00);
		ce.setNumero(2);

		try {
			cb.sacar(2500);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			ce.sacar(6500);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Saldo conta1: " + cb);

		System.out.println("Saldo conta2: " +ce);

		if (cb.equals(ce)) {
			System.out.println("Conta iguais");
		} else {
			System.out.println("Conta diferentes");
		}

	}
}
