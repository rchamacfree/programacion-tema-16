
package rcmt16;

import java.time.LocalDate;
import java.util.Objects;
import rcmt16.RCMt16e01.genero;


public class Persona_v4b implements Comparable{
     
    public String nombre;
    public String tfno;
    public String email;
    public LocalDate fecha_nacimiento;
    //public genero gen;
    
   public Persona_v4b(String n, String t, String e, LocalDate f){
        this.nombre = n;
        this.tfno = t;
        this.email = e;
        this.fecha_nacimiento = f;
        //this.gen = g;
    }

   
   
    @Override
   public int compareTo(Object o){
       Persona_v4b pers = (Persona_v4b) o;
       return this.fecha_nacimiento.compareTo(pers.fecha_nacimiento);
   }
   
   @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre.toUpperCase());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona_v4b other = (Persona_v4b) obj;
        if (!Objects.equals(this.nombre.toUpperCase(), other.nombre.toUpperCase())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", tfno=" + tfno + ", email=" + email + ", fecha_nacimiento=" + fecha_nacimiento +'}';
    }
}
        