package exercises;

import java.util.Scanner;

// Faça um programa que recebe o primeiro número e o segundo número.
// Depois deve somar os dois números e mostrar o resultado

public class SumNumbers {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma dos dois números é " + soma);

        entrada.close();

    }
}
