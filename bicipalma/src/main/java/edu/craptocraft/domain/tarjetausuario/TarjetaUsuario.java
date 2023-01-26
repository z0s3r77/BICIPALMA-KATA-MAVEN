package edu.craptocraft.domain.tarjetausuario;

public class TarjetaUsuario implements Autenticacion {
    
    private String id;
    private boolean activada;

    public TarjetaUsuario (String id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    @Override
    public boolean isActivada(){
        return this.activada;
    }

    public void setActivada(boolean estado){
        this.activada = estado;
    }

    @Override
    public String toString(){

        StringBuilder tarjeta = new StringBuilder();

        return tarjeta.toString();
    }


}
