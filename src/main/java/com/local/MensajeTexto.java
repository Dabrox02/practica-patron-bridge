package com.local;

public class MensajeTexto extends Mensaje {

    private String mensaje;

    public MensajeTexto(PlataformaEnvio plataformaEnvio, String mensaje) {
        super(plataformaEnvio);
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto " + mensaje);
        plataformaEnvio.enviarMensaje(mensaje);
    }

}
