package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {

		SentenciaFactory sentenciaFactory = SentenciaMaker.makeSentencia(SentenciaMaker.Idioma.ESP);
		
		assertEquals("¿qué hora es?", sentenciaFactory.preguntar().preguntaHora() );
		assertEquals("¿qué tiempo hace?", sentenciaFactory.preguntar().preguntaTiempo() );

		
		assertEquals("buenos días", sentenciaFactory.saludar().buenosDias());
		assertEquals("buenas tardes",sentenciaFactory.saludar().buenasTardes());
	}
	
	@Test
	public void test_en() {
		SentenciaFactory sentenciaFactory = SentenciaMaker.makeSentencia(SentenciaMaker.Idioma.ENG);
		
		assertEquals("what time is it?", sentenciaFactory.preguntar().preguntaHora() );
		assertEquals("how is the weather?", sentenciaFactory.preguntar().preguntaTiempo() );

		assertEquals("good morning", sentenciaFactory.saludar().buenosDias());
		assertEquals("good afternoon", sentenciaFactory.saludar().buenasTardes());
	}

}
