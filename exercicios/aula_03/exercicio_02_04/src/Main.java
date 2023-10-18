import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Exercício 4: LinkedHashMap
        // Crie um programa Java que utilize uma estrutura de dados do tipo
        // LinkedHashMap para associar produtos a seus preços. Insira algumas
        // entradas no mapa e, em seguida, imprima a lista de produtos na ordem
        // em que foram inseridos, exibindo o nome do produto e seu preço.

        Map<String, Double> produtos = new LinkedHashMap<>();

        produtos.put("Camiseta", 20.0);
        produtos.put("Calça", 40.0);
        produtos.put("Tênis", 60.0);
        produtos.put("Meias", 5.0);

        System.out.println("Lista de produtos na ordem de inserção:");
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            String produto = entry.getKey();
            double preco = entry.getValue();
            System.out.println(produto + " - R$" + preco);
        }
    }
}
