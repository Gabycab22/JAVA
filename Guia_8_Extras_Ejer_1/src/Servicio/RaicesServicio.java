/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

*/
public class RaicesServicio {
    Scanner leer = new Scanner(System.in);
    
    public double getDiscriminante(Raices nombre){
        double valor = Math.pow(nombre.getB(), 2)-4*nombre.getA()*nombre.getC();
        return valor;
    }
    
    public boolean tieneRaices(Raices nombre){
        return getDiscriminante(nombre)>=0;
    }
    
    public boolean tieneRaiz(Raices nombre){
        return getDiscriminante(nombre)==0;
    }
    //(-b±√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaices(Raices nombre){
        if (tieneRaices(nombre)){
            double primeraS = (-nombre.getB()+(Math.sqrt(Math.pow(nombre.getB(), 2)-(4*nombre.getA()*nombre.getC()))))/(2*nombre.getA());
            double segundaS = (-nombre.getB()-(Math.sqrt(Math.pow(nombre.getB(), 2)-(4*nombre.getA()*nombre.getC()))))/(2*nombre.getA());
            System.out.println("Primera solucion: "+primeraS);
            System.out.println("Segunda solucion: "+segundaS);
        }
    }
    
    public void obtenerRaiz(Raices nombre){
        if (tieneRaiz(nombre)){
            double solucion = (-nombre.getB()+(Math.sqrt(Math.pow(nombre.getB(), 2)-(4*nombre.getA()*nombre.getC()))))/(2*nombre.getA());
            System.out.println("La solucion es: "+solucion);
        }
    }
    
    public void calcular(Raices nombre){
        if (tieneRaiz(nombre)){
            obtenerRaiz(nombre);
        }else if (tieneRaices(nombre)){
            obtenerRaices(nombre);
        }else{
            System.out.println("No existe solucion en el campo de los reales.");
        }
    }
}
