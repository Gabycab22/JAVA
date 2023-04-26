/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_extras_ejer_2;

import Entidad.NIF;
import Servicios.NIFServicio;

/**
 *
 * @author gabri
 */
public class Guia_8_Extras_Ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicio ns = new NIFServicio();
        NIF persona = new NIF(35030582,"");
       
        ns.crearNif(persona);
        ns.mostrar(persona);
    }
    
}
