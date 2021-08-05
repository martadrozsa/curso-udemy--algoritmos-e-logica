package exercises;

import java.util.Scanner;

// Faça um programa que calcule o estoque médio ao receber: quantidade_minima e quantidade_maxima.
// Deve somar a quantidade_minima e a quantidade_maxima e depois dividir o resultado da soma por 2 e mostrar o resultado da divisão.

public class AmountOfStock {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade minima do estoque: ");
        int quantidade_minima = entrada.nextInt();

        System.out.print("Informe a quantidade máxima do estoque: ");
        int quantidade_maxima = entrada.nextInt();

        double estoqueMedio = (quantidade_minima + quantidade_maxima) / 2;

        System.out.println("\nA quantidade de estoque médio é de " + estoqueMedio);

        entrada.close();
    }
}
