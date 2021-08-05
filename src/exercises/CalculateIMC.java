package exercises;

import javax.swing.*;
import java.text.DecimalFormat;

// Faça um programa que recebe como dados de entrada a altura e o peso.
// Construa um algoritmo que calcule seu peso ideal utilizando a seguinte fórmula:
// peso / (altura * altura)

public class CalculateIMC {
    public static void main(String[] args) {


        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));

        double imc = peso / Math.pow(altura, 2);

        String classificacaoIMC = "";
        if(imc > 17 && imc < 18.4) {
            classificacaoIMC = "abaixo do peso";
        }else if(imc > 18.5 && imc < 24.9) {
            classificacaoIMC = "peso normal";
        }else if(imc > 25.0 && imc < 29.9) {
            classificacaoIMC = "acima do peso";
        }else if(imc > 30.0 && imc < 34.9) {
            classificacaoIMC = "obesidade grau 1";
        }else if(imc > 35.0 && imc < 39.9) {
            classificacaoIMC = "obesidade grau 2";
        }else if(imc > 40) {
            classificacaoIMC = "obesidade grau 3";
        }
        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, "O valor do seu IMC é " + df.format(imc) + ""
                + "\n Sua classificação é " + classificacaoIMC);
    }
}
