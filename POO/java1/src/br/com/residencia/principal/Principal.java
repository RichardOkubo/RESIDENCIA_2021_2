package br.com.residencia.principal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.residencia.contas.Conta;
import br.com.residencia.exceptions.ContaException;
import br.com.residencia.menu.MenuPrincipal;
import br.com.residencia.pessoas.Usuario;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
	public char operacao;
	public double valor;
	public String inputCpf;
	public String inputSenha;
	MenuPrincipal menuPrincipal = new MenuPrincipal();

	public void loopMenu() throws ContaException, NullPointerException, InputMismatchException {
		//loop infinito proposital, imita o comportamento de um caixa eletr�nico.

		boolean manterLoop = true;
		do {
			menuInterativo();
		} while (manterLoop == true);
	}

	public void menuInterativo() throws ContaException, NullPointerException, InputMismatchException {

		try {

			imprimeLinhaHorizontal();
			
			System.out.print("Digite seu CPF: ");
			inputCpf = sc.next();
			System.out.print("Digite sua senha: ");
			inputSenha = sc.next();

			Usuario usuario = Usuario.mapaUsuarios.get(inputCpf);

			Conta conta = Conta.mapaContas.get(inputCpf);

			while (usuario == null || !(usuario.getSenha().equalsIgnoreCase(inputSenha))) {
				System.out.println("CPF e/ou Senha incorreto(s)\n\n");

				System.out.print("Digite seu CPF: ");
				inputCpf = sc.next();
				System.out.print("Digite sua senha: ");
				inputSenha = sc.next();

				usuario = Usuario.mapaUsuarios.get(inputCpf);

				conta = Conta.mapaContas.get(inputCpf);
			}

			limpaTela();
			subMenu(usuario, conta);

			imprimeLinhaHorizontal();

		} catch (ContaException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuInterativo();
		}
	}

	// SUBMENU
	public void subMenu(Usuario usuario, Conta conta)
			throws ContaException, NullPointerException, InputMismatchException, IOException {

		try {

			imprimeLinhaHorizontal();
			System.out.println("Bem-vindo(a) ao seu Banco, " + usuario.getNome() + "!\n");
			imprimeLinhaHorizontal();
			System.out.println("Digite o n�mero correspondente � opera��o desejada:");

			MenuPrincipal.menuPrincipal(usuario, conta);

		} catch (ContaException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			subMenu(usuario, conta);
		}
	
	MenuPrincipal.menuPrincipal(usuario, conta);

	}
	public void pulaLinha() {
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
	}

	public void limpaTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	public void imprimeLinhaHorizontal() {
		System.out.println("--------------------------------------------------");
	}
}
