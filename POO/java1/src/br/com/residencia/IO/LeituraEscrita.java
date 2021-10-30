package br.com.residencia.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import br.com.residencia.contas.Conta;
import br.com.residencia.contas.ContaCorrente;
import br.com.residencia.contas.ContaPoupanca;
import br.com.residencia.enums.ContaTipoEnum;
import br.com.residencia.enums.PessoaTipoEnum;
import br.com.residencia.pessoas.Cliente;
import br.com.residencia.pessoas.Diretor;
import br.com.residencia.pessoas.Gerente;
import br.com.residencia.pessoas.Presidente;
import br.com.residencia.pessoas.Usuario;
import br.com.residencia.principal.Principal;
import br.com.residencia.tributo.Tributo;

public class LeituraEscrita {
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));

		String linha = "";

		while (true) {
			linha = buffRead.readLine();

			if (linha != null) {
				String[] dados = linha.split(";");

				if (dados[0].equalsIgnoreCase(ContaTipoEnum.CORRENTE.getTipoConta())) {

					ContaCorrente cc = new ContaCorrente(dados[0], Integer.parseInt(dados[1]),
							Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4]);

					Conta.mapaContas.put(dados[4], cc);

				} else if (dados[0].equalsIgnoreCase(ContaTipoEnum.POUPANCA.getTipoConta())) {

					ContaPoupanca cp = new ContaPoupanca(dados[0], Integer.parseInt(dados[1]),
							Integer.parseInt(dados[2]), Double.parseDouble(dados[3]), dados[4]);

					Conta.mapaContas.put(dados[4], cp);

				} else if (dados[0].equalsIgnoreCase(PessoaTipoEnum.CLIENTE.getTipoUsuario())) {

					Cliente cli = new Cliente(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
							Integer.parseInt(dados[5]));

					Usuario.mapaUsuarios.put(dados[2], cli);
					Usuario.OrdenaUsuarios.put(dados[1], cli);

				} else if (dados[0].equalsIgnoreCase(PessoaTipoEnum.GERENTE.getTipoUsuario())) {

					Gerente gerente = new Gerente(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
							Integer.parseInt(dados[5]), Double.parseDouble(dados[6]), Integer.parseInt(dados[7]));

					Usuario.mapaUsuarios.put(dados[2], gerente);
					Usuario.OrdenaUsuarios.put(dados[1], gerente);

				} else if (dados[0].equalsIgnoreCase(PessoaTipoEnum.DIRETOR.getTipoUsuario())) {

					Diretor diretor = new Diretor(dados[0], dados[1], dados[2], dados[3], Integer.parseInt(dados[4]),
							Integer.parseInt(dados[5]), Double.parseDouble(dados[6]));

					Usuario.mapaUsuarios.put(dados[2], diretor);
					Usuario.OrdenaUsuarios.put(dados[1], diretor);

				} else if (dados[0].equalsIgnoreCase(PessoaTipoEnum.PRESIDENTE.getTipoUsuario())) {

					Presidente presidente = new Presidente(dados[0], dados[1], dados[2], dados[3],
							Integer.parseInt(dados[4]), Integer.parseInt(dados[5]), Double.parseDouble(dados[6]));

					Usuario.mapaUsuarios.put(dados[2], presidente);
					Usuario.OrdenaUsuarios.put(dados[1], presidente);

				}

			} else {

				break;

			}
		}

		buffRead.close();

	}

	public static void escritor(String path) throws IOException {

		System.out.println("Digite o nome do arquivo: ");
		String nomeArquivo = Principal.sc.next();

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO));

		String linha = "";

		System.out.println("Escreva algo: ");
		linha = Principal.sc.next();

		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

	public static void comprovanteSaque(Conta conta, double valorSaque) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_transacoes";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** SAQUE ***************";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia: " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "Valor: R$" + valorSaque;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM DO SAQUE ***************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	public static void comprovanteDeposito(Conta conta, double valorDeposito) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_transacoes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** DEP�SITO ***************";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia: " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "Valor: R$" + valorDeposito;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM DO DEP�SITO ***************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	public static void debitoDoSeguro(Conta conta, double valorSeguro) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_tributacao";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** SEGURO DE VIDA ***************";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia: " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "Valor do seguro: R$" + valorSeguro;
		buffWrite.append(linha + "\n");

		linha = "Debito na contrata��o do Seguro: R$" + valorSeguro * 0.2;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "********************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	public static void comprovanteTransferencia(Conta conta, double valorTransferencia, Conta destino)
			throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_transacoes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** TRANSFER�NCIA REALIZADA ***************";
		buffWrite.append(linha + "\n\n");

		linha = "*********** DADOS DO REMETENTE **********";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia : " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "********** DADOS DO DESTINAT�RIO ***********";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + destino.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia: " + destino.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + destino.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "***********************************************";
		buffWrite.append(linha + "\n");

		linha = "Valor: R$" + valorTransferencia;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM DA TRANSFER�NCIA ***************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

		// REGISTRAR DADOS NO COMPROVANTE DO DESTINAT�RIO

		nomeArquivo = destino.getCpf() + "_" + destino.getNumeroAgencia() + "_" + destino.getNumeroConta()
				+ "_transacoes";

		buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		linha = "*************** TRANSFER�NCIA RECEBIDA ***************";
		buffWrite.append(linha + "\n\n");

		linha = "*********** DADOS DO REMETENTE **********";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia : " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "********** DADOS DO DESTINAT�RIO ***********";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + destino.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia: " + destino.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + destino.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "***********************************************";
		buffWrite.append(linha + "\n");

		linha = "Valor: R$" + valorTransferencia;
		buffWrite.append(linha + "\n");

		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM DA TRANSFER�NCIA ***************";
		buffWrite.append(linha + "\n");

		buffWrite.close();

	}

	public static void relatorioTributacaoContaCorrente(Conta conta) throws IOException {
		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_tributacoes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** TOTAL DE TRIBUTA��ES ***************";
		buffWrite.append(linha + "\n\n");

		linha = "Total gasto com transa��es = R$" + ((ContaCorrente) conta).getTotalTributado();
		buffWrite.append(linha + "\n");

		linha = "Taxa para saque = R$" + Tributo.SAQUE;
		buffWrite.append(linha + "\n");

		linha = "Total de saques realizados = " + ((ContaCorrente) conta).getTotalSaques();
		buffWrite.append(linha + "\n\n");

		linha = "Taxa para deposito = R$" + Tributo.DEPOSITO;
		buffWrite.append(linha + "\n");

		linha = "Total de dep�sitos realizados = " + ((ContaCorrente) conta).getTotalDepositos();
		buffWrite.append(linha + "\n\n");

		linha = "Taxa para tranfer�ncia = R$" + Tributo.TRANSFERENCIA;
		buffWrite.append(linha + "\n");

		linha = "Total de transfer�ncias realizadas = " + ((ContaCorrente) conta).getTotalTransferencias();
		buffWrite.append(linha + "\n\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "****************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	public static void relatorioRendimentoPoupanca(Conta conta, Double valor, Integer dias) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_rendimento";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** SIMULA��O DE RENDIMENTO ***************";
		buffWrite.append(linha + "\n\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia : " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "*******************************************************";
		buffWrite.append(linha + "\n\n");

		linha = "Valor simulado = R$" + valor;
		buffWrite.append(linha + "\n");

		linha = "Dias de rendimento = " + dias;
		buffWrite.append(linha + "\n");

		linha = "Total estimado = R$" + (valor + ((valor * 0.1) * dias));
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*******************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	public static void relatorioContasPorAgencia(Conta conta) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_contas_por_agencia";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		int totalContas = 0;

		String linha = "********************** INFORMA��ES DO RESPONS�VEL **********************";
		buffWrite.append(linha + "\n\n");

		linha = "CPF: " + conta.getCpf();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia : " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "*******************************************************";
		buffWrite.append(linha + "\n\n");

		linha = "*************** TOTAL DE CONTAS NA MESMA AG�NCIA ***************";
		buffWrite.append(linha + "\n\n");

		for (String cpf : Conta.mapaContas.keySet()) {
			if (Conta.mapaContas.get(cpf).getNumeroAgencia().equals(conta.getNumeroAgencia())) {

				linha = "CPF: " + Conta.mapaContas.get(cpf).getCpf();
				buffWrite.append(linha + "\n");

				linha = "Ag�ncia : " + Conta.mapaContas.get(cpf).getNumeroAgencia();
				buffWrite.append(linha + "\n");

				linha = "Conta: " + Conta.mapaContas.get(cpf).getNumeroConta();
				buffWrite.append(linha + "\n");

				totalContas++;

				linha = "**********************************";
				buffWrite.append(linha + "\n");
			}

		}

		linha = "Total de contas: " + totalContas;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "************************************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	public static void relatorioTotalClientes(Conta conta, TreeMap<String, Usuario> OrdenaUsuarios) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_total_clientes";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "************************* TOTAL DE CLIENTES *************************";
		buffWrite.append(linha + "\n\n");

		for (String nome : Usuario.OrdenaUsuarios.keySet()) {

			linha = Usuario.OrdenaUsuarios.get(nome).relatorioInformacoes();
			buffWrite.append(linha + "\n");

			linha = "****************************************************************";
			buffWrite.append(linha + "\n");

		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*********************************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	public static void relatorioTotalCapital(Conta conta, Map<String, Conta> mapaContas) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_total_capital";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		double saldoTotal = 0.0;

		String linha = "************************* TOTAL DE CAPITAL ARMAZENADO *************************";
		buffWrite.append(linha + "\n\n");

		for (String cpf : Conta.mapaContas.keySet()) {

			saldoTotal += Conta.mapaContas.get(cpf).getSaldo();

		}

		linha = "O total de capital armazenado no banco � de: R$" + saldoTotal;
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*******************************************************************************";
		buffWrite.append(linha + "\n\n");

		buffWrite.close();

	}

	public static void comprovanteSaldo(Conta conta) throws IOException {

		String nomeArquivo = conta.getCpf() + "_" + conta.getNumeroAgencia() + "_" + conta.getNumeroConta()
				+ "_comprovanteSaldo";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO, true));

		String linha = "*************** SALDO ***************";
		buffWrite.append(linha + "\n");

		linha = "Tipo: " + conta.getTipoConta();
		buffWrite.append(linha + "\n");

		linha = "Ag�ncia: " + conta.getNumeroAgencia();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "Saldo: R$" + conta.getSaldo();
		buffWrite.append(linha + "\n");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		linha = "Opera��o realizada em: " + simpleDateFormat.format(date);
		buffWrite.append(linha + "\n");

		linha = "*************** FIM ***************";
		buffWrite.append(linha + "\n");

		buffWrite.close();

	}

}
