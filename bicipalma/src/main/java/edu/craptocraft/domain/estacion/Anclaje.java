package edu.craptocraft.domain.estacion;

import edu.craptocraft.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado;
    private Movil bici;

    public Anclaje(){

    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public Movil getBici(){
        return this.bici;
    }

    public void anclarBici(Movil bici){
        this.bici = bici;
        this.ocupado = true;
    }

    public void liberarBici(){
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        StringBuilder anclaje = new StringBuilder();
        anclaje.append("Estado del anclaje: " + this.ocupado);
        return anclaje.toString();
    }


}
