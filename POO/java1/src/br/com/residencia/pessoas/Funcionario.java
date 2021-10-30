package br.com.residencia.pessoas;

public abstract class Funcionario extends Usuario {

	protected Double salario;

	public Funcionario() {
		super();
	}

	public Funcionario(String tipoUsuario, String nome, String cpf, String senha, Integer agencia, Integer numeroConta,
			Double salario) {
		super(tipoUsuario, nome, cpf, senha, agencia, numeroConta);

		this.salario = salario;
	}

	public Double getSalario() {
		return this.salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + this.salario + ", nome=" + this.nome + ", tipoUsuario=" + this.tipoUsuario
				+ ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia=" + this.agencia + ", numeroConta="
				+ this.numeroConta + "]\n";
	}

}
