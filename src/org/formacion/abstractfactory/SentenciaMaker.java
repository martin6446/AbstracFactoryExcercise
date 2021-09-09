package org.formacion.abstractfactory;

public class SentenciaMaker {

    public enum Idioma {
        ESP, ENG
    }

    public static SentenciaFactory makeSentencia(Idioma idioma) {
        switch (idioma) {
            case ESP:
                return new SentenciaEspaniolFactory();
            case ENG:
                return new SentenciaInglesFactoy();
            default:
                throw new IllegalArgumentException("no existe tal idioma");
        }
    }
}
