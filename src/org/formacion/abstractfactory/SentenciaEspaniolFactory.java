package org.formacion.abstractfactory;

public class SentenciaEspaniolFactory implements SentenciaFactory{
    @Override
    public Preguntas preguntar() {
        return new PreguntasEs();
    }

    @Override
    public Saludos saludar() {
        return new SaludosEs();
    }
}
