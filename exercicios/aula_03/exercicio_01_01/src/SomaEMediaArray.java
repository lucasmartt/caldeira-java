import java.util.Scanner;

public class SomaEMediaArray {
    public static void main(String[] args) {
        // Exercício 1: Uso de Array
        // Descrição: Crie um programa Java que peça ao usuário para inserir 5 números
        // inteiros e armazene-os em um array. Em seguida, calcule e exiba a soma e a
        // média dos números inseridos.

        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = 5;
        int[] numeros = new int[tamanhoArray];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < tamanhoArray; i++) {
            soma += numeros[i];
        }

        double media = (double) soma / tamanhoArray;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
