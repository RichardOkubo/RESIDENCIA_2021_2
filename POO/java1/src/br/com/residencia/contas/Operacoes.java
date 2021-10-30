package br.com.residencia.contas;

import br.com.residencia.exceptions.ContaException;

public interface Operacoes {

	void saca(double valor) throws ContaException;

	void deposita(double valor) throws ContaException;

	void transfere(Conta destino, double valor) throws ContaException;
}
