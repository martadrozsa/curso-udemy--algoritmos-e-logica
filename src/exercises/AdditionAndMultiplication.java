package exercises;

import java.util.Scanner;

// Soma e multiplicação. Programa recebe dois números, soma o primeiro com o segundo.
// Depois multiplicar a soma dos dois números pelo primeiro número e mostrar o resultado.

public class AdditionAndMultiplication {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        int multiplicacao = soma * num1;

        System.out.println("\nA soma é " + soma);
        System.out.println("\nO resultado da multiplicação é " + multiplicacao);


        entrada.close();
    }
}
