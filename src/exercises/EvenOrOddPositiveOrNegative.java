package exercises;

import javax.swing.*;

// Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo

public class EvenOrOddPositiveOrNegative {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if(num % 2 == 0 && num > 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é par e positivo.");
        }else if(num % 2 == 0 && num < 0){
            JOptionPane.showMessageDialog(null, "O número " + num + " é par e negativo.");
        }else if(num > 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar e positivo.");
        }else {
            JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar e negativo.");
        }
    }
}
