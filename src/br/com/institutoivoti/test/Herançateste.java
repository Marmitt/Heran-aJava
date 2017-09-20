package br.com.institutoivoti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.institutoivoti.Herança.Gerente;

public class Herançateste {

	@Test
	public void testaNome() {
		Gerente gerente = new Gerente();
		gerente.Nome("Mateus");
		assertEquals(gerente.getNome(), "Mateus");
	  }
	}
