/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

/**
 *
 * @author CC1
 */
public class equipo {

    private String nombre;
    private String categoria; 

    jugador[] jugador;
    
    public equipo(String nombre, String categoria, jugador[] jugador) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.jugador = jugador;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
     public jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(jugador[] jugador) {
        this.jugador = jugador;
    }
    public void Imprimir(){
        System.out.println(this.nombre);
        System.out.println(this.categoria);
        
        for(int i=0; i< this.jugador.length; i++){
            this.jugador[i].imprimir();
        }
    }
}
