package exercises;

import javax.swing.*;

// Elabore um programa que leio um número e se positivo armazene-o em "a", se negativo, em "b".
// Depois mostre o valor e o resultado

public class StoreNumber {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if(num > 0){
            int a = num;
            JOptionPane.showMessageDialog(null, "O número " + a + " é positivo.");
        }else {
            int b = num;
            JOptionPane.showMessageDialog(null, "O número " + b + " é negativo.");
        }

    }
}
