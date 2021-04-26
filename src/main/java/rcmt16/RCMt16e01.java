/*
Crea una enumeración pública con el género de las personas (masculino, femenino) en un 
archivo propio. Crea una nueva versión de la clase Persona (Persona_v4) que la incorpore como 
atributo y adapta los métodos necesarios para tratarla (constructor, toString, etc). Haz un programa 
que solicite al usuario por consola los datos de personas y los almacene en un HashSet (Introducirá 
nombre “Z” para indicar que no desea introducir más personas). Finalmente mostrará todos los 
datos almacenados en el conjunto. 

fecha: 26/04/2021
Alumno: Rafael Chamorro Maceiras.
 */
package rcmt16;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author rchamac
 */
public class RCMt16e01 {

    public enum genero {MASCULINO,FEMENINO};
    static HashSet <Persona_v4> listapersonas;
    static Scanner teclado;
    public static void main(String[] args) {
    teclado = new Scanner(System.in);
    listapersonas = new HashSet<>();
    boolean salir = false;
    String nombre, tfno,email,fn,gen;
    genero gn;
    LocalDate fnac;
    
    
    while (!salir){
        System.out.println("nombre (Z = salir) : "); nombre = teclado.nextLine();
        
        if (!nombre.equals("Z")){
            System.out.println("tfno : "); tfno = teclado.nextLine();
            System.out.println("Email : "); email = teclado.nextLine();
            System.out.println("fecha nacimiento (AAAA-MM-DD): "); fn = teclado.nextLine();
            fnac = LocalDate.parse(fn);
            System.out.println("Género: "); gen = teclado.nextLine();
            gn = genero.valueOf(gen);
            listapersonas.add(new Persona_v4(nombre,tfno,email,fnac,gn));
        }else{
            salir = true;
        }
        
    }//fin while
    listapersonas.forEach((x) -> {
        System.out.println(x.toString());
        });
        
    
    
        
        
        
        
        
        
    }//fin main
    
}
