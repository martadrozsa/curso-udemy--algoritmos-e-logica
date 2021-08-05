package exercises;

import java.util.Scanner;

// A secretaria do Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente.
// O ínidce de poluição aceitável varia de 0,05 até 0,25.
// Se o índice sobre para 0,3 as industrias do 1° grupo são intimadas a suspenderem suas atividades.
// Se o índice crescer para 0,4 as industrias do 1° e 2° grupo são intimadas a suspenderem suas atividades.
// Se o indice atingir 0,5 todos os grupos devem ser notificados a paralisar suas atividades.
// Faça um programa que leia o índice de poluição medido e emita a motificação adequada aos diferentes grupos de empresas.

public class PollutionIndex {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o índice de poluição: ");
        float indicePoluicao = entrada.nextFloat();

        if(indicePoluicao >= 0.3 && indicePoluicao < 0.4) {
            System.out.println("Grupo 1 deve suspender as atividade");
        }else if(indicePoluicao >= 0.4 && indicePoluicao < 0.5) {
            System.out.println("Grupo 1 e grupo 2 devem suspender as atividade");
        }else if(indicePoluicao >= 0.5) {
            System.out.println("Todos os grupos devem suspender as atividade");
        }else {
            System.out.println("Níveis aceitáveis");
        }
        entrada.close();

    }
}
