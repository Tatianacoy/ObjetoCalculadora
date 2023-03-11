/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetocalculadora;

import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args){
    //Se crea el objeto que llama la clase
    ObjetoCalculadora calculadora = new ObjetoCalculadora();
    //Se asignan valores a los atributos de la clase
    calculadora.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1")));
    
    calculadora.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2")));
    //Se ejecutan las operaciones
    
    // Suma
    int suma = calculadora.calcularSuma();
    mostrarResultado("Suma", suma);

    // Resta
    int resta = calculadora.calcularResta();
    mostrarResultado("Resta", resta);

    // Multiplicacion
    int multiplicacion = calculadora.calcularMultiplicacion();
    mostrarResultado("Multiplicación", multiplicacion);

    // División
    int division = calculadora.calcularDivision();
    mostrarResultado("División", division);
    }

    public static void mostrarResultado(String operacion, int resultado) {
        JOptionPane.showMessageDialog(null, operacion + ": " + resultado);
    }
}