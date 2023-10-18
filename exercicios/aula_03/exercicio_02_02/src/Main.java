import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício 2: HashMap com pessoas
        // Crie um programa Java que utilize uma estrutura de dados do tipo HashMap
        // para associar nomes a idades. Insira algumas entradas no mapa e, em seguida,
        // acesse e imprima a idade de um nome específico. Crie um método para imprimir
        // nomes das pessoas que estão na terceira idade. Certifique-se de lidar com o
        // caso em que o nome não está presente no mapa.

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mapaDePessoas = new HashMap<>();

        mapaDePessoas.put("João", 25);
        mapaDePessoas.put("Maria", 60);
        mapaDePessoas.put("Pedro", 70);
        mapaDePessoas.put("Ana", 45);
        mapaDePessoas.put("Lucas", 80);

        System.out.println("Pessoas na lista: ");
        for (Map.Entry<String, Integer> entry : mapaDePessoas.entrySet()) {
            String nome = entry.getKey();
            int idade = entry.getValue();
            System.out.println(nome + " - " + idade + " anos");
        }

        System.out.println("\nDigite um nome: ");
        String nomeBuscado = scanner.nextLine();

        if (mapaDePessoas.containsKey(nomeBuscado)) {
            int idade = mapaDePessoas.get(nomeBuscado);
            System.out.println(nomeBuscado + " tem " + idade + " anos.");
        } else {
            System.out.println("Nome não encontrado no mapa.");
        }

        System.out.println("\nPessoas na terceira idade:");
        for (Map.Entry<String, Integer> entry : mapaDePessoas.entrySet()) {
            String nome = entry.getKey();
            int idade = entry.getValue();
            if (idade >= 60) {
                System.out.println(nome + " - " + idade + " anos");
            }
        }
    }
}
