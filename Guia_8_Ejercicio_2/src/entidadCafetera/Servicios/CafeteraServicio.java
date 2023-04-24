/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadCafetera.Servicios;

import entidadCafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” 
para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, 
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

*/
public class CafeteraServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){
        System.out.println("Ingrese capacidad de cafetera");
        int capacidad = leer.nextInt();
        
        return new Cafetera(capacidad,0);
    }
    
    public void llenarCafetera(Cafetera nombre){
        nombre.setCantidadActual(nombre.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera nombre){
        System.out.println("Cual es el tamaño de la taza? ");
        int taza = leer.nextInt();
        if (nombre.getCantidadActual()>taza){
            nombre.setCantidadActual(nombre.getCantidadActual()-taza);
            System.out.println("Se lleno la taza");
        }else{
            System.out.println("La cantidad de cafe no alcanza para llenar la taza. Se va a servir "+nombre.getCantidadActual());
            nombre.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera nombre){
        nombre.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera nombre){
        System.out.println("Que cantidad de cafe desea agregar?");
        int cantidad = leer.nextInt();
        if (cantidad<=nombre.getCapacidadMaxima()){
            nombre.setCantidadActual(nombre.getCantidadActual()+cantidad);
            System.out.println("Se agrego "+cantidad+". El cantidad actual es de "+nombre.getCantidadActual());
        }else{
            System.out.println("La cantidad que desea ingresar es mayor a la capacidad maxima");
        }
    }
    
   
}
