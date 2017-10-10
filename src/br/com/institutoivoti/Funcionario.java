package br.com.institutoivoti;

public class Funcionario extends Pessoa {

	double salario;

	public double GetSalario() {
		return this.salario;
	}

	public double Salario(double Salario) {
		return salario = Salario;
	}
}