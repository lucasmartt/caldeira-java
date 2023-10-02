import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 03
        // Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

        double[] numeros = new double[3];

        Scanner scanner = new Scanner(System.in);
        String ERRO = "NaN";

        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                System.out.print("Insira um número: ");
            } else {
                System.out.print("Insira mais um número: ");
            }
            String qualNumero = scanner.nextLine();
            try {
                numeros[i] = Float.parseFloat(qualNumero);
            } catch (NumberFormatException e) {
                System.out.println(ERRO);
                i--;
            }
        }

        scanner.close();

        double maior = numeros[0];
        double menor = numeros[0];
        double soma = 0;

        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            soma += numero;
        }

        double media = soma / numeros.length;

        String IMPRIME = String.format(
                """
                
                O Maior Número é: %.2f
                O Menor Número é: %.2f
                A Média é: %.2f"""
                , maior, menor, media
        );
        System.out.print(IMPRIME);
    }
}