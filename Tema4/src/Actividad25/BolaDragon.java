/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad25;

/**
 * 
 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author Salvador Robles Gomez

 * @version 02/02/2023/

 * @see <a href = "https://www.boredpanda.es/blog/wp-content/uploads/2022/03/20-6228a4eb3d3ec_1u9oohepwsi81__700-622b145752c46__700.jpg"> Meme gracioso </a>

 */
public class BolaDragon {
    //propiedades
    private static int MAXIMO_BOLAS;
    private static int siguienteBola;
    private int numero;
        static {
            MAXIMO_BOLAS = 7;
            siguienteBola = 1;
        }
    //Metodos
        private BolaDragon(int numero){
            this.numero = numero;
            siguienteBola = numero;
        }
        
        public int getNumero (){
            return this.numero;
        }
        
        public static BolaDragon crearBolaDragon() throws Exception {
            BolaDragon Bolacreada;
            if (siguienteBola > MAXIMO_BOLAS) {
                throw new Exception("Limite de bolas alcanzado");
            } else {
                Bolacreada = new BolaDragon(siguienteBola);
                siguienteBola++;
            }
            return Bolacreada;
        }
}
