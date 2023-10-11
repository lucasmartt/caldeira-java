class Retangulo extends FormaGeometrica {
    private String nomeDaForma;
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.nomeDaForma = "Retângulo";
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    String getNomeDaForma() {
        return this.nomeDaForma;
    };

    @Override
    double calcularArea() {
        return comprimento * largura;
    }
}