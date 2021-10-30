package br.com.residencia.pessoas;

public class Diretor extends Funcionario {

	public Diretor() {
		super();
	}

	public Diretor(String tipoUsuario, String nome, String cpf, String senha, Integer agencia,
			Integer numeroConta, Double salario) {
		super(tipoUsuario, nome, cpf, senha, agencia, numeroConta, salario);
	}

	@Override
	public String toString() {
		return "Diretor [salario=" + this.salario + ", nome=" + this.nome
				+ ", tipoUsuario=" + this.tipoUsuario + ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia="
				+ this.agencia + ", numeroConta=" + this.numeroConta + "]\n";
	}

}
