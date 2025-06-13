/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_utn;

/**
 *
 * @author Tairshus
 */
public class Subte extends VehiculoTransporte{

    public Subte(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }

    @Override
    public double calcularCostoBase() {
        return 800;
    }
    @Override
    public String toString(){
        return " Vehiculo:Subte  Patente:"+this.patente+"  Capacidad:"+this.capacidad+"  Empresa:"+this.empresa;
    }
}
