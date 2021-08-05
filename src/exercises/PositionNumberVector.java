package exercises;

import java.util.Scanner;

// Faça um programa que carregue um vetor com 5 números inteiros.
// Depois mostre os números superiores a 50 e suas respectivas posições.


public class PositionNumberVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }
        int max = 50;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                System.out.println("Number: " + numbers[i]);
                int indexPosition = i;
                System.out.println("Posição: " + indexPosition);
            }
        }

        sc.close();



        sc.close();

    }
}
