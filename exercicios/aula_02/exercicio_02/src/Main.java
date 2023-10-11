public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(3.0);

        System.out.println("Círculo 1: " + circulo1.toString());
        System.out.println("Círculo 2: " + circulo2.toString());

        circulo1.definirRaio(8.0);

        System.out.println("Círculo 1 após alteração do raio: " + circulo1.toString());
        System.out.println("Círculo 1 é igual ao Círculo 2? " + circulo1.saoIguais(circulo2));
    }
}