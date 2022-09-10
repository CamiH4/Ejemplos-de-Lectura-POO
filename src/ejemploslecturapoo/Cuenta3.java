/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploslecturapoo;

/**
 *
 * @author USUARIO
 */
public class Cuenta3 {

    private String nombre; // variable de instancia
    private double saldo; // variable de instancia

    // Constructor de Cuenta3 que recibe dos parametros
    public Cuenta3(String nombre, double cuenta)
    {
        this.nombre = nombre;
        
        if (saldo > 0.0)
            this.saldo = saldo;
    }
    
    public void depositar(double montoDeposito)
    {
        if (montoDeposito > 0.0)
            saldo = saldo + montoDeposito;
    }
    
    public double obtenerSaldo()
    {
        return saldo;
    }
    
    // método para establecer el nombre en el objeto
    public void establecerNombre(String nombre) {
        this.nombre = nombre; // almacenar el nombre
    }
    
    public String obtenerNombre() {
        return nombre; // devuelve el valor de nombre a quien lo invoco
    }
    
    }
