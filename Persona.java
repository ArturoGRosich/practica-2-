package Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JoanLlompartsocias y ArturoGarridoRosich
 */

public class Persona {
    
    private String nombre;
    private int edad;
    protected String DNI ;
    public Persona(){
    }

    /*
    *Los setters rediben un imput y establecen el valor que indica su nombre para que sea igual al imput
    */
   public void setNombre(String newnombre) {
       this.nombre = newnombre;
   }
   public void setEdad(int newedad) {
       this.edad = newedad;
   }
   public void setDNI(String newDNI) {
       this.DNI = newDNI;
   }
   
    /*
    *Los getters devuelven el valor de la variable indicada en su nombre
    */
   public int getEdad() {
       return edad;
   }
   public String getDNI() {
       return DNI;
   }
   public String getNombre() {
   return nombre;
    }
   }

