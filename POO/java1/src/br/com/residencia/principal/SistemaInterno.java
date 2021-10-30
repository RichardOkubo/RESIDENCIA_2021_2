package br.com.residencia.principal;

import java.io.IOException;
import java.util.InputMismatchException;

import br.com.residencia.IO.LeituraEscrita;
import br.com.residencia.exceptions.ContaException;

public class SistemaInterno {

	public static void main(String[] args)
			throws IOException, InputMismatchException, NullPointerException, ContaException {
		Principal principal = new Principal();

		LeituraEscrita.leitor("entradaDeDados.txt");

		principal.menuInterativo();

	}

}
