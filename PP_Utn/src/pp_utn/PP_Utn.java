/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_utn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Alan
 */
public class PP_Utn {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<IPasaje> listaViajes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        int aux;
        String pasajero;
        int numVehiculo;
        int numPasaje;
        String patente;
        int capacidad;
        String empresa;
        VehiculoTransporte vehiculo = null;
        IPasaje tipoPasaje = null;
        List<IPasaje> listaAux = new ArrayList<>();
        double totalRecaudado = 0;
        
        do{
            System.out.println("---Menu de viajes---");
            System.out.println("1.Registrar nuevo viaje");
            System.out.println("2.Mostrar todos los viajes");
            System.out.println("3.Mostrar viajes ordenados por costo");
            System.out.println("4.Mostrar viajes ordenado por nombre de pasajero");
            System.out.println("5.Mostrar total recuadado.");
            System.out.println("6.Salir");
            
            opcion = Integer.parseInt(sc.nextLine());
            
            switch(opcion){
                case 1:
                    System.out.println("Seleccione el tipo de vehiculo");
                    System.out.println("1.Colectivo");
                    System.out.println("2.Tren");
                    System.out.println("3.Subte");
                    numVehiculo = Integer.parseInt(sc.nextLine());
                    if(numVehiculo != 1 && numVehiculo != 2 && numVehiculo !=3){
                        System.out.println("Opcion invalida");
                        break;
                    }
                    
                    System.out.println("Ingrese la patente del vehiculo");
                    patente = sc.nextLine();
                    if(patente.isEmpty()){
                        System.out.println("Error, debre ingresar una patente");
                        break;
                    }
                    System.out.println("Ingrese la capacidad del vehiculo");
                    capacidad = Integer.parseInt(sc.nextLine());
                    if(capacidad <= 0){
                        System.out.println("Error, la apacidad debe ser mayor a 0");
                        break;
                    }
                    System.out.println("Ingrese el nombre de la empresa");
                    empresa = sc.nextLine();
                    if(empresa.isEmpty()){
                        System.out.println("Error, debe ingresar el nombre de la empresa");
                        break;
                    }
                    
                    System.out.println("Ingrese el nombre del pasajero");
                    pasajero = sc.nextLine();
                    if(pasajero.isEmpty()){
                        System.out.println("Error, debe ingresar un nombre para el pasajero");
                        break;
                    }
                    
                    System.out.println("Seleccione el tipo de pasaje");
                    System.out.println("1.Pasaje comun");
                    System.out.println("2.Pasaje de estudainte");
                    System.out.println("3.Pasaje de jubilado");
                    numPasaje = Integer.parseInt(sc.nextLine());
                    if(numPasaje != 1 && numPasaje != 2 && numPasaje !=3){
                        System.out.println("Opcion invalida");
                        break;
                    }
                    
                    if(numVehiculo == 1){
                        vehiculo = new Colectivo(patente,capacidad,empresa);
                    }else if(numVehiculo == 2){
                        vehiculo = new Tren(patente,capacidad,empresa);
                    }else{
                        vehiculo = new Subte(patente,capacidad,empresa);
                    }
                    
                    if(numPasaje == 1){
                        tipoPasaje = new PasajeComun(vehiculo,pasajero);
                    }else if(numPasaje == 2){
                        tipoPasaje = new PasajeEstudiante(vehiculo,pasajero);
                    }else if(numPasaje == 3){
                        tipoPasaje = new PasajeJubilado(vehiculo,pasajero);
                    }
                    
                    listaViajes.add(tipoPasaje);      
                    break;
                case 2:
                    for (IPasaje pasaje : listaViajes) {
                        System.out.println(pasaje);
                    }
                    break;
                case 3:
                    listaAux = listaViajes;
                    listaAux.sort(Comparator.comparingDouble(IPasaje::calcularCostoFinal));
                    for (IPasaje iPasaje : listaAux) {
                        System.out.println(iPasaje);
                    }
                    break;
                case 4:
                    listaAux = listaViajes;
                    listaAux.sort(Comparator.comparing(IPasaje::getPasajero));
                    for (IPasaje iPasaje : listaAux) {
                        System.out.println(iPasaje);
                    }
                    break;

                case 5:
                    for (IPasaje pasaje : listaViajes) {
                        totalRecaudado = totalRecaudado + pasaje.calcularCostoFinal();
                    }
                    System.out.println("Total recaudado:"+totalRecaudado);
                    totalRecaudado = 0;
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
            }
            
        }while(opcion != 6);
    }
}