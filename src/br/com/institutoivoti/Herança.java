package br.com.institutoivoti;

public class Herança {

public class Funcionario {
	String nome;
	String cpf;
	double salario;
}

public class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionariosGerenciados;
	
	public String getNome() {
    	return this.nome;
    }
}	
}

