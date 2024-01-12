package com.local;

public class Main {
    public static void main(String[] args) {
        PlataformaEnvio sms = new SMS();
        Mensaje mensajeTexto = new MensajeTexto(sms, "Hola como vamos");
        mensajeTexto.enviar();
    }
}