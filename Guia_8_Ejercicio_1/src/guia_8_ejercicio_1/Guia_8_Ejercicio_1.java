/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_ejercicio_1;

import ServiciosCuentaBancaria.ServiciosCuentaBancaria;
import entidad.CuentaBancaria;

/**
 *
 * @author gabri
 */
public class Guia_8_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCuentaBancaria scb = new ServiciosCuentaBancaria();
        
        CuentaBancaria primera = scb.crearCuentaBancaria();
        
        scb.consultarDatos(primera);
        
        scb.ingresar(1000, primera);
        
        scb.consultarDatos(primera);
        
        scb.consultarSaldo(primera);
        scb.retirar(500, primera);
        scb.consultarSaldo(primera);
        scb.extraccionRapida(50, primera);
        scb.consultarDatos(primera);
    }
    
}
