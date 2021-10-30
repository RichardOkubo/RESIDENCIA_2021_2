package br.com.residencia.contas;

public class Conta {
	private int numero;
	private String nome;
	private String sobrenome;
	private double saldo;
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			//System.out.println("Saldo insuficiente!");
			this.saldo -= valor;
			return true;
		} else {
			//this.saldo = this.saldo - valor;
			//this.saldo = novoSaldo;
			return false;
		}
	}
	
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	public boolean transferir(double valor, Conta destinatario) {
		//boolean retirou = this.sacar(valor);
		if(this.sacar(valor)) {
			destinatario.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", nome=" + nome + sobrenome + ", saldo=" + saldo + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSaldo() {
		return saldo;
	}
}