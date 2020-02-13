/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;
import trab1.jugador;
import trab1.equipo;
import trab1.campeonato;

/**
 *
 * @author CC1
 */
public class Trab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jugador jugador1 = new jugador("Pepito1","Huiy Ter1","4555455 cbba", 20);
        jugador jugador2 = new jugador("Pepito2","Huiy Ter2","4555455 cbba", 22);
        jugador jugador3 = new jugador("Pepito3","Huiy Ter3","4555455 cbba", 25);
     
        
        jugador[] jugadores = new jugador[2];
        jugadores[0] = jugador1;
        jugadores[1] = jugador2;
        
        equipo equipo1 = new equipo("Equipo1","varones",jugadores);
        
        equipo[] equipos = new equipo[1];
        equipos[0] = equipo1;
        
        campeonato campeonato = new campeonato("Campeonato UNI", equipos);
        campeonato.Imprimir();
    
    }
    
}
