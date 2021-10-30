package br.com.residencia.menu;

import java.io.IOException;
import java.util.InputMismatchException;

import br.com.residencia.IO.LeituraEscrita;
import br.com.residencia.contas.Conta;
import br.com.residencia.enums.PessoaTipoEnum;
import br.com.residencia.exceptions.ContaException;
import br.com.residencia.pessoas.Usuario;
import br.com.residencia.principal.Principal;

public class MenuPrincipal {
	double inputValor;
	static String inputCpf;
	int operacao;

	public static void menuPrincipal(Usuario usuario, Conta conta)
			throws InputMismatchException, NullPointerException, ContaException, IOException {
		Principal principal = new Principal();

		try {

			principal.pulaLinha();
			System.out.println("[1]\tSaque");
			System.out.println("[2]\tDeposito");
			System.out.println("[3]\tTransfer�ncia");
			System.out.println("[4]\tSaldo");
			System.out.println("[5]\tRelat�rio");
			System.out.println("[6]\tSair");
			principal.imprimeLinhaHorizontal();

			System.out.print("Digite a op��o desejada: ");
			int opcaoOperacao = Principal.sc.nextInt();
			Double inputValor;

			switch (opcaoOperacao) {
			case 1:
				principal.imprimeLinhaHorizontal();
				System.out.print("Digite o valor que deseja sacar: ");
				inputValor = Double.parseDouble(Principal.sc.next());

				conta.saca(inputValor);

				LeituraEscrita.comprovanteSaque(conta, inputValor);

				principal.pulaLinha();

				break;
			case 2:
				principal.imprimeLinhaHorizontal();
				System.out.print("Digite o valor que deseja depositar: ");
				inputValor = Double.parseDouble(Principal.sc.next());

				conta.deposita(inputValor);

				LeituraEscrita.comprovanteDeposito(conta, inputValor);

				principal.pulaLinha();

				break;
			case 3:
				principal.limpaTela();
				System.out.println("Digite o CPF da conta destinat�ria: ");
				inputCpf = Principal.sc.next();
				Conta destino = Conta.mapaContas.get(inputCpf);

				while (destino == null) {

					System.out.println("CPF inv�lido!\n\n\n");
					System.out.println("Digite o CPF da conta destinat�ria: ");
					principal.inputCpf = Principal.sc.next();
					destino = Conta.mapaContas.get(inputCpf);

				}

				System.out.println("Digite o valor a ser transferido: ");
				inputValor = Double.parseDouble(Principal.sc.next());

				conta.transfere(destino, inputValor);

				LeituraEscrita.comprovanteTransferencia(conta, inputValor, destino);

				principal.pulaLinha();

				break;
			case 4:
				System.out.printf("Seu saldo �: R$%.2f%n", conta.getSaldo());

				principal.pulaLinha();

				break;
			case 5:

				principal.limpaTela();
				if (usuario.getTipoUsuario().equalsIgnoreCase(PessoaTipoEnum.CLIENTE.getTipoUsuario())) {
					MenuRelatorio.menuRelatorio(PessoaTipoEnum.CLIENTE.getIdTipoUsuario(), usuario, conta);
				} else if (usuario.getTipoUsuario().equalsIgnoreCase(PessoaTipoEnum.GERENTE.getTipoUsuario())) {
					MenuRelatorio.menuRelatorio(PessoaTipoEnum.GERENTE.getIdTipoUsuario(), usuario, conta);
				} else if (usuario.getTipoUsuario().equalsIgnoreCase(PessoaTipoEnum.DIRETOR.getTipoUsuario())) {
					MenuRelatorio.menuRelatorio(PessoaTipoEnum.DIRETOR.getIdTipoUsuario(), usuario, conta);
				} else if (usuario.getTipoUsuario().equalsIgnoreCase(PessoaTipoEnum.PRESIDENTE.getTipoUsuario())) {
					MenuRelatorio.menuRelatorio(PessoaTipoEnum.PRESIDENTE.getIdTipoUsuario(), usuario, conta);
				}
				break;

			case 6:

				principal.limpaTela();
				principal.menuInterativo();
				break;

			default:

				principal.pulaLinha();
				System.out.println("Op��o inv�lida!");

			}

			menuPrincipal(usuario, conta);

		} catch (

		ContaException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuPrincipal(usuario, conta);
		}
	}
}