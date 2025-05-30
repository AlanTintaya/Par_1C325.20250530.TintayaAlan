/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialutn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tairshus
 */
public class ParcialUTN {

    /**
     * @param args the command line arguments
     */
    //static List<Biblioteca> biblioteca = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        int aux;
        
        do{
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
            System.out.println("10.");
            
            opcion = Integer.parseInt(sc.nextLine());
            
            switch(opcion){
                case 1:
                
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
            }
            
        }while(opcion != 0);
    }
    /*
    public static void agregar(clase n){
        boolean existe = false;
        if(!clase.isEmpty()){
            for (int i = 0; i < clase.size(); i++) {
                clase bl = clase.get(i);
                if(n.titulo == bl.titulo && n.anio == bl.anio){
                    existe = true;
                    break;
                }
            }
            if(existe){
               existe = false; 
            }else{
                clase.add(n);
            }
        }else{
            clase.add(n);
        }
    }
    
    public static void eliminar(clase n){
        if(!clase.isEmpty()){
            for(int i = 0; i < clase.size(); i++){
                clase nClase = clase.get(i);
            }
        }
    }
    */
}
