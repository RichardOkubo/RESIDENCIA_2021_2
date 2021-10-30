package br.com.residencia.pessoas;

public class Presidente extends Funcionario {

	public Presidente() {
		super();
	}

	public Presidente(String tipoUsuario, String nome, String cpf, String senha, Integer agencia, Integer numeroConta,
			Double salario) {
		super(tipoUsuario, nome, cpf, senha, agencia, numeroConta, salario);
	}

	@Override
	public String toString() {
		return "Presidente [salario=" + this.salario + ", nome=" + this.nome + ", tipoUsuario=" + this.tipoUsuario
				+ ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia=" + this.agencia + ", numeroConta="
				+ this.numeroConta + "]\n";
	}

}
