/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_utn;

/**
 *
 * @author Tairshus
 */
public class Colectivo extends VehiculoTransporte{

    public Colectivo(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }

    @Override
    public double calcularCostoBase() {
        return 270;
    }
    
    @Override
    public String toString(){
        return " Vehiculo:Colectivo  Patente:"+this.patente+"  Capacidad:"+this.capacidad+"  Empresa:"+this.empresa;
    }
}
