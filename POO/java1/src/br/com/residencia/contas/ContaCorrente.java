package br.com.residencia.contas;

import br.com.residencia.exceptions.ContaException;
import br.com.residencia.tributo.Tributo;

public class ContaCorrente extends Conta implements Tributo {

	private Integer totalSaques = 0, totalDepositos = 0, totalTransferencias = 0;
	private Double totalTributado = 0.0;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}

	@Override
	public double tributarSaque(double valor) {
		return valor + Tributo.SAQUE;
	}

	@Override
	public double tributarDeposito(double valor) {
		return valor - Tributo.DEPOSITO;
	}

	@Override
	public double tributarTransferencia(double valor) {
		return valor + Tributo.TRANSFERENCIA;
	}

	@Override
	public void saca(double valor) throws ContaException {
		
		if (valor < 0) {
			throw new ContaException("O valor digitado para saque � inv�lido!");
		} else {
			double valorTributado = tributarSaque(valor);
			if (this.saldo - valorTributado >= 0) {
				this.saldo -= valorTributado;
				this.totalTributado += Tributo.SAQUE;
				
				// Usamos printf para limitar as casas decimais
				System.out.println("\nOpera��o realizada com sucesso!\n");
				System.out.printf("Valor sacado: R$%.2f%n", valor, "\n");
				System.out.printf("Taxa para saque: R$%.2f%n", Tributo.SAQUE, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.saldo, "\n");
				++totalSaques;
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
			double valorTributado = tributarDeposito(valor);
			if (this.saldo - Tributo.DEPOSITO >= 0) {
				this.saldo += valorTributado;
				this.totalTributado += Tributo.DEPOSITO;

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOpera��o realizada com sucesso!\n");
				System.out.printf("Valor depositado: R$%.2f%n", valor, "\n");
				System.out.printf("Taxa para dep�sito: R$%.2f%n", Tributo.DEPOSITO, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.saldo, "\n");
				++totalDepositos;
			}
		}
	}

	@Override
	public void transfere(Conta destino, double valor) throws ContaException {
		if (valor <= 0) {
			throw new ContaException("O valor digitado para transfer�ncia � inv�lido!");

		} else {

			double valorTributado = tributarTransferencia(valor);

			if (this.saldo - valorTributado >= 0) {
				this.saldo -= valorTributado;
				destino.saldo += valor;
				this.totalTributado += Tributo.TRANSFERENCIA;

				// Usamos printf para limitar as casas decimais
				System.out.println("\nOpera��o realizada com sucesso!\n");
				System.out.println("--------------------------");
				System.out.println("Conta destinat�ria: ");
				System.out.printf("Ag�ncia: " + destino.getNumeroAgencia() + "\n");
				System.out.printf("N�mero: " + destino.getNumeroConta() + "\n");
				System.out.println("--------------------------");
				System.out.printf("Valor transferido: R$%.2f%n", valor, "\n");
				System.out.printf("Taxa para transfer�ncia: R$%.2f%n", Tributo.TRANSFERENCIA, "\n");
				System.out.printf("Saldo atual: R$%.2f%n", this.saldo, "\n");
				
				++totalTransferencias;
			} else {
				System.out.println("Valor digitado excede o saldo dispon�vel!");
			}

		}

	}
	
	public Integer getTotalSaques() {
		return this.totalSaques;
	}

	public Integer getTotalDepositos() {
		return this.totalDepositos;
	}

	public Integer getTotalTransferencias() {
		return this.totalTransferencias;
	}


	public Double getTotalTributado() {
		return this.totalTributado;
	}

	@Override
	public String toString() {
		return "Conta Corrente\tN�mero da Ag�ncia = " + this.numeroAgencia + "\tN�mero da Conta = "
				+ this.numeroConta + "\tSaldo = " + this.saldo + "\tCPF = " + this.cpf + "\n";
	}

}
