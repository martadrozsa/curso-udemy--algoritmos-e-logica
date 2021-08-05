package exercises;

import java.util.Scanner;

// Construa um programa que leia 10 valores inteiros positivos e:
// a) encontre o maior valor
// b) encontre o menor valor
// c) calcule a média dos valores lidos


public class HighestValueLowestValueAndAverage {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maior = 0;
        int menor = 999;
        int soma = 0;
        float media = 0;

        for(int i = 0; i < 10; i++) {
            System.out.print("Informe um número: ");
            int n = entrada.nextInt();

            if(n > 0) {
                if(n > maior) {
                    maior = n;
                }
                if(n < menor) {
                    menor = n;
                }
                soma = soma + n;
            }else {
                i--;
            }
        }

        media = soma / 10;

        System.out.println("\nO maior valor é : " + maior);
        System.out.println("\nO menor valor é : " + menor);
        System.out.println("\nO valor da média é: " + media);
        entrada.close();
    }
}
