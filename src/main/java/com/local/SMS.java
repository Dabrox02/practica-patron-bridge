package com.local;

public class SMS implements PlataformaEnvio {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por SMS " + mensaje);
    }

}
