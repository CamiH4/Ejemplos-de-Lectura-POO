/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploslecturapoo;

/**
 *
 * @author USUARIO
 */
// Suma.java
// Programa que recibe dos números y muestra la suma.

// se escribe antes de las clases
import java.util.Scanner; // el programa usa la clase Scanner

public class Suma {
    //el metodo main empieza la ejecucion de la aplicacion en Java
    public static void main(String[]arg)
    {
        //crea un objeto Scanner para obtener la entarda de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int numero1; //primer numero a sumar
        int numero2; //segundo numerp a sumar
        int suma; // suma del numero1 y numero2
        
        System.out.print("Escriba el primer entero: ");//indicador
        numero1 = entrada.nextInt();// lee el primer numero del usuario
        
        System.out.print("Escriba el segundo entero: ");// indicador
        numero2 = entrada.nextInt();// lee el segundo numero del usuario
        
        suma = numero1 + numero2; // suma los numeros, despues almacena el total
        
        System.out.printf("La suma es %d%n", suma);// muestra la suma
    }// fin del metodo main
}// fin de la clase Suma
