/*
Realizar un programa que muestre el valor máximo y mínimo de los Integer y los Long y 
también cuantos bytes ocupa en memoria uno y otro.

fecha: 26/04/2021
Alumno: Rafael Chamorro Maceiras
 */
package rcmt16;


public class RCMt16e03 {


    public static void main(String[] args) {
        System.out.println("tamaño de un integer en bits: "+Integer.SIZE);
        System.out.println("valor máxmino de un Integer: "+Integer.MAX_VALUE);
        System.out.println("valor mínimo de un Integer: "+Integer.MIN_VALUE);
        System.out.println("tamaño de un Long en bits:"+Long.SIZE);
        System.out.println("Valor máximo de un Long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un Long: "+ Long.MIN_VALUE);
    }
    
}
