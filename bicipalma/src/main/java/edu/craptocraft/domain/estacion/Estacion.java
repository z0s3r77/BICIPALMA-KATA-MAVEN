package edu.craptocraft.domain.estacion;

import edu.craptocraft.domain.bicicleta.Movil;
import edu.craptocraft.domain.tarjetausuario.Autenticacion;

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




    // METODOS 
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

    public void anclarBicicleta(Movil id){

        for (int i = 0; i < getNumAnclajes(); i++) {
            if(this.anclajes[i] == 0){
                this.anclajes[i] = id.getId();
                break;
            }
        }

    }


    public boolean leerTarjetaUsuario(Autenticacion tarjeta){
        return tarjeta.isActivada();
    }


    public void retirarBicicleta(Autenticacion tarjeta){
        for (int i = 0; i < getNumAnclajes(); i++) {
            if (this.anclajes[i]!=0) {
                this.anclajes[i] = 0;
            }
        }
    }

    @Override
    public String toString(){

        StringBuilder estacion = new StringBuilder();
        estacion.append("id: "+getId()+" \ndireccion: "+getDireccion()+" \nanclajes: "+getNumAnclajes());
        return estacion.toString();
    
    }

}
