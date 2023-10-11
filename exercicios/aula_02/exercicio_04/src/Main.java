import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Retangulo(4, 6));
        formas.add(new Circulo(5));
        formas.add(new Triangulo(3, 4));
        formas.add(new Quadrado(5));
        formas.add(new Losango(6, 8));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área do " + forma.getNomeDaForma() + ": " + forma.calcularArea());
        }
    }
}
