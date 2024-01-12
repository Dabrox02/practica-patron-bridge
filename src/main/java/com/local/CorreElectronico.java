package com.local;

public class CorreElectronico implements PlataformaEnvio {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por correo electronico " + mensaje);
    }

}
