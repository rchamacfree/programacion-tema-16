/*
Una empresa de colocación de suelos de tarima flotante necesita un programa en el que se 
introduzca el ancho y largo de una habitación y el tipo de madera y calcule la cantidad de cajas de 
tarima necesarias y el importe a pagar. Cada caja contiene tiene 2,5 metros cuadrados de tarima y 
las cajas se venden enteras, es decir, si al hacer los cálculos hacen falta 7,1 cajas habrá que comprar 
8. El precio de cada caja depende del tipo de madera, a saber: ROBLE 40€, SAPELLY 50 €, NOGAL 60 
€, CEREZO 70 € y BAMBÚ 100 €.
fecha: 28/04/2021
alumno: Rafael Chamorro Maceiras    

*/
package rcmt16;

import java.util.Scanner;


public class RCMt16e02consola {
static Scanner teclado;
static public final float CAJA = 2.5f;
static public enum madera {
            ROBLE (40),
            SAPELLY (50),
            NOGAL (60),
            CEREZO (70),
            BAMBU (100);
            
            public float precio;
            
            madera(float s){  //constructor  accedemos madera m = m.ROBLE.precio -----> 40
                precio = s;
            }
            
            public int cajasNecesarias(float metros2){
                int resultado = (int)Math.ceil(metros2/CAJA);
                return resultado;
            }
        }   



public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("largo:");
        float largo = Float.parseFloat(teclado.nextLine());
        System.out.println("ancho:");
        float ancho = Float.parseFloat(teclado.nextLine());
        
        float metros2 = largo*ancho;
        System.out.println("M2="+metros2);
        
       
        System.out.println("Seleccione madera:");
        String material = teclado.nextLine().toUpperCase();
        
        madera m = madera.valueOf(material);
        int necesito = madera.valueOf(material).cajasNecesarias(metros2);
        System.out.println("necesito "+necesito+" cajas de "+m);
        System.out.println("precio total = " + necesito * madera.valueOf(material).precio );
    }
    
}
