package br.com.institutoivoti;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteFuncionario {

	@Test
	public void test() {
		Patrao patrao = new Patrao();
		patrao.Senha(9865);
		assertEquals(patrao.autentica(9865), true);

	}

	@Test
	public void testafuncionario() {
		Funcionario funcionario = new Funcionario();
		funcionario.Cpf("56822346694");
		assertEquals(funcionario.GetCpf(), "56822346694");
	}
}
