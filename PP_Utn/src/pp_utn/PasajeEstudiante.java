/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_utn;

/**
 *
 * @author Tairshus
 */
public class PasajeEstudiante implements IPasaje{

    VehiculoTransporte vehiculo;
    String pasajero;

    public PasajeEstudiante(VehiculoTransporte vehiculo, String pasajero) {
        this.vehiculo = vehiculo;
        this.pasajero = pasajero;
    }
    
    @Override
    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase() * 0.5;
    }
    @Override
    public String toString(){
        return "Pasajero: "+this.pasajero+this.vehiculo+" con un costo de:"+this.calcularCostoFinal();
    }

    @Override
    public String getPasajero() {
        return this.pasajero.toLowerCase();
    }
}
