package edu.craptocraft.domain.bicicleta;

public class Bicicleta implements Movil {
    
    private final int id;

    public Bicicleta(int id){
        this.id = id;
    }

    
    @Override
    public int getId() {
        return id;
    }


    @Override
    public String toString() {

        StringBuilder bicicleta = new StringBuilder();
        bicicleta.append("id bicicleta: " + getId());
        return bicicleta.toString();
    }

}
