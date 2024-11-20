/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5ejercicios;

/**
 *
 * @author yoven
 */


// Clase Persona
// Esta clase tiene dos atributos: nombre (private) y edad (default).
// Los métodos get y set se usan para acceder y modificar el atributo privado nombre.
// El atributo edad tiene acceso default, por lo que se puede acceder directamente desde el mismo paquete.

public class Persona {
    private String nombre;  // Atributo privado (solo accesible dentro de la clase)
    String edad;           // Atributo de paquete (default) (accesible dentro del mismo paquete)

    // Constructor para inicializar los atributos
    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter para el atributo privado nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar la información de la persona
    void mostrarInfo() {
        System.out.println("Nombre: " + getNombre() + ", Edad: " + edad);
    }
}
