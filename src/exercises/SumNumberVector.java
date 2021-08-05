package exercises;

import java.util.Scanner;

// Faça um programa que leia dois vetores de 10 posições e faça a soma dos elementos de mesmo índice, colocando o resultado em um terceiro vetor.
// Mostre o vetor resultante

public class SumNumberVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] sum = new int[5];

        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Enter a number for the first vector: ");
            vector1[i] = sc.nextInt();
            System.out.print("Enter a number for the second vector: ");
            vector2[i] = sc.nextInt();
            sum[i] = vector1[i] + vector2[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d  ", sum[i]);
        }
        sc.close();
    }
}
