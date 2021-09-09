package org.formacion.abstractfactory;

public class SentenciaInglesFactoy implements SentenciaFactory{

    @Override
    public Preguntas preguntar() {
        return new PreguntasEn();
    }

    @Override
    public Saludos saludar() {
        return new SaludosEn();
    }
}
