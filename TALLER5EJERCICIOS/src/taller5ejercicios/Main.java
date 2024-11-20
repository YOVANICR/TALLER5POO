/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5ejercicios;

/**
 *
 * @author yoven
 */
// Aquí creamos una clase de prueba que está en el mismo paquete para verificar los accesos a los atributos
// de la clase Persona. Como el atributo "nombre" es privado, solo podemos acceder a él mediante los métodos 
// getter y setter, mientras que "edad" puede ser accesado directamente, ya que tiene acceso default.

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona
        Persona persona = new Persona("Juan", "25");

        // Acceso al atributo "edad" directamente, ya que es de acceso default dentro del mismo paquete
        System.out.println("Edad: " + persona.edad);

        // Acceso al atributo "nombre" a través del método getter, porque es privado
        System.out.println("Nombre: " + persona.getNombre());

        // Modificando el nombre usando el setter, porque "nombre" es privado
        persona.setNombre("Carlos");
        System.out.println("Nuevo nombre: " + persona.getNombre());
    }
}