/*
Escribe un programa que solicite al usuario que introduzca una cadena y verifique, mediante 
expresiones regulares, si la cadena se corresponde con: 
a) Una matrícula de coche (4 dígitos y 3 letras mayúsculas). 
b) Un número binario de una o más posiciones. 
c) Un número hexadecimal de entre 5 y 8 posiciones. 
d) Una fecha en formato YYYY-MM-DD (solo formato, no valida días del mes). 
e) Como el anterior, pero admite también que el día o el mes esté en un solo dígito. 
f) Un nombre de usuario en twitter, empieza por @ y puede contener letras mayúsculas 
y minúsculas, números, guiones y guiones bajos (entre 2 y 15 caracteres) 

fecha: 28/04/2021
Alumno: Rafael Chamorro Maceiras

 */
package rcmt16;

import java.util.Scanner;




public class RCMt16e05 {

   
    public static void main(String[] args) {
        System.out.println("Introduce una cadena:");
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
       
        //Declaración de expresiones regulares//
        String regmatricula = "^\\d{4}-[A-Z]{3}$";//el ^indica comienzon $ indica final de cadena
        String regbinario = "^[0,1]+$";
        String reghex = "^[0-9a-fA-F]{5,8}$";
        String regfecha = "^\\d{4}-[0-9][0-2]-[0-3][0-9]$";
        String regfecha2 = "^\\d{4}-[0-9][0-2]?-[0-3]?[0-9]$";
        String reguserTwitter = "^@[A-Za-z0-9]{2,15}$"; 
        
        if (cadena.matches(regmatricula))System.out.println("Es una matricula");
        if (cadena.matches(regbinario))  System.out.println("Es un número binario");
        if (cadena.matches(reghex))      System.out.println("Hexadecimal entre 5 y 8 posiciones");
        if (cadena.matches(regfecha))    System.out.println("Es una fecha.");
        if (cadena.matches(regfecha2))    System.out.println("Es una fecha.");
        if (cadena.matches(reguserTwitter)) System.out.println("Usuario de twitter");

    }
    
}
