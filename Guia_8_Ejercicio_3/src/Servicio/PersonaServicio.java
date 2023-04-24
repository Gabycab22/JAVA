/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de 
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula
es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

*/
public class PersonaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public boolean esMayorDeEdad(Persona nombre){
        return (nombre.getEdad()>=18);
    }
    //nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura
    public Persona crearPersona(){
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        String sexo;
        do{
        System.out.println("Sexo: (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro)");
        sexo = leer.next().toUpperCase();
        }while (!sexo.equals("H")&&!sexo.equals("M")&&!sexo.equals("O"));
        switch (sexo) {
            case "H":
                sexo = "Hombre";
                break;
            case "M":
                sexo = "Mujer";
                break;
            case "O":
                sexo = "Otro";
                break;    
        }
        System.out.println("Peso en kg: ");
        double peso = leer.nextDouble();
        System.out.println("Altura en metros: ");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona nombre){
        int imc = (int) (nombre.getPeso()/(Math.pow(nombre.getAltura(), 2)));
        if (imc<20){
            //System.out.println("Esta por debajo de su peso ideal");
            return -1;
        }else if (imc<=25){
            //System.out.println("Peso ideal");
            return 0;
        }else{
            //System.out.println("Persona con sobrepeso");
            return 1;
        }
    }
    /*para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
*/    
    public void porcentajeIMC(int[] IMC) {
        double bajo = 0;
        double ideal = 0;
        double encima = 0;
        for (int i = 0; i < 4; i++) {
            switch (IMC[i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    encima++;
                    break;
            }
        }
        System.out.println(bajo/4*100+"% peso bajo.");
        System.out.println(ideal/4*100+"% peso ideal.");
        System.out.println(encima/4*100+"% sobrepeso.");
    }
    
    public void porcentajeEdad(boolean[] edades){
        double mayores = 0;
        double menores = 0;
        for (int i = 0; i < 4; i++) {
            if (edades[i]){
                mayores++;
            }else{
                menores++;
            }
        }
        System.out.println("El porcentaje de mayores de edad es del "+mayores/4*100+"% y el porcentaje de menores es de "+menores/4*100+"%");
    }
}
