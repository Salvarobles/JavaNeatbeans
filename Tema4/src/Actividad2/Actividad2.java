/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividad2;

import java.util.Scanner;

/**
 * Este es el main
 * @version 02/02/2023/
 * @author Salva Robles
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in); 
        
        
        System.out.println("Escribe el contenido de la caja:");
        String contenido = leer.nextLine();
        
        System.out.println("Quieres que se muestre el contenido? True or False");
        boolean afirmacion = leer.nextBoolean();
        
        
        Caja Caja = new Caja (afirmacion,contenido);        
    }
}
