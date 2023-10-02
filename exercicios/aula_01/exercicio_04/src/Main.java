import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double SALARIO_MINIMO = 1320.0;
        double salario;

        Scanner scanner = new Scanner(System.in);
        String ERRO = "Por favor, insira um número: ";

        System.out.print("Qual é o seu salário: ");
        while (true) {
            String qualSalario = scanner.nextLine();
            try {
                salario = Float.parseFloat(qualSalario);
            } catch (NumberFormatException e) {
                System.out.print(ERRO);
                continue;
            }
            break;
        }

        scanner.close();

        double multiplo = salario / SALARIO_MINIMO;

        System.out.printf("Você recebe %.2f salário mínimos.", multiplo);
    }
}