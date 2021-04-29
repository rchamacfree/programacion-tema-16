/*
Haz un programa que instancie las clases OperadorEntero y OperadorString y opera con ellas

fecha: 29/04/2021
alumno: Rafael Chamorro Maceiras
 */
package rcmt16;

/**
 *
 * @author rchamac
 */
public class RCMt16e09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperadorEntero oe = new OperadorEntero();
        System.out.println("Metodos de la clase OperadorEntero.");
        System.out.println("-----------------------------------");
        System.out.println("suma: "+ oe.suma(5,6)); 
        System.out.println("resta: "+ oe.resta(9,5));
        
        OperadorString os = new OperadorString();
        System.out.println("Metodos de la clase OperadorString.");
        System.out.println("-----------------------------------");
        System.out.println("suma: " + os.suma("hola ","mundo!"));
        System.out.println("resta: " + os.resta("ABCDDxxDD","DD"));

    }
    
}
