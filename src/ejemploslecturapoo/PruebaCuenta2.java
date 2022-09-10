/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploslecturapoo;

/**
 *
 * @author USUARIO
 */
// PruebaCuenta.java
// Uso del constructor de Cuenta para inicializar la variable de instancia
// nombre al momento de crear el objeto Cuenta.
public class PruebaCuenta2 {

    public static void main(String[] args)
    {
     // crear dos objetos Cuenta
     Cuenta2 cuenta1 = new Cuenta2("Juana Green");
     Cuenta2 cuenta2 = new Cuenta2("John Blue");

      // muestra el valor inicial de nombre para cada Cuenta
     System.out.printf("El nombre de cuenta1 es: %s %n", cuenta1.obtenerNombre());
     System.out.printf("El nombre de cuenta2 es: %s %n", cuenta2.obtenerNombre());
 }
}// fin de la clase cuenta
