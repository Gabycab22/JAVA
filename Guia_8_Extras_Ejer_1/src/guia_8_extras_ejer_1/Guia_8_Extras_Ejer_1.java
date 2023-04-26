/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_extras_ejer_1;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author gabri
 */
public class Guia_8_Extras_Ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();
        Raices nuevo = new Raices(1, 3, -4);
        
        System.out.println(rs.getDiscriminante(nuevo));
        rs.calcular(nuevo);
    }
    
}
