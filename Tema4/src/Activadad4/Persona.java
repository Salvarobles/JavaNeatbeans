/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activadad4;
import java.time.LocalDate;
import tema4_actividades.DNI;
/**
 * 
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author Salvador Robles Gomez

 * @version 02/02/2023/

 * @see <a href = "https://www.boredpanda.es/blog/wp-content/uploads/2022/03/20-6228a4eb3d3ec_1u9oohepwsi81__700-622b145752c46__700.jpg"> Meme gracioso </a>

 */
public class Persona {
    
    //propiedades
    public String nombre;
    public DNI dni;
    public double sueldo;
    public LocalDate fechaNacimiento;
    
    
    //Metodos:
    public Persona(){
    }
    
    public Persona(String n, DNI d, double s, LocalDate fn){

        this.nombre = n;
        this.dni = d;
        this.sueldo = s;
        this.fechaNacimiento = fn;
        
    }
    
    public Persona(String n, int DNInumero, char letraDNI, double s, LocalDate fn){
        DNI dniPersona = new DNI (DNInumero, letraDNI);
        this.nombre = n;
        this.dni = dniPersona;
        this.sueldo = s;
        this.fechaNacimiento = LocalDate.now().minusYears(20);  
    }
    
    public Persona (String n,DNI d ){
        this.nombre = n;
        this.dni = d;
        this.sueldo = 900;
        this.fechaNacimiento = LocalDate.now().minusYears(20);
    }
    
    public Persona (String n,int numero, char letra){
        this.nombre = n;
        this.dni.DNInumero = numero;
        this.dni.DNIletra = letra;
        this.sueldo = 900;
        this.fechaNacimiento = LocalDate.now().minusYears(20);
    }
    
    public void aumentadoSueldo (int porcentaje){
        this.sueldo += (this.sueldo * Math.abs(porcentaje)) / 100;
    }
}
