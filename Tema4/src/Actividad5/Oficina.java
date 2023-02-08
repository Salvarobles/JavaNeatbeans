/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;
import Activadad4.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
import tema4_actividades.DNI;
/**
 * 
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author Salvador Robles Gomez

 * @version 02/02/2023/

 * @see <a href = "https://www.boredpanda.es/blog/wp-content/uploads/2022/03/20-6228a4eb3d3ec_1u9oohepwsi81__700-622b145752c46__700.jpg"> Meme gracioso </a>

 */
public class Oficina {
    //propiedades
    public String nombre;
    public ArrayList<Persona> trabajadores;
    
    //Metodos:
    
    public Oficina(String nombre){
        this.nombre = nombre;
        this.trabajadores = null;
    }
    
    public Oficina(String nombre, int tipo){
        
        this.nombre = nombre;
        this.trabajadores = new ArrayList<Persona>();
        
        if (tipo == 0 || tipo > 3) {
            System.out.println("La lista de trabajadores estará vacia");
            this.trabajadores = null;
        } else {
            switch (tipo){
                case 1: 
                    System.out.println("caso 1");
                    DNI dni = new DNI ("11111111H");
                    LocalDate fecha1 = LocalDate.of(2000,2,28);
                    Persona Antonio = new Persona("Antonio",dni,900,fecha1);
                    this.trabajadores.add(Antonio);
                    
                case 2:
                    System.out.println("caso 2");
                    DNI dni2 = new DNI ("22222222J");
                    LocalDate fecha2 = LocalDate.of(1995,9,10);
                    Persona Luis = new Persona("Luis",dni2,1000,fecha2);
                    this.trabajadores.add(Luis);
                    
                case 3: 
                    System.out.println("caso 3");
                    DNI dni3 = new DNI ("33333333P");
                    LocalDate fecha3 = LocalDate.of(1985,5,21);
                    Persona Ana = new Persona("Ana",dni3,1200,fecha3);
                    this.trabajadores.add(Ana);
                    
            }
           /* System.out.println("");
            this.trabajadores = new ArrayList<Persona>();
            LocalDate fecha = LocalDate.of(2000,2,2);
            Persona antonio = new Persona ("Antonio",11111111,'H',900,fecha );
            this.trabajadores.add(antonio) = "Antonio Perez Perez";*/
        }
    }
    
}
