/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Libro {
    //Scaner para leer 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //atributos
    private int ISBN;
    private String titulo;
    private String autor;
    private int paginas;
    
    // constructor con todos los atributos 
    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    // constructor vacio
    public Libro() {
    }
    
    public void cargarLibro(){
        System.out.println("Ingrese ISBN: ");
        ISBN = leer.nextInt();
        System.out.println("Ingrese Título: ");
        titulo = leer.next();
        System.out.println("Ingrese Autor: ");
        autor = leer.next();
        System.out.println("Ingrese numero de paginas: ");
        paginas = leer.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Numero de paginas: "+paginas);
    }
    
    
}
