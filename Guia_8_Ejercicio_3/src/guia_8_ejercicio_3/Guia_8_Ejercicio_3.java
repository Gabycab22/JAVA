/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_ejercicio_3;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author gabri
 */
public class Guia_8_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona [] personas = new Persona[4];
        int [] IMC = new int[4];
        boolean [] mayores = new boolean[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese los datos de la persona numero "+(i+1));
            personas[i] = ps.crearPersona();
            IMC[i] = ps.calcularIMC(personas[i]);
            mayores[i] = ps.esMayorDeEdad(personas[i]);
        }
        
        ps.porcentajeIMC(IMC);
        ps.porcentajeEdad(mayores);
    }
    
}
