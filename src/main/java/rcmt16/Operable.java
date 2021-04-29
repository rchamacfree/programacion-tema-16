/*
Define una interfaz llamada Operable, que sea genérica et tipo ‘T’. Tiene que declarar los 
métodos llamados: suma y resta. Ambos métodos recibirán dos parámetros de tipo genérico ‘T’ y 
devolverán un genérico del mismo tipo.

fecha 29/04/2021
alumno Rafael Chamorro Maceira
 */
package rcmt16;

/**
 * Interfaz Operable de tipo genérico
 * Implementar los metodos suma y resta
 * @author rchamac
 * @since 29/04/2021
 */
public interface Operable <T>{
    T suma(T a, T b);
    T resta (T a, T b);
    
}
