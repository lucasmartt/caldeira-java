import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 4: Interface, Enum e Tratamento de Erros
        // Expanda o exercício 3 adicionando uma interface chamada Calculavel com métodos para
        // adicionar, subtrair, multiplicar e dividir números inteiros. Em seguida, crie uma
        // classe que implemente a interface Calculavel e use um enum para selecionar a operação
        // desejada. Trate exceções adequadamente para situações como divisão por zero
        // ou operação inválida.

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        Operacao operacao;

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o segundo número inteiro: ");
            num2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Escolha uma operação (+, -, *, /): ");
            String op = scanner.nextLine();

            if (Objects.equals(op, "+")) {
                operacao = Operacao.SOMA;
            } else if (Objects.equals(op, "-")) {
                operacao = Operacao.SUBTRACAO;
            } else if (Objects.equals(op, "*")) {
                operacao = Operacao.MULTIPLICACAO;
            } else if (Objects.equals(op, "/")) {
                operacao = Operacao.DIVISAO;
            } else {
                throw new Exception();
            }

            Calculadora calculadora = new Calculadora();

            int resultado = 0;

            switch (operacao) {
                case SOMA:
                    resultado = calculadora.somar(num1, num2);
                    break;
                case SUBTRACAO:
                    resultado = calculadora.subtrair(num1, num2);
                    break;
                case MULTIPLICACAO:
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case DIVISAO:
                    resultado = calculadora.dividir(num1, num2);
                    break;
            }

            System.out.println("O resultado da operação é: " + resultado);

        } catch (NumberFormatException e) {
            System.err.println("Erro: Você deve inserir dois números inteiros válidos.");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            System.err.println("Erro: Operação inválida.");
        } finally {
            scanner.close();
        }
    }
}

