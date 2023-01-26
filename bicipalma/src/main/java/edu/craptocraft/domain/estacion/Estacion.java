package edu.craptocraft.domain.estacion;

public class Estacion {
    
    private int id;
    private String direccion;
    // private Anclajes anclajes;
    

    public Estacion(int id, String direccion,  int NumAnclajes) {
        this.direccion = direccion;
        this.id = id;
        // this.anclajes = new Anclajes(NumAnclajes);
    }

    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }




    public void consultarEstacion(){
        System.out.println(this.toString());
    }



    @Override
    public String toString(){

        StringBuilder estacion = new StringBuilder();
        estacion.append("\n id: "+ getId());
        estacion.append("\n direccion: "+ getDireccion());
        return estacion.toString();
    
    }

}
