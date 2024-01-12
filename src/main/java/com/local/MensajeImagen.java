package com.local;

public class MensajeImagen extends Mensaje {

    private String mensaje;

    public MensajeImagen(PlataformaEnvio plataformaEnvio, String mensaje) {
        super(plataformaEnvio);
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto " + mensaje);
        plataformaEnvio.enviarMensaje(mensaje);
    }

}
