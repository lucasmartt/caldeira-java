class Calculadora implements Calculavel {
    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
