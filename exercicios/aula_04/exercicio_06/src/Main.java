public class Main {
    public static void main(String[] args) {
        // Exercício 6: Tratamento de Erros com Exceções Personalizadas (Exception)
        // Crie uma exceção personalizada chamada SaldoInsuficienteException que
        // herde de Exception. Crie uma classe ContaBancaria que represente uma
        // conta com um saldo inicial. Escreva um método sacar(double valor) na
        // classe ContaBancaria que lance a exceção SaldoInsuficienteException se
        // o saldo for insuficiente para a retirada. Em um programa principal,
        // trate essa exceção e forneça uma mensagem de erro adequada.

        ContaBancaria minhaConta = new ContaBancaria(1000.0);

        try {
            minhaConta.sacar(1500.0);
        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

