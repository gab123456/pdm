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
public class jugador {
   
   private String nombre; 
    private String apellidos;
    private String ci;
    private int edad;
    
    public jugador( String nombre, String apellidos, String ci, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ci = ci;
        this.edad = edad; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimir(){
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(ci);
        System.out.println(edad);
    }
   }
