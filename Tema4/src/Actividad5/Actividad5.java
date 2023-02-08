/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividad5;

import Activadad4.Persona;
import java.util.ArrayList;

/**
 * Este es el main
 * @version 02/02/2023/
 * @author Salva Robles
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ArrayList<Persona> listatrabajadores_tipo1 = new ArrayList(1);
        ArrayList<Persona> listatrabajadores_tipo2 = new ArrayList(2);
        ArrayList<Persona> listatrabajadores_tipo3 = new ArrayList(3);
        Oficina Oficina1 = new Oficina("OFICINA",1);
        listatrabajadores_tipo2 = new Oficina("Oficina 2",2).trabajadores;
        Oficina1.trabajadores.get(0).aumentadoSueldo(89);
        //System.out.println(Oficina1.trabajadores.get(0).fechaNacimiento);
        
        /*for (Persona i: Oficina1.trabajadores ) {
            System.out.println(i.nombre);
        }*/
        Oficina1.trabajadores.forEach((persona)->{
        System.out.println(persona.sueldo);});
    }
}
