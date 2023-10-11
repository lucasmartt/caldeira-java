class GerenciadorDeImpostoDeRenda {
    private double totalImpostos = 0.0;

    public void adicionar(Tributavel tributavel) {
        totalImpostos += tributavel.calculaTributos();
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }
}