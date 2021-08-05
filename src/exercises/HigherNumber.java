package exercises;

import java.util.Scanner;

// Faça um programa que determine o maior número entre N números.
// A condição de parada é a entrada de um valor 0, ou seja,o programa deve ficar calculando o maior até que a entrada seja igual a 0

public class HigherNumber {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();

        int maior = 0;
        while(n != 0) {
            if(n > maior) {
                maior = n;
            }
            System.out.print("Digite um número: ");
            n = entrada.nextInt();
        }

        System.out.println("O maior número é " + maior);
        entrada.close();
    }
}
