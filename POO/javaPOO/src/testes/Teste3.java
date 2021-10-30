package testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

enum Entidade {
	CLIENTE, ATENDENTE, DIRETOR, GERENTE;
}

class Conta {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{")
			.append("Nº").append(numero)
			.append(" | titular: ").append(titular)
			.append(" | saldo: R$").append(saldo)
			.append(" | CPF: ").append(cpf)
			.append(" | ").append(entidade).append("}");
		return builder.toString();
	}

	int numero;
	String titular;
	double saldo;
	String cpf;
	int senha;
	Entidade entidade;
	
	public Conta(int numero, String titular, double saldo, String cpf, int senha, Entidade entidade) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.cpf = cpf;
		this.senha = senha;
		this.entidade = entidade;
	}
}

public class Teste3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		int numero = 0;
		String titular = null;
		double saldo = 0;
		String cpf = null;
		int senha = 0;
		String entidade = null;
		
		Conta conta = null;
		String registro = null;
		
		String n = "0"; // OBS: senha de teste
		
		try (Scanner scannerA = new Scanner(new File("database.txt"))) {
			while (scannerA.hasNextLine() || conta != null) {
				registro = scannerA.nextLine();
				
				if (n.equals(registro.split(";")[0])) {
					try (Scanner scannerB = new Scanner(registro).useDelimiter(";")) {
						numero = scannerB.nextInt();
						titular = scannerB.next();
						saldo = scannerB.nextDouble();
						cpf = scannerB.next();
						senha = scannerB.nextInt();
						entidade = scannerB.next();
						
						conta = new Conta(numero, titular, saldo, cpf, senha, Entidade.valueOf(entidade));
						System.out.println(conta);
						break;
					}
				}
			}
		}
	}
}
