package exercises;

import java.util.Scanner;

// Elabore um algoritmo que leia as variáveis "c" e "n", respectivamente código e número de horas trabalhadas de um operário.
// Calcule o salário, sabendo-se que ele ganha R$ 10,00 por hora.
// Quando o número de horas exceder a 50, calcule o excesso de pagamento e armazene na variável "e".
// Caso contrário, zerar tal variável.
// A hora excedente de traballho vale R$ 20,00
// Imprimir o salário total e o salário excedente

public class SurplusSalary {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();

        final double valorHora = 10.00;
        final double limiteHora = 50;
        double salario = valorHora * limiteHora;
        double salarioExcedente = 0;
        double excesso = 0;
        double salarioFinal = 0;

        if(horasTrabalhadas > limiteHora) {
            excesso = horasTrabalhadas - limiteHora;
            salarioExcedente = excesso * 20.00;
            salarioFinal = salario + salarioExcedente;
        }

        System.out.printf("O salário é R$ %.2f\n", salario);
        System.out.printf("O salário excedente é R$ %.2f\n", salarioExcedente);
        System.out.printf("O salário total é R$ %.2f\n", salarioFinal);
        entrada.close();

    }
}
