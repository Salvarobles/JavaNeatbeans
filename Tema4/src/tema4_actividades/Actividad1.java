/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_actividades;
import tema4_actividades.DNI;
import java.util.Scanner;
/**
 * Este es el main
 * @version 02/02/2023/
 * @author Salva Robles
 */
public class Actividad1 {

    /**
     * @param args Este es el main del DNI.
     * Esta es la descripcion
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca su DNI:");
        String dniUsuario = leer.next();
          
          
          
          
          DNI dniFinal = new DNI("12345678A");
          
          dniFinal.comprobarDNI(dniUsuario);
          
          /*if (dniFinal.comprobarDNI(dniUsuario)) {
              //System.out.println("Chachi" );
              if (dniFinal.comprobarLetra(dniUsuario)) {
                  System.out.println("DNI correcto");
                  dniFinal = new DNI(dniUsuario);
                  dniFinal.getDNI();
              }
              
          } else {
              System.out.println("Formato incorrecto DNI");
          }*/
        
       
        /*System.out.println("");
        DNI persona = new DNI(12345678, 'A');
        
        persona.getDNI();*/
    
        
    }
}
