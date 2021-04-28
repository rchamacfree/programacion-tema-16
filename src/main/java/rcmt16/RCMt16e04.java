/*
 Realizar un programa al que se le introduzca un número entero. Mostrar dicho número en 
su representación hexadecimal. Evitar que se produzca una excepción si el usuario no introduce un 
valor correcto (por ejemplo, si introduce texto o un número con decimales o un número demasiado 
grande).

fecha 26/04/2021
alumno: Rafael Chamorro Maceiras
 */
package rcmt16;

import static java.lang.Long.toHexString;
import java.util.Scanner;


public class RCMt16e04 {

    static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int num = 0;
        boolean salir;
        
      try{
          
        do{  
        salir = true;
        System.out.println("Introduce un número entero:");
        num = Integer.parseInt(teclado.nextLine());
        if (num>Integer.MAX_VALUE || num < Integer.MIN_VALUE)salir = false;
        
        
        
        
        }while(!salir);
      }catch(NumberFormatException ex){System.out.println("Número introducido no cumple las condiciones.");;}
            System.out.println("El valor en Hexadecimal es: "+Integer.toHexString(num));

        
      }
    }    

