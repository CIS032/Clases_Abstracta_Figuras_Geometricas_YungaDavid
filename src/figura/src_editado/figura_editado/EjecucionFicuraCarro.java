/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EjecucionFicuraCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(13, 6.5);
        Rectangulo r2 = new Rectangulo(5.5, 3.7);
        Circulo c = new Circulo(2.9);
        double rect = r1.area() + r2.area();
        double circ = 2 * (c.area());
        double resultado = rect + circ;
        JOptionPane.showMessageDialog(null, "El area de la figura es: " + resultado
                + "\n\narea primer rectangulo: " + r1.area()
                + "\n\tarea segundo rectangulo:" + r2.area()
                + "\n\t\tarea de las dos ruedas: " + circ);
    }

}
