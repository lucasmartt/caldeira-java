public class Circulo {
    private double raio;

    public Circulo(double raio) {
        definirRaio(raio);
    }

    public void definirRaio(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
        } else {
            throw new IllegalArgumentException("O raio deve ser um valor positivo.");
        }
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public boolean saoIguais(Circulo outroCirculo) {
        return this.raio == outroCirculo.raio;
    }

    @Override
    public String toString() {
        return "Círculo [Raio=" + raio + ", Área=" + calcularArea() + ", Circunferência=" + calcularCircunferencia() + "]";
    }
}
