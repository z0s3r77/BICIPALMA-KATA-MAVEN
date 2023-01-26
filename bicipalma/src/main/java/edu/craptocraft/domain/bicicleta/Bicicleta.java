package edu.craptocraft.domain.bicicleta;

public class Bicicleta implements Movil{
     
    private int id;

    public Bicicleta(int id){
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder bici = new StringBuilder();
        bici.append(getId());
        return bici.toString();
    }

}
