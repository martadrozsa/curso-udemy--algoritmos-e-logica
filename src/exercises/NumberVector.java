package exercises;

// Faça um programa que carregue um vetor de 5 elementos inteiros e em seguida armazene em vetor apenas os números pares maiores que 0.
// No final, deve mostrar os elementos do vetor na tela.

import java.util.Scanner;

public class NumberVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] evenNumbers = new int[5];

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print("Enter a number: ");
            evenNumbers[i] = sc.nextInt();
        }

        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i] % 2 == 0 && evenNumbers[i] > 0) {
                System.out.printf("%d  ", evenNumbers[i]);
            }
        }

        sc.close();
    }
}
