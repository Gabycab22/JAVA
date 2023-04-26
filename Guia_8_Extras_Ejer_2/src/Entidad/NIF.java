/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author gabri
 */
/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs 
con su correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) 
y la letra (String o char) que le corresponde
*/
public class NIF {
    private long dni;
    private String letra;

    public NIF() {
    }

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
}
