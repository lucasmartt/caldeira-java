import java.util.Random;
import java.util.Scanner;

public class BuscaNumeroArray {
    public static void main(String[] args) {
        // Exercício 2: Uso de Array
        // Descrição: Crie um programa Java que gere automaticamente um array de 10 números
        // inteiros aleatórios entre 1 e 100. Em seguida, peça ao usuário para inserir um
        // número e verifique se esse número está presente no array. Exiba uma mensagem
        // indicando se o número foi encontrado ou não.

        Random random = new Random();

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se está presente no array: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(numeroBuscado + " está presente no array.");
        } else {
            System.out.println(numeroBuscado + " não está presente no array.");
        }

        System.out.print("Números gerados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        scanner.close();
    }
}
