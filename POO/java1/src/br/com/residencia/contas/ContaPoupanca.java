package br.com.residencia.contas;

import br.com.residencia.exceptions.ContaException;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}

	//c�lculo da previs�o de rendimento mediante um valor qualquer
	public void previsaoDeRendimento(double valor, int dias) {
		double valorRendimento;
		valorRendimento = (valor * 0.1) * dias;

		System.out.printf("\nO rendimento estimado daqui a " + dias + " dias ser� de: R$%.2f%n", valorRendimento);
		System.out.printf("\nO valor total ser� de: R$%.2f%n", valorRendimento + valor);
	}

	@Override
	public void saca(double valor) throws ContaException {
		if (valor < 0) {

			throw new ContaException("O valor digitado para saque � inv�lido!");

		} else {

			if (this.saldo >= 0 && this.saldo >= valor) {

				this.saldo -= valor;

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOpera��o realizada com sucesso!\n");
				System.out.printf("Valor sacado: R$%.2f%n", valor, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.saldo, "\n");

				// LeituraEscrita.comprovanteSaque(usuario, valor);
			} else {
				System.out.println("Valor digitado excede o saldo dispon�vel!");
			}

		}

	}

	@Override
	public void deposita(double valor) throws ContaException {
		if (valor < 0) {

			throw new ContaException("O valor digitado para dep�sito � inv�lido!");

		} else {

			this.saldo += valor;

			// Usamos printf para limitar as casas decimais
			System.out.println("\nOpera��o realizada com sucesso!\n");
			System.out.printf("Valor depositado: R$%.2f%n", valor, "\n");
			System.out.printf("Saldo atual: R$%.2f%n", this.saldo, "\n");
		}

	}

	@Override
	public void transfere(Conta destino, double valor) throws ContaException {

		if (valor < 0) {

			throw new ContaException("O valor digitado para transfer�ncia � inv�lido!");

		} else {

			if (this.saldo >= 0 && this.saldo >= valor) {

				this.saldo -= valor;
				destino.saldo += valor;

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOpera��o realizada com sucesso!\n");
				System.out.println("--------------------------");
				System.out.println("Conta destinat�ria: ");
				System.out.printf("Ag�ncia: " + destino.getNumeroAgencia() + "\n");
				System.out.printf("N�mero: " + destino.getNumeroConta() + "\n");
				System.out.println("--------------------------");
				System.out.printf("Valor transferido: R$%.2f%n", valor, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.saldo, "\n");
			} else {
				System.out.println("Valor digitado excede o saldo dispon�vel!");
			}

		}

	}

	@Override
	public String toString() {
		return "Conta Poupan�a\tN�mero da Ag�ncia = " + this.numeroAgencia + "\tN�mero da Conta = "
				+ this.numeroConta + "\tSaldo = " + this.saldo + "\tCPF = " + this.cpf + "\n";
	}
}
