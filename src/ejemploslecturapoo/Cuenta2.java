/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploslecturapoo;

/**
 *
 * @author USUARIO
 */
public class Cuenta2 {

    private String nombre; // variable de instancia

    // el constructor inicializa nombre con el parámetro nombre
    public Cuenta2(String nombre)// el nombre del constructor es el nombre de la clase
    {
        this.nombre = nombre;
    }

    // método para establecer el nombre en el objeto
    public void establecerNombre(String nombre) {
        this.nombre = nombre; // almacenar el nombre
    }

    // método para obtener el nombre del objeto
    public String obtenerNombre() {
        return nombre; // devuelve el valor de nombre a quien lo invoco
    }
}
