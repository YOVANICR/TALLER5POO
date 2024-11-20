/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author yoven
 */


// Clase Moto que hereda de Vehiculo
class Moto extends Vehiculo {
    String modelo;

    // Constructor
    public Moto(String tipo, String modelo) {
        super(tipo);  // Llama al constructor de la clase Vehiculo
        this.modelo = modelo;
    }

    // Método para mostrar la información de la moto
    void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", Modelo: " + modelo);
    }

    // Método main para probar las clases
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha");
        moto.mostrarInfo();  // Muestra la información de la moto
    }
}
