/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploslecturapoo;

/**
 *
 * @author USUARIO
 */
import javax.swing.JOptionPane;

public class DialogoNombre {
    public static void main(String[]args)
    {
        String nombre = JOptionPane.showInputDialog("Cual es su nombre? ");
        
        String mensaje = String.format("Bienvenido, %s, a la programacion en Java!", nombre);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
