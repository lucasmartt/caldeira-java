class Quadrado extends FormaGeometrica {
    private String nomeDaForma;
    private double lado;

    public Quadrado(double lado) {
        this.nomeDaForma = "Quadrado";
        this.lado = lado;
    }

    @Override
    String getNomeDaForma() {
        return this.nomeDaForma;
    };

    @Override
    double calcularArea() {
        return lado * lado;
    }
}