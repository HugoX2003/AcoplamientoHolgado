/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoplamientoholgado;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class AcoplamientoHolgado {


    public static void main(String[] args) {
        Auto au = new Auto();
        Bicicleta bi = new Bicicleta();
        Scooter sc = new Scooter();
        
        Viajero va = new Viajero(au,72);
        Viajero vb = new Viajero(bi,10);
        Viajero vs = new Viajero(sc,5);
        
        //Mostrar vehículos
        va.mostrar(); // Mostrar auto
        vb.mostrar(); // Mostrar bicicleta
        vs.mostrar(); // Mostrar scooter
    }
    
}
