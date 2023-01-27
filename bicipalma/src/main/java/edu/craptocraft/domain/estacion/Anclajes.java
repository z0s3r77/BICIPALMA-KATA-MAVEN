package edu.craptocraft.domain.estacion;

import java.util.concurrent.ThreadLocalRandom;

import edu.craptocraft.domain.bicicleta.Movil;

public class Anclajes {
    

    private Anclaje[] anclajes;


    public Anclajes(int numAnclajes){

        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }


    public void crearAnclajes(){
        
        for (int i = 0; i < anclajes.length; i++) {
            this.anclajes[i] = new Anclaje();
        }

    }

    Anclaje[] anclajes(){
        return this.anclajes;
        
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    @Override
    public String toString() {
        return "Numero de anclajes: " + Integer.toString(numAnclajes());
    }

    void ocuparAnclaje(int posicion, Movil bici) {
        this.anclajes[posicion].anclarBici(bici);
}

boolean isAnclajeOcupado(int posicion) {
        return this.anclajes[posicion].isOcupado();
  }

void liberarAnclaje(int posicion) {
        this.anclajes[posicion].liberarBici();
}

Movil getBiciAt(int posicion) {
    return this.anclajes[posicion].getBici();
}

/**
 * Substituido por Arrays.stream().findAny()
 */
int seleccionarAnclaje() {
    Integer idAnclaje = ThreadLocalRandom.current().nextInt(0, numAnclajes());
    return idAnclaje;
}

}
