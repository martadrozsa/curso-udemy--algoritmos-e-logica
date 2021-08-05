package exercises;

// Faça um programa que conte de 1 a 100 e a cada múltiplo de 10 emita a mensagem: "Multiplo de 10".

public class MultipleOfTen {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
            if(i % 10 == 0) {
                System.out.println("É múltiplo de 10");
            }
        }
    }
}
