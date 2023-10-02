import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 06
        // Escreva um programa que leia a idade do usuário e imprima respostas diferentes
        // dependendo do número colocado:
        // 1. Se for menor de 16 anos, avisar que não pode votar;
        // 2. Se tiver 16 ou 17, avisar que o voto é facultativo;
        // 3. Se tiver mais de 65, avisar que também é facultativo o voto;
        // 4. De 18 até 65, é obrigatório votar.

        Scanner scanner = new Scanner(System.in);
        String ERRO = "Por favor, insira um número: ";

        System.out.println("(digite \"-1\" para sair.)");
            while (true) {
                String IMPRIME = "O VOTO É ";
                int idade;
                System.out.print("Qual é a sua idade: ");

                String qualIdade = scanner.nextLine();
                try {
                    float idadeFloat = Float.parseFloat(qualIdade);
                    idade = (int) idadeFloat;
                    if (idade < 0) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.print(ERRO);
                    continue;
                }

                if (idade >= 18 && idade <= 65) {
                    IMPRIME += "OBRIGATÓRIO";
                } else if (idade < 16) {
                    IMPRIME += "PROIBIDO";
                } else {
                    IMPRIME += "FACULTATIVO";
                }

                System.out.println(IMPRIME);
            }
            scanner.close();
        }
    }