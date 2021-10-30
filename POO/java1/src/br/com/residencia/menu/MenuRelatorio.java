package br.com.residencia.menu;

import java.io.IOException;
import java.util.InputMismatchException;

import br.com.residencia.IO.LeituraEscrita;
import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.enums.ContaTipoEnum;
import br.com.residencia.enums.PessoaTipoEnum;
import br.com.residencia.exceptions.ContaException;
import br.com.residencia.pessoas.Usuario;
import br.com.residencia.principal.Principal;
import br.com.residencia.tributo.Tributo;

public class MenuRelatorio {
	Principal principal = new Principal();
	int teste;
	int operacao;
	MenuPrincipal menuPrincipal = new MenuPrincipal();

	public static void menuRelatorio(Integer idUsuario, Usuario usuario, Conta conta)
			throws IOException, InputMismatchException, NullPointerException, ContaException {

		Principal principal = new Principal();

		principal.pulaLinha();

		if (conta.getTipoConta().equalsIgnoreCase(ContaTipoEnum.CORRENTE.getTipoConta())) {

			System.out.println("[1]\tTributa��o conta corrente");

		} else {

			
			System.out.println("[1]\tSimulacao de rendimento");

		}
		if (idUsuario >= 2) {
			System.out.println("[2]\tN�mero de contas da sua agencia");
			if (idUsuario >= 3) {
				System.out.println("[3]\tInforma��es de Nome, CPF e Ag�ncia de todos os clientes");
				if (idUsuario >= 4) {
					System.out.println("[4]\tValor total do capital armazenado");
				}
			}
		}
		System.out.println("[5]\tVoltar");
		imprimeLinhaHorizontal();

		System.out.print("Digite a op��o desejada: ");
		int operacao = Principal.sc.nextInt();

		principal.pulaLinha();

		switch (operacao) {

		case 1:

			if (conta.getTipoConta().equalsIgnoreCase(ContaTipoEnum.CORRENTE.getTipoConta())) {

				System.out.printf("O total gasto com opera��es foi de R$%.2f%n",
						((ContaCorrente) conta).getTotalTributado());
				System.out.printf("O valor cobrado para cada saque � de R$%.2f%n", Tributo.SAQUE);
				System.out.println("Total de saques realizados: " + ((ContaCorrente) conta).getTotalSaques());
				System.out.printf("O valor cobrado para cada deposito � de R$%.2f%n", Tributo.DEPOSITO);
				System.out.println("Total de dep�sitos realizados: " + ((ContaCorrente) conta).getTotalDepositos());
				System.out.printf("O valor cobrado para cada tranfer�ncia � de R$%.2f%n", Tributo.TRANSFERENCIA);
				System.out.println(
						"Total de transfer�ncias realizadas: " + ((ContaCorrente) conta).getTotalTransferencias());

				LeituraEscrita.relatorioTributacaoContaCorrente(conta);

			} else {

				int inputDias;
				double inputValor;

				System.out.println("Digite o valor que deseja usar para a simula��o: ");
				inputValor = Double.parseDouble(Principal.sc.next());

				System.out.println("Digite o n�mero de dias para a simula��o: ");
				inputDias = Principal.sc.nextInt();

				((ContaPoupanca) conta).previsaoDeRendimento(inputValor, inputDias);

				LeituraEscrita.relatorioRendimentoPoupanca(conta, inputValor, inputDias);

			}

			selecaoRelatorio(conta, usuario);

			break;

		case 2:

			int total = 0;
			for (String cpf : Conta.mapaContas.keySet()) {
				if (Conta.mapaContas.get(cpf).getNumeroAgencia().equals(conta.getNumeroAgencia())) {

					System.out.println(Conta.mapaContas.get(cpf));
					total++;
				}

			}
			System.out.println("Total de contas: " + total);

			LeituraEscrita.relatorioContasPorAgencia(conta);

			selecaoRelatorio(conta, usuario);

			break;

		case 3:

			for (String nome : Usuario.OrdenaUsuarios.keySet()) {

				System.out.println(Usuario.OrdenaUsuarios.get(nome).relatorioInformacoes());

			}

			LeituraEscrita.relatorioTotalClientes(conta, Usuario.OrdenaUsuarios);

			selecaoRelatorio(conta, usuario);

			break;

		case 4:

			double saldoTotal = 0.0;
			for (String cpf : Conta.mapaContas.keySet()) {

				saldoTotal += Conta.mapaContas.get(cpf).getSaldo();

			}

			System.out.println("O total de capital armazenado no banco � de: R$" + saldoTotal);

			LeituraEscrita.relatorioTotalCapital(conta, Conta.mapaContas);

			selecaoRelatorio(conta, usuario);

			break;

		case 5:

			principal.limpaTela();
			MenuPrincipal.menuPrincipal(usuario, conta);
			break;

		default:

			principal.pulaLinha();
			System.out.println("Op��o inv�lida!");
			selecaoRelatorio(conta, usuario);

		}

	}

	public static void selecaoRelatorio(Conta conta, Usuario usuario)
			throws InputMismatchException, NullPointerException, ContaException, IOException {

		if (usuario.getTipoUsuario().equalsIgnoreCase(PessoaTipoEnum.CLIENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(PessoaTipoEnum.CLIENTE.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getTipoUsuario().equalsIgnoreCase(PessoaTipoEnum.GERENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(PessoaTipoEnum.GERENTE.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getTipoUsuario().equalsIgnoreCase(PessoaTipoEnum.DIRETOR.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(PessoaTipoEnum.DIRETOR.getIdTipoUsuario(), usuario, conta);
		} else if (usuario.getTipoUsuario().equalsIgnoreCase(PessoaTipoEnum.PRESIDENTE.getTipoUsuario())) {
			MenuRelatorio.menuRelatorio(PessoaTipoEnum.PRESIDENTE.getIdTipoUsuario(), usuario, conta);
		}
	}

	public static void imprimeLinhaHorizontal() {
		System.out.println("--------------------------------------------------");
	}

}
