/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author yoven
 */
// Clase Main en otro paquete donde se intenta acceder a los miembros de Vehiculo y Moto.
// Al intentar acceder a los miembros de Vehiculo, generará un error de compilación, 
// ya que el atributo tipo es de acceso default y no es accesible fuera de su paquete.

package prueba;  // Paquete prueba



/*
import vehiculos.Moto;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha");
        moto.mostrarInfo();  // Esto funciona porque Moto tiene acceso a tipo por herencia

        // Al intentar acceder a tipo desde Main, generará un error porque es de acceso default.
        // System.out.println(moto.tipo); // Esto genera un error de compilación.
    }
}

*/