package exercises;

import javax.swing.*;

// João comprou um computador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de SP (50 quilos), deve pagar uma multa de R$ 4,00 por quilo excedente.
// Faça um programa que leia a variável "p" (peso dos peixes) e verefique se há excesso.
// Se houver, gravar na variável "e" (excesso) e na variável "m" o valor da multa que deverá ser paga, caso contrário, mostrar tais variáveis com o conteúdo "zero"

public class CalculateWeight {
    public static void main(String[] args) {

        double pesoPeixe = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do peixe :"));

        final double limite = 50;
        double multa = 0;
        double excesso = 0;

        if(pesoPeixe > limite) {
            excesso = pesoPeixe - limite;
            multa = excesso * 4;
        }

        JOptionPane.showMessageDialog(null, "O peso do peixe é " + pesoPeixe + " quilos."
                + "\n O valor da multa é de R$" + multa + "."
                + " Com excesso de " + excesso + " quilos");
    }

}
