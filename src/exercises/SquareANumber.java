package exercises;

import java.util.Scanner;

// Desenvolva um programa que: leia 4 números e calcule o quadrado de cada um.
// Se o valor resultante do quadrado do terceiro for >= 100, imprima-o e finalize.
// Caso contrário, imprima os valores lidos e seus respectivos quadrados

public class SquareANumber {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = entrada.nextInt();

        System.out.print("Digite o quarto número: ");
        int num4 = entrada.nextInt();

        int quadrado1 = (num1 * num1);
        int quadrado2 = (num2 * num2);
        int quadrado3 = (num3 * num3);
        int quadrado4 = (num4 * num4);

        if(quadrado3 >= 100) {
            System.out.println("Quadrado do terceiro número " + quadrado3);
        }else {
            System.out.println("1° número: " + num1 + ". Quadrado do 1° número: " + quadrado1);
            System.out.println("2° número: " + num2 + ". Quadrado do 2° número: " + quadrado2);
            System.out.println("3° número: " + num3 + ". Quadrado do 3° número: " + quadrado3);
            System.out.println("4° número: " + num4 + ". Quadrado do 4° número: " + quadrado4);
        }
        entrada.close();
    }
}
