/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosCuentaBancaria;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class ServiciosCuentaBancaria {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
    
    public CuentaBancaria crearCuentaBancaria(){
        System.out.println("Ingrese Numero de cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI Cliente:");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese Saldo:");
        double saldoActual = leer.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    public void ingresar(double ingreso, CuentaBancaria nombre){
        double nuevoSaldo = nombre.getSaldoActual() + ingreso;
        nombre.setSaldoActual(nuevoSaldo);
    }
    
    public void consultarDatos(CuentaBancaria nombre){
        System.out.println(nombre.getNumeroCuenta());
        System.out.println(nombre.getDniCliente());
        System.out.println(nombre.getSaldoActual());
    }

    public void  retirar(double retiro, CuentaBancaria nombre){
        if (retiro<= nombre.getSaldoActual()){
            double nuevoSaldo = nombre.getSaldoActual() - retiro;
            nombre.setSaldoActual(nuevoSaldo);
        }else{
            System.out.println("El saldo que desea retirar es superior al disponible");
            System.out.println("Se retira el monto de $"+nombre.getSaldoActual());
            nombre.setSaldoActual(0);
        }
    }
    
    public void extraccionRapida(double retiro, CuentaBancaria nombre){
        if( retiro<= nombre.getSaldoActual()*0.2){
            double nuevoSaldo = nombre.getSaldoActual() - retiro;
            nombre.setSaldoActual(nuevoSaldo);
        }
    }
    
    public void consultarSaldo(CuentaBancaria nombre){
        System.out.println("Su saldo es de $"+nombre.getSaldoActual());
    }
    
}


/*Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.*/
