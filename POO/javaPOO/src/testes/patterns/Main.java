package testes.patterns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

class BancoDeDados {
	private static String arquivo = "DataBase.txt";
	
	public static boolean verificar(String... dados) {
		boolean validado = false;
		String linha;
		 
		try (BufferedReader br = new BufferedReader(new FileReader(new File(arquivo)))) {
			
			while ((linha = br.readLine()) != null) {
				String[] registro = linha.split(";");
				
				if (Arrays.equals(dados, Arrays.copyOfRange(registro, 0, 2))) {	// CPF e senha
					validado = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return validado;
	}
	
	public static Entidade obterEntidade(String cpf) {
		Entidade entidade = null;
		String linha;
		 
		try (BufferedReader br = new BufferedReader(new FileReader(new File(arquivo)))) {
			
			while ((linha = br.readLine()) != null) {
				String[] registro = linha.split(";");
				
				if (registro[0].equals(cpf)) {
					entidade = Entidade.valueOf(registro[2]);
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return entidade;
	}
}

class Acesso {
	public static Entidade logar(String cpf) {
		return BancoDeDados.obterEntidade(cpf);
	}

	public static boolean autenticar(String cpf, String senha) {
		return BancoDeDados.verificar(new String[] { cpf, senha });
	}
}

abstract class Conta {
	protected String cpf;
	protected double saldo;
	protected int agencia;
	
	public String getCpf() {
		return this.cpf;     
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;	
	}
}

class ContaCorrente extends Conta {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

class ContaPoupanca extends Conta {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

enum Entidade { CLIENTE, GERENTE, DIRETOR, PRESIDENTE } // Atores

class Cliente {
}

class SeguroDeVida {
}

abstract class Funcionario {
    private String cpf;
    private String senha;
	private String cargo;
	
	public String getCpf() {
		return cpf;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}

class Gerente extends Funcionario {

	private int agencia;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}

class Diretor extends Gerente {
}

class Presidente extends Diretor {
}

interface Menu { void exibir(Scanner scn); }

class MenuLogin implements Menu {
	public void exibir(Scanner scn) {
		
		Controle controle = new Controle();
		
		String[] opcoes = {
				"[ 0 ] Sair",
				"[ 1 ] Login",
		};
		
		String resposta;
		
		do {
			for (String opcao : opcoes) System.out.println(opcao);
			
			resposta = scn.nextLine();
			
			switch (resposta) {
				case "0":
					System.out.println("\nPROGRAMA FINALIZADO");
					break;
				case "1":	
					System.out.print("CPF: ");
					String cpf = scn.nextLine();
					
					System.out.print("senha: ");
					String senha = scn.nextLine();
					
					if (Acesso.autenticar(cpf, senha)) {
						controle.redirecionar(Acesso.logar(cpf), scn);
					} else {
						System.out.println("\nDados inválidos! Operação cancelada.\n");
					}
					break;
				default:
					System.out.println("\nOpção indisponível\n");
					break;
			}
		} while (!resposta.equals("0"));
	}
}

class MenuCliente implements Menu {
	
	public void exibir(Scanner scn) {
		System.out.println("\nMenu do cliente\n");
		
		String[] opcoes = {
				"[ 0 ] Sair",
				"[ 1 ] Sacar",
				"[ 2 ] Depositar",
				"[ 3 ] Relatórios/Consultas",
				"[ 4 ] Transferência",
		};
		
		String resposta;
		
		do {
			for (String opcao : opcoes) System.out.println(opcao);
			
			resposta = scn.nextLine();
			
			switch (resposta) {
				case "0": break;
				case "1":	
					System.out.println("\nSACAR\n");
					break;
				case "2":	
					System.out.println("\nDEPOSITAR\n");
					break;
				case "3":	
					System.out.println("\nCONSULTAR\n");
					break;
				case "4":	
					System.out.println("\nTRANSFERIR\n");
					break;
				default:
					System.out.println("\nOpção indisponível\n");
					break;
			}
		} while (!resposta.equals("0"));
	}
}

class MenuGerente implements Menu {
	public void exibir(Scanner scn) {
		System.out.println("\nMenu do gerente\n");
	}
}

class MenuDiretor implements Menu {
	public void exibir(Scanner scn) {
		System.out.println("\nMenu do diretor\n");
	}
}

class MenuPresidente implements Menu {
	public void exibir(Scanner scn) {
		System.out.println("\nMenu do presidente\n");
	}
}

class Controle {
	private Map<Entidade, Menu> menuMap = Map.of(
			Entidade.CLIENTE, new MenuCliente(),
			Entidade.GERENTE, new MenuGerente(),
			Entidade.DIRETOR, new MenuDiretor(),
			Entidade.PRESIDENTE, new MenuPresidente()
	);
	
	public void redirecionar(Entidade opcao, Scanner scn) {
		Menu menu = menuMap.get(opcao);
		menu.exibir(scn);
	}
}

public class Main {
	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {
			new MenuLogin().exibir(scn);
		}
	}
}
