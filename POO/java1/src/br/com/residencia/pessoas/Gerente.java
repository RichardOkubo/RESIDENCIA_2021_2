package br.com.residencia.pessoas;

public class Gerente extends Funcionario {

	private Integer numeroAgencia;

	public Gerente() {
		super();
	}

	public Gerente(String tipoUsuario, String nome, String cpf, String senha, Integer agencia, Integer numeroConta,
			Double salario, Integer numeroAgencia) {
		super(tipoUsuario, nome, cpf, senha, agencia, numeroConta, salario);

		this.numeroAgencia = numeroAgencia;
	}

	public Integer getNumeroAgencia() {
		return this.numeroAgencia;
	}

	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	@Override
	public String toString() {
		return "Gerente [numeroAgencia=" + this.numeroAgencia + ", salario=" + this.salario + ", nome=" + this.nome
				+ ", tipoUsuario=" + this.tipoUsuario + ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia="
				+ this.agencia + ", numeroConta=" + this.numeroConta + "]\n";
	}

}
