class ContaPoupanca extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return 0; // 1% de imposto sobre o saldo
    }
}