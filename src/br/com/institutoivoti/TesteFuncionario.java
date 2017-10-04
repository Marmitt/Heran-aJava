package br.com.institutoivoti;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteFuncionario {

	@Test
	public void testaSenha() {
		Patrao patrao = new Patrao();
		patrao.Senha(9865);
		assertEquals(patrao.autentica(9865), true);
	}

	@Test
	public void testaCpf() {
		Pessoa pessoa = new Pessoa();
		pessoa.Cpf("56822346694");
		assertEquals(pessoa.GetCpf(), "56822346694");
	}

	@Test
	public void testaNome() {
		Pessoa pessoa = new Pessoa();
		pessoa.Nome("Flex");
		assertEquals(pessoa.GetNome(), "Flex");
	}

	@Test
	public void testaSalario() {
		Funcionario funcionario = new Funcionario();
		funcionario.Salario(1500);
		assertEquals(funcionario.GetSalario(), 1500, 0);
	}
}