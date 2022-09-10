/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploslecturapoo;

/**
 *
 * @author USUARIO
 */
// Comparacion.java
// Compara enteros utilizando instrucciones if, operadores relacionales
// y de igualdad.
import java.util.Scanner; // el programa utiliza la clase Scanner

public class Comparacion {

    // el método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; // primer número a comparar
        int numero2; // segundo número a comparar

        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer número del usuario

        System.out.print("Escriba el segundo entero: "); // indicador
        numero2 = entrada.nextInt(); // lee el segundo número del usuario

        if (numero1 == numero2) {
            System.out.printf("%d ==  % d%n", numero1, numero2);
        }

        if (numero1 != numero2) {
            System.out.printf("%d != %d %n", numero1, numero2);
        }

        if (numero1 < numero2) 
            System.out.printf("%d < %d %n", numero1, numero2);
        
        if (numero1 > numero2)
            System.out.printf("%d > %d %n", numero1,numero2);
        
        if (numero1 <= numero2)
            System.out.printf("%d <= %d %n", numero1, numero2);
        
        if (numero1 >= numero2)
            System.out.printf("%d >= %d %n", numero1, numero2);
    }// fin del metodo main
}// fin de la clase Comparacion
