package exercises;

import java.util.Scanner;

// Sua organização acaba de contratar um estagiário para trabalhar no suporte de informática,com a intenção de fazer um levantamento nas sucatas encontradas nesta área.
// A primeira tarefa dele é testar todos os cerca de 200 mouses que se encontram lá,testando e anotando o estado de cada um deles, para verificar o que se pode aproveitar deles.
// Foi requisitado que você desenvolva um programa para registar este levantamento. O programa deverá receber um número indeterminado de entradas, cada uma contendo:
/*
    número de identificação do mouse
    o tipo de defeito:
    necessita de esfera
    necessita de limpeza
    necessita troca do cabo ou conector
    quebrado ou inutilizado
    uma identificação igual a zero encerra o programa.

    Ao final o programa deverá emitir o seguinte relatório:

    Quantidade de mouses: 100

    Situação									Quantidade				Percentual
    1 - necessita de esfera						40						40%
    2 - necessita de limpesa					30						30%
    3 - necessita troca do cabo ou conector		15						15%
    4 - quedrado ou inutilizado					15						15%
*/

public class ProductControl {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contadorTotal = 0;
        int contadorDefeito1 = 0;
        int contadorDefeito2 = 0;
        int contadorDefeito3 = 0;
        int contadorDefeito4 = 0;

        System.out.println("Informe o tipo de defeito: "
                + " \n 1 - necessita de esfera"
                + "	\n 2 - necessita de limpeza"
                + "	\n 3 - necessita troca do cabo ou conector"
                + "	\n 4 - quebadro ou inutilizado");

        int tipoDefeito = entrada.nextInt();

        while (tipoDefeito != 0) {
            if (tipoDefeito == 1) {
                contadorDefeito1 = contadorDefeito1 + 1;
                contadorTotal = contadorTotal + 1;
            }else if(tipoDefeito == 2){
                contadorDefeito2 = contadorDefeito2 + 1;
                contadorTotal = contadorTotal + 1;
            }else if(tipoDefeito == 3) {
                contadorDefeito3 = contadorDefeito3 + 1;
                contadorTotal = contadorTotal + 1;
            }else if(tipoDefeito == 4) {
                contadorDefeito4 = contadorDefeito4 + 1;
                contadorTotal = contadorTotal + 1;
            }

            System.out.println("Informe o tipo de defeito: "
                    + " \n 1 - necessita de esfera"
                    + "	\n 2 - necessita de limpeza"
                    + "	\n 3 - necessita troca do cabo ou conector"
                    + "	\n 4 - quebadro ou inutilizado");
            tipoDefeito = entrada.nextInt();
        }

        double p1 = (contadorDefeito1 / contadorTotal) * 100;
        double p2 = (contadorDefeito2 / contadorTotal) * 100;
        double p3 = (contadorDefeito3 / contadorTotal) * 100;
        double p4 = (contadorDefeito4 / contadorTotal) * 100;

        System.out.printf("Quantidade de mouses %d\n", contadorTotal);
        System.out.printf("Situação \t\t\t\tQuantidade \tPercentual\n");
        System.out.printf("1 - necessita de esfera \t\t\t%d \t\t%.2f\n", contadorDefeito1, p1);
        System.out.printf("2 - necessita de limpeza \t\t\t%d \t\t%.2f\n", contadorDefeito2, p2);
        System.out.printf("3 - necessita troca do cabo ou conector \t%d \t\t%.2f\n", contadorDefeito3, p3);
        System.out.printf("4 - quebadro ou inutilizado \t\t\t%d \t\t%.2f\n", contadorDefeito4, p4);

        entrada.close();
    }
}
