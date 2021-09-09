package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {



		Preguntas preguntas = SentenciaMaker.makeSentencia(SentenciaMaker.Idioma.ESP).preguntar();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		
		Saludos saludos = SentenciaMaker.makeSentencia(SentenciaMaker.Idioma.ESP).saludar();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		Preguntas preguntas = SentenciaMaker.makeSentencia(SentenciaMaker.Idioma.ENG).preguntar();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		Saludos saludos = SentenciaMaker.makeSentencia(SentenciaMaker.Idioma.ENG).saludar();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}
