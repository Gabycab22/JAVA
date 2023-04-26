/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.NIF;

/**
 *
 * @author gabri
 */
/*
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).

*/
public class NIFServicio {
    String [] verificador = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    public void crearNif(NIF nombre){
        int resto = (int) (nombre.getDni()%23);
        nombre.setLetra(verificador[resto]);
    }
    
    public void mostrar(NIF nombre){
        System.out.println(nombre.getDni()+"-"+nombre.getLetra());
    }
}
