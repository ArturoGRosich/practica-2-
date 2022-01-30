    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import Persona.Persona;

/**
 *
 * @author JoanLlompartSocias y Arturo Garrido Rosich
 */

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Arturo Garrido");
        persona.setEdad(19);
        persona.setDNI("42326690F");
        int edad = 21;
        String nombre = "Joan Llompart";

        if (persona.getEdad() > edad) {
            System.out.println(persona.getNombre() + " es mayor que " + nombre);
        } else if (persona.getEdad() == edad) {
            System.out.println(persona.getNombre() + " y " + nombre + " tienen la misma edad");
        } else {
            System.out.println(persona.getNombre() + " es menor que " + nombre);
        }

    }

}
