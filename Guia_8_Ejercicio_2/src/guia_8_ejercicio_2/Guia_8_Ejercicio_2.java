/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_ejercicio_2;

import entidadCafetera.Cafetera;
import entidadCafetera.Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Guia_8_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera nueva = cs.crearCafetera();
        int opcion;
        
       do{
           System.out.println("----  NESPRESSO ----");
           System.out.println("\n1. Llenar Cafetera"
                   + "\n2. Servir Taza"
                   + "\n3. Vaciar Cafetera"
                   + "\n4. Agregar Cafe"
                   + "\n0. SALIR");
           opcion = leer.nextInt();
           switch (opcion) {
               case 1:
                   cs.llenarCafetera(nueva);
                   break;
               case 2:
                   cs.servirTaza(nueva);
                   break;
               case 3:
                   cs.vaciarCafetera(nueva);
                   break;
               case 4:
                   cs.agregarCafe(nueva);
                   break;
               case 0:
                   System.out.println("HASTA LUEGO");
                   break;

               default:
                   System.out.println("OPCION INCORRECTA");
                   break;
           }
 
       }while (opcion!=0);
        
    }
    
}
