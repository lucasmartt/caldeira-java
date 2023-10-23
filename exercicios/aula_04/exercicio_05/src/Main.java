import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 5: Tratamento de Erros com Exceções Personalizadas (RuntimeException)
        // Crie uma exceção personalizada chamada IdadeInvalidaException que herde de
        // RuntimeException. Em um programa, peça ao usuário que insira sua idade.Se a
        // idade for menor que 0 ou maior que 150, lance a exceção IdadeInvalidaException
        // com uma mensagem apropriada.

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("Idade inválida. A idade deve estar entre 0 e 150 anos.");
            }

            System.out.println("Sua idade é: " + idade);

        } catch (NumberFormatException e) {
            System.err.println("Erro: Você deve inserir uma idade válida (número inteiro).");
        } catch (IdadeInvalidaException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}