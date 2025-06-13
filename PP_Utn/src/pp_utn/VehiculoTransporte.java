/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_utn;

/**
 *
 * @author Tairshus
 */
public abstract class VehiculoTransporte {
    
    protected String patente;
    protected int capacidad;
    protected String empresa;

    public VehiculoTransporte(String patente, int capacidad, String empresa) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.empresa = empresa;
    }
    
    public abstract double calcularCostoBase();
}
