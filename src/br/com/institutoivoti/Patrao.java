package br.com.institutoivoti;

public class Patrao extends Funcionario {

	String nome;
	int senha;
	int numeroFuncionariosGere;

	public String Getnome(String nomep) {
		return nome = nomep;
	}

	public int Senha(int senhap) {
		return senha = senhap;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Liberado");
			return true;
		} else {
			System.out.println("Acesso Negado");
			return false;
		}
	}
}
