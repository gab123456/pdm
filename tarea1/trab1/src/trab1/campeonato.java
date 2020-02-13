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
public class campeonato {

   
    private String nombre; 
    equipo[] equipo;
    
    public campeonato(String nombre, equipo[] equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public equipo[] getEquipo() {
        return equipo;
    }

    public void setEquipo(equipo[] equipo) {
        this.equipo = equipo;
    }
    public void Imprimir(){
        System.out.println(this.nombre);
        
        for(int i=0; i< this.equipo.length; i++){
            this.equipo[i].Imprimir();
        }
    }

}