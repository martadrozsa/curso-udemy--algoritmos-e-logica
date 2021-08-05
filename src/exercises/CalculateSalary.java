package exercises;

import java.util.Scanner;

// Faça um programa que calcula o salário ao receber a quantidade de horas trabalhadas e o valor da hora.
// O programa deve multiplicar o número de horas trabalhadas pelo valor da hora e mostrar o resultado da multiplicação

public class CalculateSalary {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();

        System.out.print("Informe o valor recebido por hora trabalhada: ");
        double valorHoras = entrada.nextDouble();

        double salario = horasTrabalhadas * valorHoras;

        System.out.println("\nO valor do salário é R$ " + salario);

        entrada.close();
    }
}
