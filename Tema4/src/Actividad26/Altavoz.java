/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad26;

/**
 * 
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author Salvador Robles Gomez

 * @version 02/02/2023/

 * @see <a href = "https://www.boredpanda.es/blog/wp-content/uploads/2022/03/20-6228a4eb3d3ec_1u9oohepwsi81__700-622b145752c46__700.jpg"> Meme gracioso </a>

 */
public class Altavoz {
    
    //Propiedades
    
        public static final int VOL_MAX;
        public static final int VOL_MIN;
        private int volumen;
            static {
            VOL_MIN = 0;
            VOL_MAX = 255;
            }
        
    //Metodos
            
        /**
         * El constructor crea un altavoz apagado. 
         */
        public Altavoz (){
            volumen = 0;
        }
        
        /**
         * Pone el altavoz al maximo de su volumen
         */
        public void ponerVolumenMaximo(){
            volumen = VOL_MAX;
        }
        
        /**
         * Pone el altavoz al nivel pasado como parametro.
         * @param v es el parametro.
         */
        public void setVolumen(int v){
            volumen =v;
        }
        
        /**
         * Devuelve el volumen del altavoz. 
         * @return devuelve el valor volumen.
         */
        public int getVolumen(){
            return this.volumen;
        }
        
        /**
         * 
         * @return 
         */
        public String toString1(){
            
            String corchetes = "[" + volumen + "]";
            
            int numero = (int) Math.round((float)volumen * 10.0 / VOL_MAX);
            
            if (numero == 0) {
                System.out.println(corchetes + "__________");
            }else if (numero == 1){
                System.out.println(corchetes + "*_________");
            }else if (numero == 2){
                System.out.println(corchetes + "**________");
            }else if (numero == 3){
                System.out.println(corchetes + "***_______");
            }else if (numero == 4){
                System.out.println(corchetes + "****______");
            }else if (numero == 5){
                System.out.println(corchetes + "*****_____");
            }else if (numero == 6){
                System.out.println(corchetes + "******____");
            }else if (numero == 7){
                System.out.println(corchetes + "*******___");
            }else if (numero == 8){
                System.out.println(corchetes + "********__");
            }else if (numero == 9){
                System.out.println(corchetes + "*********_");
            }else if (numero == 10){
                System.out.println(corchetes + "**********");
            }
        return corchetes;
        }

        public String toString2(){
        String asteriscos = "";
        String guiones = "";
        //Es una regla de 3 en la que a representa el porcentaje de volumen que estamos usando
        int a = Math.round((float)(this.volumen * 10.0 / VOL_MAX));
        for (int i = 0; i < a; i++) {
            asteriscos += "*";
        }
        for (int i = a; i < 10; i++) {
            guiones += "-";
        }
        return "[" + this.volumen + "] " + asteriscos + guiones;  
 
        }
        
        public String toString3() {
        String v = "[" + this.volumen + "]";
        int asteriscos = Math.round((float) (this.volumen * 10.0) / VOL_MAX);
        return new StringBuilder(v).append("**********", 0, asteriscos).append("----------", 0, (10-asteriscos)).toString();
    }
}
