import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 08
        // Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções,
        // perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas.
        // Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito.

        int grupo;
        String IMPRIME = "POR FAVOR ENCAMINHE-SE A ";

        Scanner scanner = new Scanner(System.in);
        String ERRO = "Por favor, insira o número de uma das opções: ";
        System.out.print(
            """
            (digite "-1" para sair.)
            
            
            Você se enquadra em algum dos seguintes grupos?
            1. Gestante
            2. Idoso
            3. Pessoa com Deficiência (PCD)
            4. Nenhuma das opções mencionadas
    
            Responda com o número da opção:\s"""
        );
        while (true) {
            String qualGrupo = scanner.nextLine();
            try {
                float grupoFloat = Float.parseFloat(qualGrupo);
                grupo = (int) grupoFloat;
                if (grupo == -1) {
                    return;
                } else if (grupo < 1 || grupo > 4) {
                    System.out.print(ERRO);
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.print(ERRO);
                continue;
            }
            scanner.close();
            break;
        }
        IMPRIME += (grupo == 4) ? "FILA REGULAR" : "FILA PREFERENCIAL";

        System.out.print(IMPRIME);
    }
}