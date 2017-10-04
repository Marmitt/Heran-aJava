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
	public void testaCpf() {
		Pessoa pessoa = new Pessoa();
		pessoa.Cpf("56822346694");
		assertEquals(pessoa.GetCpf(), "56822346694");
	}

	@Test
	public void testanome() {
		Pessoa pessoa = new Pessoa();
		pessoa.Nome("Flex");
		assertEquals(pessoa.GetNome(), "Flex");
	}

	@Test
	public void testasenha() {
		Patrao patrao = new Patrao();
		patrao.Senha(785645);
		assertEquals(patrao.autentica(), true);
		
	}
}