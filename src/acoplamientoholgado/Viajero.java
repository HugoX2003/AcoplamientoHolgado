/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoplamientoholgado;

public class Viajero {
    private float velocidad;
    private Vehiculo vehiculo;
    
    public Viajero(Vehiculo vehiculo, float velocidad){
     this.vehiculo = vehiculo;
     this.velocidad = velocidad;
    }
        public float setVehiculo() {
    return velocidad;
}
        public void mostrar(){
            vehiculo.mover(velocidad);
        }
}
