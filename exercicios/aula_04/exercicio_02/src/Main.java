import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 2: Enum
        // Crie um enum chamado DiaDaSemana que represente os dias da semana
        // (por exemplo, SEGUNDA, TERCA, etc.). Escreva um programa que aceite
        // um dia da semana do usuário e imprima uma mensagem de acordo com o
        // dia escolhido.

        Scanner scanner = new Scanner(System.in);
        DiaDaSemana diaDaSemana;

        System.out.print("""
                1. Domingo
                2. Segunda
                3. Terça
                4. Quarta
                5. Quinta
                6. Sexta
                7. Sábado
                Escolha um dia da semana:\s""");
        while (true) {

            try {
                int dia = Integer.parseInt(scanner.nextLine());
                if (dia == 1) {
                    diaDaSemana = DiaDaSemana.DOMINGO;
                } else if (dia == 2) {
                    diaDaSemana = DiaDaSemana.SEGUNDA;
                } else if (dia == 3) {
                    diaDaSemana = DiaDaSemana.TERCA;
                } else if (dia == 4) {
                    diaDaSemana = DiaDaSemana.QUARTA;
                } else if (dia == 5) {
                    diaDaSemana = DiaDaSemana.QUINTA;
                } else if (dia == 6) {
                    diaDaSemana = DiaDaSemana.SEXTA;
                } else if (dia == 7) {
                    diaDaSemana = DiaDaSemana.SABADO;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("Digite o número de uma das opções: ");
                continue;
            }

            if (diaDaSemana == DiaDaSemana.DOMINGO) {
                System.out.println("Domingo é o dia do Sol.");
            } else if (diaDaSemana == DiaDaSemana.SEGUNDA) {
                System.out.println("Segunda é o dia dia da Lua.");
            } else if (diaDaSemana == DiaDaSemana.TERCA) {
                System.out.println("Terça é o dia dia de Marte.");
            } else if (diaDaSemana == DiaDaSemana.QUARTA) {
                System.out.println("Quarta é o dia dia de Mercúrio.");
            } else if (diaDaSemana == DiaDaSemana.QUINTA) {
                System.out.println("Quinta é o dia dia de Júpiter.");
            } else if (diaDaSemana == DiaDaSemana.SEXTA) {
                System.out.println("Sexta é o dia dia de Vênus.");
            } else if (diaDaSemana == DiaDaSemana.SABADO) {
                System.out.println("Sábado é o dia dia de Saturno.");
            }
            break;
        }
    }
}
