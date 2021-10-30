package br.com.residencia.main;

import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaCorrenteEspecial;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.contas.ContaPoupancaEspecial;

public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaPoupancaEspecial contaPoupancaEspecial = new ContaPoupancaEspecial();
		
		Conta contaDeby = new Conta();
		contaDeby.setNumero(1);
		contaDeby.setNome("Déby");
		contaDeby.setSobrenome(" Souza");
		contaDeby.depositar(500);
		System.out.println(contaDeby.toString());
		
		Conta contaFelipe = new Conta();
		contaFelipe.setNumero(2);
		contaFelipe.setNome("Eduardo ");
		contaFelipe.setSobrenome("de Carvalho");
		contaFelipe.depositar(1500);
		System.out.println(contaFelipe.toString());
		
		//contaFelipe.sacar(50);
		//System.out.println(contaFelipe.toString());
		
//		int valorSaque = 50;
//		if(contaDeby.sacar(valorSaque)) {
//			System.out.println("Operação realizada!\n" + contaDeby.toString() + "\n" + contaFelipe.toString());
//		} else {
//			System.out.println("Saldo insuficiente!" + contaDeby.saldo);
//		}

		int valorTransferencia = 300;
		if(contaDeby.transferir(valorTransferencia, contaFelipe)) {
			System.out.println("\nOperação realizada!\n" + contaDeby.toString() + "\n" + contaFelipe.toString());
		} else {
			System.out.println("Saldo insuficiente!\n" + contaDeby.toString() + "\n" + contaFelipe.toString());
		}		
		
	}

}