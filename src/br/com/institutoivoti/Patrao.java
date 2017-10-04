package br.com.institutoivoti;

public class Patrao extends Funcionario {

	double senha;

	public double Senha(double senhap) {
		return senha = senhap;
	}

	public boolean autentica(double senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Liberado");
			return true;
		} else {
			System.out.println("Acesso Negado");
			return false;
		}
	}
}
