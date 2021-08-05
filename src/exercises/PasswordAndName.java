package exercises;

import javax.swing.*;

// Faça um programa que leia um nome de usuário e a sua senha. O programa não deve aceitar a senha igual ao nome do usuário.
// Deve mostrar uma mensagem de erro e solicitar novamente as informações.

public class PasswordAndName {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        String senha = JOptionPane.showInputDialog("Informe a sua senha: ");

        while (nome.equalsIgnoreCase(senha)) {
            JOptionPane.showMessageDialog(null, "Erro! O nome do usuário e da senha devem ser diferentes.");
            nome = JOptionPane.showInputDialog("Informe o seu nome: ");
            senha = JOptionPane.showInputDialog("Informe a sua senha: ");
        }
    }
}
