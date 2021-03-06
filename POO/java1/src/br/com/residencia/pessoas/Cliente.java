package br.com.residencia.pessoas;

public class Cliente extends Usuario {

	public Cliente() {
		super();
	}

	public Cliente(String tipoUsuario, String nome, String cpf, String senha, Integer agencia, Integer numeroConta) {
		super(tipoUsuario, nome, cpf, senha, agencia, numeroConta);

	}

	@Override
	public String toString() {
		return "Cliente [Nome: " + this.nome + ", tipoUsuario=" + this.tipoUsuario
				+ ", cpf=" + this.cpf + ", senha=" + this.senha + ", agencia=" + this.agencia + ", numeroConta="
				+ this.numeroConta + "]\n";
	}

}
