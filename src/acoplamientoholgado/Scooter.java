/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoplamientoholgado;

public class Scooter implements Vehiculo {
    public String moverVelocidad(){
        return "Scooter moviendose a una velocidad de: ";
    }
    
    @Override
    public void mover(float v){
        System.out.println(moverVelocidad() + v + " m/s");
    }
}
