import java.util.Scanner;

public class Main {
    // Exercício 01
    // Crie um programa que leia seu nome e imprima na tela.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        String nome = scanner.nextLine();
        scanner.close();

        System.out.printf("Olá %s.", nome);
    }
}