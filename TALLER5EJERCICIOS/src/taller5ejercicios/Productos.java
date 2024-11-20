/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5ejercicios;

/**
 *
 * @author yoven
 */
// Clase Producto en el paquete productos
// Esta clase tiene atributos de acceso default (sin especificar public, private o protected), 
// lo que significa que solo se puede acceder a ellos dentro del mismo paquete.



class Productos {
    String nombre;  // Atributo de paquete (default)
    double precio;  // Atributo de paquete (default)
    int stock;      // Atributo de paquete (default)

    // Constructor con acceso de paquete, solo accesible dentro del mismo paquete
    Productos(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método con acceso de paquete, muestra la información del producto
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }

    // Clase de prueba dentro del mismo paquete
    public static void main(String[] args) {
        Productos producto = new Productos("Camiseta", 15.50, 20);
        producto.mostrarInfo();  // Muestra la información del producto creado
    }
}
