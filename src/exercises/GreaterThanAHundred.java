package exercises;

import javax.swing.*;

// Faça um programa para ler uma variável numérica e imprimi-lá somente se a mesma for maior que 100.
// Caso contrário impimi-lá com o valor zero.

public class GreaterThanAHundred {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if(num > 100) {
            JOptionPane.showMessageDialog(null, num);
        }else {
            JOptionPane.showMessageDialog(null, "0");
        }
    }
}
