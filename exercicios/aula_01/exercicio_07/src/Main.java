import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 07
        // Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário
        // a idade dele e o seu salário. A pessoa só pode comprar um automóvel se for de maior
        // e ganhar mais de R$ 2.000,00.

        float salario;
        int idade;
        String IMPRIME;

        Scanner scanner = new Scanner(System.in);
        String ERRO = "Por favor, insira um número!";
        while (true) {
            System.out.print("Qual é o seu salário: ");
            String qualSalario = scanner.nextLine();
            try {
                salario = Float.parseFloat(qualSalario);
            } catch (NumberFormatException e) {
                System.out.println(ERRO);
                continue;
            }

            System.out.print("Qual é a sua idade: ");
            String qualIdade = scanner.nextLine();
            try {
                float idadeFloat = Float.parseFloat(qualIdade);
                idade = (int) idadeFloat;
            } catch (NumberFormatException e) {
                System.out.println(ERRO);
                continue;
            }
            scanner.close();
            break;
        }

        if (idade >= 18 && salario >= 2000) {
            IMPRIME = "PERMITIDO";
        } else {
            IMPRIME = "PROIBIDO";
        }

        System.out.print(IMPRIME);
    }
}