package figuras;

import java.awt.Color;
    /**
     * La clase Rectangulo hereda de la clase Cuadrado
     * @version Figuras
     * @author Noelia Mancha
     * @since 04/03/2024
     */
    public class Cuadrado extends Rectangulo{
        /**
         * Aquí se crea un contructor para que podamos meter los datos del cuadrado cuando hagamos la llamada a este constructor.
         * 
         * @param x esta variable determina la posición "x" en la que nos encontramos 
         * @param y esta variable determina la posición "y" en la que nos encontramos
         * @param color esta variable es para que podamos introducir un color
         * @param lado esta variable es para que podamos introducir una medida para los lados del cuadrado
         */
    
        public Cuadrado (double x, double y, Color color, double lado){
            super (x, y, color, lado, lado);
        }
    }