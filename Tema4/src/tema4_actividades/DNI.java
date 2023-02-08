/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_actividades;

/**
 * 
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author Salvador Robles Gomez

 * @version 02/02/2023/

 * @see <a href = "https://www.boredpanda.es/blog/wp-content/uploads/2022/03/20-6228a4eb3d3ec_1u9oohepwsi81__700-622b145752c46__700.jpg"> Meme gracioso </a>

 */
public class DNI {
    //Propiedades
    public int DNInumero;
    public char DNIletra;
    /**
     * Constructor vacio para definirlo mas adelante.
     */
    
    //Metodos:
    public DNI(){  
    }
    
    /**
     * Constructor para definir el NIF y letra.
     * @param n introducir NIF.
     * @param l introducir Letra.
     */
    public DNI (int n, char l){
        DNInumero = n;
        DNIletra = l;

    }
    /**
     * Constructor para definir el DNI entero.
     * @param dni introducir DNI entero.
     */
    public DNI (String dni){
        this.DNIletra = dni.charAt(8);
        this.DNInumero = Integer.parseInt(dni.substring(0, 7));  
    }
    
    /**
     * Devuelve el Dni, NIF y letra separados.
     */
    public void getDNI (){
        System.out.println("El NIF es : " + this.DNInumero);
        System.out.println("La letra es: " + this.DNIletra);
    }

    /**
     * Comprobacion del NIF, si no se supera de numeros sera "Formato correcto" si no lo contrario sera "Formato incorrecto".  
     * @param dni introducir el DNI.
     * @return 
     */
    public boolean comprobarDNI (String dni){
        boolean esLetra = false;
        boolean esNumero = false;
        
        if (dni.length() == 9) {            
            try {
                Integer.parseInt(dni.substring(0,7));
                esNumero = true;
                
            } catch (NumberFormatException excepcion) {
                esNumero = false;
                esLetra = false;
                System.out.println("Formato incorrecto en la parte de los numeros");    
            }
            
            char caracter = Character.toUpperCase(dni.charAt(8));
            int caracterNumero = (int) caracter;
            
            if(esNumero == true && caracterNumero >= 65 && caracterNumero <= 90) {
               System.out.println("Formato Correcto");
               
               esLetra = true;
            }
        } else {
            esLetra = false;
            esNumero = false;
        }   
        return esLetra;
    }
    
    /**
     * Comprobacion de letra si es correcto con el NIF.
     * @param dni introducir el DNI.
     * @return 
     */
    public boolean comprobarLetra (String dni){
        boolean valido = false;
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'};
        int numero = Integer.parseInt(dni.substring(0,8));
        if (Character.toUpperCase(dni.charAt(8)) == letra[numero%23]) valido = true;
        else System.out.println("Letra incorrecta");
        return valido;
    }

}
