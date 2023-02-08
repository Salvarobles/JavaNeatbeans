/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 * 
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author Salvador Robles Gomez

 * @version 02/02/2023/

 * @see <a href = "https://www.boredpanda.es/blog/wp-content/uploads/2022/03/20-6228a4eb3d3ec_1u9oohepwsi81__700-622b145752c46__700.jpg"> Meme gracioso </a>

 */
public class Caja {
    //propiedades
    public boolean abierto;
    public String mensaje;
    
    //Metodo constructor
    public Caja (String m){
        this.mensaje = m;
        this.abierto = false;
        
        if (abierto) {
            System.out.println(m);
        } else {
            System.out.println("La caja esta cerrada :(");
        }
    }
    
    public Caja (boolean a, String m){
    this.mensaje = m;
    this.abierto = a;

        if (abierto) {
        System.out.println(m.toUpperCase());
        } else {
        System.out.println("La caja esta cerrada :(");
        }
    }
    
    public Caja (){
    this.mensaje = mensaje;
    }
}