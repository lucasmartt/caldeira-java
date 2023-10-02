import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 02
        // Crie um programa que receba 2 números e imprima na tela.

        float primeiroNumero;
        float segundoNumero;

        Scanner scanner = new Scanner(System.in);
        String ERRO = "Por favor, insira um número: ";

        System.out.print("Insira um número: ");
        while (true) {
            String qualNumero1 = scanner.nextLine();
            try {
                primeiroNumero = Float.parseFloat(qualNumero1);
            } catch (NumberFormatException e) {
                System.out.print(ERRO);
                continue;
            }
            break;
        }

        while (true) {
        System.out.print("Insira outro número: ");
            String qualNumero2 = scanner.nextLine();
            try {
                segundoNumero = Float.parseFloat(qualNumero2);
            } catch (NumberFormatException e) {
                System.out.print(ERRO);
                continue;
            }
            break;
        }

        scanner.close();

        String IMPRIME = String.format(
            """
            O Primeiro Número é: %.0f
            O Segundo Número é: %.0f"""
            , primeiroNumero, segundoNumero
        );
        System.out.print(IMPRIME);
    }
}