package exercises;

// Faça um programa que carregue um vetor com 5 números inteiros.
// Mostre o vetor na ordem inversa a que foi digitado

import java.util.Scanner;

public class ReverseOrderVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        sc.close();

    }

}
