public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Marca de Carro", "Modelo de Carro", 2020);
        double distanciaCarro = carro1.calcularCustoViagem(2000);

        Moto moto1 = new Moto("Marca de Moto", "Modelo de Moto", 2020);
        double distanciaMoto = moto1.calcularCustoViagem(2000);

        System.out.println("A o custo para o carro é de: " + distanciaCarro);
        System.out.println("A o custo para a moto é de: " + distanciaMoto);
    }
}