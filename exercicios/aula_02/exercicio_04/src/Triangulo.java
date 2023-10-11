class Triangulo extends FormaGeometrica {
    private String nomeDaForma;
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.nomeDaForma = "Triangulo";
        this.base = base;
        this.altura = altura;
    }

    @Override
    String getNomeDaForma() {
        return this.nomeDaForma;
    };

    @Override
    double calcularArea() {
        return 0.5 * base * altura;
    }
}