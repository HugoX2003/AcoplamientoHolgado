/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoplamientoholgado;

public class Bicicleta implements Vehiculo{
    public String moverVelocidad(){
        return "Bicicleta moviendose a una velocidad de: ";
    }
    
    @Override
    public void mover(float v){
        System.out.println(moverVelocidad() + v + " m/s");
    }
}
