/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5ejemplos.EjemplosIncorrectos;

/**
 *
 * @author yoven
 */
// Este ejercicio está diseñado para probar qué pasa cuando tratamos de acceder a una clase con modificador default
// desde otro paquete. La clase Vehiculo tiene un atributo con acceso default, y Moto es una subclase de Vehiculo.

package vehiculos;  // Paquete vehiculos

class Vehiculo {
    String tipo;  // Atributo de paquete (default)

    // Constructor
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }
}

package motos;  // Paquete motos

// Clase Moto que hereda de Vehiculo
public class Moto extends Vehiculo {
    String modelo;

    // Constructor
    public Moto(String tipo, String modelo) {
        super(tipo);  // Llama al constructor de la clase Vehiculo
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", Modelo: " + modelo);
    }

    // Clase de prueba para intentar acceder a los miembros de Vehiculo desde otro paquete
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha");
        moto.mostrarInfo();  // Esto funciona porque Moto tiene acceso a tipo por herencia
    }
}


