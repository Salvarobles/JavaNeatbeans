/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Activadad4;
import tema4_actividades.DNI;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Este es el main
 * @version 02/02/2023/
 * @author Salva Robles
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        LocalDate fecha = LocalDate.of(2000,2,2);
        DNI persona = new DNI (77962939, 't');
        DNI persona2 = new DNI ("77962939t");
        
        Persona salva = new Persona("Salva", persona, 20000, fecha);
        System.out.println(salva.dni.DNInumero);
        
        System.out.println("Cual es el dni de pablo??");
        String dnipablo = leer.next();
        
        DNI ComprobarDni = new DNI ("12345678A");
        Persona pablo = new Persona("Pablo", persona2.DNInumero,persona2.DNIletra,900,fecha);
        
        System.out.println("Sueldo" + pablo.nombre + ": " + pablo.sueldo);
        System.out.println("Aumentamos 100%");
        pablo.aumentadoSueldo(20);
        System.out.println("Sueldo" + pablo.nombre + ": " + pablo.sueldo);
    
        
        DNI dni1= new DNI();
        
        if (dni1.comprobarDNI(dnipablo)) {
            System.out.println("Se ha comprobado NIVEL 1 OK" );
      
            if (dni1.comprobarLetra(dnipablo)){ 
            System.out.println("Se ha comprobado NIVEL 2 OK" );
            DNI dnifinal = new DNI(dnipablo);
            Persona persona1 = new Persona("Salvador", dnifinal,900,fecha);
            System.out.println("Se ha inscrito la persona: " + persona1.nombre + " con dni \n" +
                    persona1.dni.DNInumero + persona1.dni.DNIletra);
            } 
        }
        else {
            System.out.println("No ha inscrito a la persona: " );
        }
    }
}
