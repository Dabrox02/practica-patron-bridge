package com.local;

public abstract class Mensaje {
    
    protected PlataformaEnvio plataformaEnvio;


    public Mensaje(PlataformaEnvio plataformaEnvio) {
        this.plataformaEnvio = plataformaEnvio;
    }

    public abstract void enviar();

}
