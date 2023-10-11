public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João Silva", "12345678900", 12345, "Banco XYZ", "Rua A, 123", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria Santos", "98765432100", 54321, "Banco ABC", "Rua B, 456", 500.0);

        conta1.verificarInformacoes();
        conta1.deposito(200.0);
        conta1.saque(50.0);
        conta1.pix(100.0);

        conta2.verificarInformacoes();
        conta2.transferencia(conta1, 200.0);

        conta1.verificarInformacoes();
        conta1.fecharConta();
        conta1.verificarInformacoes();

        conta1.aplicarTaxaManutencaoMensal();
        conta1.calcularJuros(2.0);
        conta1.exibirHistoricoTransacoes();
    }
}