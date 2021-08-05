package exercises;

import java.util.Scanner;

// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
// O uusário deve informar de qual número ele deseja ver a tabuada.
// A saída deve ser conforme o exemplo abaixo:
// Tabuada de 5:
// 5 x 1 = 5
// 5 x 2 = 10
// ...

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe qual tabuada você deseja: ");

        int n = entrada.nextInt();

        for(int i = 1; i <= 10; i ++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        entrada.close();
    }
}
