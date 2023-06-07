package test;

import clase5.*;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
//        String nombre = JOptionPane.showInputDialog(null, "Ingrese la edad de su mascota", "Entrada", JOptionPane.QUESTION_MESSAGE);
//        EdadPerro millasPrueba = new EdadPerro(Integer.parseInt(nombre));
//        JOptionPane.showMessageDialog(null,"Edad en años perros tiene " + millasPrueba.getEdadEnperro(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//        
        
//        String nombre = JOptionPane.showInputDialog(null, "Ingrese la distancia en millas", "Entrada", JOptionPane.QUESTION_MESSAGE);
//        ConversorMillasKilometros millasPrueba = new ConversorMillasKilometros(Integer.parseInt(nombre));
//        JOptionPane.showMessageDialog(null,millasPrueBa.getDistaciaMillas() + " Millas es " + millasPrueba.getDistanciaKilometros() +" Km", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        String precioOriginal = JOptionPane.showInputDialog(null, "Ingrese el precio original", "Entrada", JOptionPane.QUESTION_MESSAGE);
        String porcentajeDesc = JOptionPane.showInputDialog(null, "Ingrese el descuento en porcentaje(sin el signo %)", "Entrada", JOptionPane.QUESTION_MESSAGE);

        CalculadoraDescuento calculoTest = new CalculadoraDescuento(Integer.parseInt(precioOriginal), Integer.parseInt(porcentajeDesc));
        JOptionPane.showMessageDialog(null,"el precio final  es de " + calculoTest.getPrecioFinal() + " Bs.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
}
