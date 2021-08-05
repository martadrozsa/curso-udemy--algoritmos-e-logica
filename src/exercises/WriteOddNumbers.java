package exercises;

// Elabore um programa que gera e escreve números ímpares dos números entre 100 e 200.

public class WriteOddNumbers {
    public static void main(String[] args) {

        for(int i = 100; i <= 200; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
