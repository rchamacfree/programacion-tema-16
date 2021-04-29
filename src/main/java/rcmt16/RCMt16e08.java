/*
Haz un programa que instancie cuadrados de tipo Integer, Long y Double de distintos tamaños 
y muestra el área de todos ellos. 

fecha: 29/04/2021
alumno: Rafael Chamorro Maceiras.
 */
package rcmt16;



public class RCMt16e08 {

    public static void main(String[] args) {
       
        ClaseGenerica <Integer> enteros = new ClaseGenerica<>(4);
        System.out.println("area cuadrado <Integer>:" + enteros.area());
        
              
        ClaseGenerica <Double> dobles = new ClaseGenerica<>(4.0d);
        System.out.println("area cuadrado <Double>:" + enteros.area());
        
        
        ClaseGenerica <Float> floats = new ClaseGenerica<>(4.0f);
        System.out.println("area cuadrado <Float>:" + enteros.area());

        
       
    }
    
}
