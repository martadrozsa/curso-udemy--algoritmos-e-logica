package exercises;

import java.util.Scanner;

// Faça um programa que: dada a idade de um nadador classifique-o em uma das sequintes categorias:
/*  infantil-a = 5 a 7 anos
    infantil-b = 8 a 11 anos
    juvenil-a = 12 a 13 anos
    juvenil-b = 14 a 17 anos
    adultos = maiores de 18 anos
*/

public class AgeCategory {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = entrada.nextInt();

        if(idade >= 5 && idade <=7) {
            System.out.println("Pertence ao grupo Infantil A");
        }else if(idade >= 8 && idade <= 11) {
            System.out.println("Pertence ao grupo Infantil B");
        }else if(idade >= 12 && idade <= 13) {
            System.out.println("Pertence ao grupo Juvenil A");
        }else if(idade >= 14 && idade <= 17) {
            System.out.println("Pertence ao grupo Juvenil B");
        }else if (idade >= 18){
            System.out.println("Pertence ao grupo Adulto ");
        }
        entrada.close();
    }
}
