/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actividad25;

/**
 * Este es el main
 * @version 02/02/2023/
 * @author Salva Robles
 */
public class Actividad25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
        // TODO code application logic here
        BolaDragon Bola1, Bola2, Bola3, Bola4, Bola5, Bola6, Bola7, Bola8;
        
        Bola1 = BolaDragon.crearBolaDragon();
        Bola2 = BolaDragon.crearBolaDragon();
        Bola3 = BolaDragon.crearBolaDragon();
        Bola4 = BolaDragon.crearBolaDragon();
        Bola5 = BolaDragon.crearBolaDragon();
        Bola6 = BolaDragon.crearBolaDragon();
        Bola7 = BolaDragon.crearBolaDragon();
        
        System.out.println("Se ha creado la bola: " + Bola1.getNumero());
        System.out.println("Se ha creado la bola: " + Bola2.getNumero());
        System.out.println("Se ha creado la bola: " + Bola3.getNumero());
        System.out.println("Se ha creado la bola: " + Bola4.getNumero());
        System.out.println("Se ha creado la bola: " + Bola5.getNumero());
        System.out.println("Se ha creado la bola: " + Bola6.getNumero());
        System.out.println("Se ha creado la bola: " + Bola7.getNumero());
        
        try {
            Bola8 = BolaDragon.crearBolaDragon();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
