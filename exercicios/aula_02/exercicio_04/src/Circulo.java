class Circulo extends FormaGeometrica {
    private String nomeDaForma;
    private double raio;

    public Circulo(double raio) {
        this.nomeDaForma = "Circulo";
        this.raio = raio;
    }

    @Override
    String getNomeDaForma() {
        return this.nomeDaForma;
    };

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}