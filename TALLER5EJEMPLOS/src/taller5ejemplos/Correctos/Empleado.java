/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Este es un ejemplo de una clase llamada "Empleado" con el modificador de acceso default (package-private).
// Los atributos de la clase son accesibles solo desde otras clases que están en el mismo paquete.
// En este caso, he hecho la clase simple, con un constructor y un método para mostrar información.

class Empleado {
    String nombre;  // Atributo de acceso default (package-private)
    double salario; // Atributo de acceso default (package-private)

    // Constructor para inicializar los atributos
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar la informacion del empleado
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }

    // Clase de prueba para crear un objeto Empleado y mostrar su informacion
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 2500.50);
        empleado.mostrarInformacion(); // Muestra la informacion del empleado creado
    }
}

