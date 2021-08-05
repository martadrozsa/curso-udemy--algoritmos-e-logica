package exercises;

import java.util.Scanner;

// Faça um programa para converter metros para centímetros.
// O porgrama deve receber o tamanho em metros multiplicar o tamanho por 100, depois mostrar o resultado da multiplicação

public class ConvertMetersToCentimeters {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor me metros: ");
        int metros = entrada.nextInt();

        int centimetros = metros * 100;
        System.out.println("O valor em centímetros é: " + centimetros);

        entrada.close();
    }
}
