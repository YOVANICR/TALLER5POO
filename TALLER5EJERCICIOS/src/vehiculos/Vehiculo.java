/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author yoven
 */
// Clase Vehiculo en el paquete vehiculos
// Esta clase tiene un atributo con acceso de paquete (default), lo que significa que solo puede ser accedido 
// desde otras clases dentro del mismo paquete.



// Clase Vehiculo con un atributo de acceso default
class Vehiculo {
    String tipo;  // Atributo de paquete (default)

    // Constructor
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    // Método para mostrar la información del vehículo
    void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
    }
}

