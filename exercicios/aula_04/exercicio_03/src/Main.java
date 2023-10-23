import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 3: Tratamento de Erros
        // Crie um programa que solicite ao usuário que insira dois números inteiros.
        // Utilize tratamento de exceções para lidar com a possibilidade de entrada
        // inválida (por exemplo, uma entrada que não seja um número inteiro) e exiba
        // uma mensagem de erro apropriada.

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o segundo número inteiro: ");
            num2 = Integer.parseInt(scanner.nextLine());

            int resultado = num1 + num2;
            System.out.println("A soma dos números é: " + resultado);
        } catch (NumberFormatException e) {
            System.err.println("Erro: Você deve inserir dois números inteiros válidos.");
        } finally {
            scanner.close();
        }
    }
}
