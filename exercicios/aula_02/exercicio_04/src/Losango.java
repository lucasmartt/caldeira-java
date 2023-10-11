class Losango extends FormaGeometrica {
    private String nomeDaForma;
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.nomeDaForma = "Losango";
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    String getNomeDaForma() {
        return this.nomeDaForma;
    };

    @Override
    double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}