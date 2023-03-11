/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetocalculadora;

import javax.swing.JOptionPane;

public class ObjetoCalculadora{
    //Se define la clase "Objeto calculadora" con tres variables de instancia
    private int numero1;
    private int numero2;
    //Se define un constructor para la clase "Objeto calculadora" que llama al constructor usando la palabra "super"
    public ObjetoCalculadora() {
        super();
    }
 
    //Se definen los metodos correspondientes
    public int calcularSuma (){
    return numero1 + numero2;
  }
  
    public int calcularResta() {
    return numero1 - numero2;
  }
  
    public int calcularMultiplicacion() {
    return numero1 * numero2;
  }
  
    public int calcularDivision() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            return 0;
        }
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        if (numero1 > 0) {
            this.numero1 = numero1;
        } else {
            JOptionPane.showMessageDialog(null, "El número 1 debe ser mayor que 0");
        }
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        if (numero2 > 0) {
            this.numero2 = numero2;
        } else {
            JOptionPane.showMessageDialog(null, "El número 2 debe ser mayor que 0");
        }
    }
}