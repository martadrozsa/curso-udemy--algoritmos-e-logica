package exercises;

import javax.swing.*;

// Faça um programa para ler um numero e verificar se ele é par ou ímpar.
// Quando for par armazenar esse valor em "p" e quando for ímpar armazená-lo em "i".
// Depois exibir "p" e "i" no final do processamento.

public class EvenOrOdd {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if(num % 2 == 0) {
            int p = num;
            JOptionPane.showMessageDialog(null, "O número " + p + " é par");
        }else {
            int i = num;
            JOptionPane.showMessageDialog(null, "O número "  + i + " é ímpar");
        }
    }
}
