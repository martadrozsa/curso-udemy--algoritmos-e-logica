package exercises;

// Faça um programa que leia e mostre um vetor de 10 elementos inteiros, em seguida, mostre a soma de todos os elementos

import java.util.Scanner;

public class SumNumbersVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }
        System.out.print("A soma do vetor é: " + sum);
        sc.close();

    }
}
