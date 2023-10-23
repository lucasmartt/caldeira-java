class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Seu saldo é de " + saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque bem-sucedido. Saldo restante: " + saldo);
        }
    }
}
