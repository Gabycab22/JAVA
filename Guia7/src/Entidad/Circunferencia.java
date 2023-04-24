/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    
    //atributo
    private double radio;
    
    //constructor

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Cual es el radio de la circunferencia: ");
        radio = leer.nextDouble();
    }
    
    public double area(){
        double area = Math.PI*Math.pow(radio, 2);
        
        return area;
    }
    
    public double perimetro(){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }
}
