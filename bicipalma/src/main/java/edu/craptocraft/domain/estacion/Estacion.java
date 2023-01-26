package edu.craptocraft.domain.estacion;

public class Estacion {
    
    private int id;
    private String direccion;
    private int NumAnclajes;
    private int[] anclajes;
    

    public Estacion(int id, String direccion,  int NumAnclajes) {
        this.direccion = direccion;
        this.id = id;
        this.NumAnclajes = NumAnclajes;
        setAclajes(NumAnclajes);
    }

    //GETTERS && SETTERS

    private int getId() {
        return this.id;
    }



    private String getDireccion() {
        return this.direccion;
    }


    public int getNumAnclajes() {
        return this.NumAnclajes;
    }



    public void setAclajes(int anclajes){
        this.anclajes = new int[anclajes];
    }



    public void consultarEstacion(){
        System.out.println(this.toString());
    }


    public int anclajesLibres(){
        int anclajesLibres = 0;
        for (int i = 0; i < anclajes.length; i++) {
            if (anclajes[i] == 0) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }




    @Override
    public String toString(){

        StringBuilder estacion = new StringBuilder();
        estacion.append("id: "+getId()+" \ndireccion: "+getDireccion()+" \nanclajes: "+getNumAnclajes());
        return estacion.toString();
    
    }

}
