import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeProdutos {
    public static void main(String[] args) {
        // Exercício 4: Uso de List e ArrayList
        // Descrição: Crie um programa Java que simule uma lista de compras. O programa deve permitir
        // que o usuário adicione itens à lista, remova itens da lista e exiba a lista de compras
        // atual. Use um ArrayList para armazenar os itens da lista de compras. Compra deve ser uma
        // classe do seu código com os atributos: nome e data de validade e métodos que você julgue
        // necessários.

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Exibir produtos");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (escolha == 1) {
                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a data de validade do produto (\"DD-MM-AAAA\"): ");
                String validade = scanner.nextLine();
                Produto novaProduto = new Produto(nome, validade);
                listaDeProdutos.add(novaProduto);
                System.out.println("Produto adicionado com sucesso!");
            } else if (escolha == 2) {
                if (listaDeProdutos.isEmpty()) {
                    System.out.println("A lista de produtos está vazia.");
                } else {
                    System.out.println("Produtos disponíveis:");
                    for (int i = 0; i < listaDeProdutos.size(); i++) {
                        System.out.println(i + ". " + listaDeProdutos.get(i).getTitulo());
                    }
                    System.out.print("Digite o número do produto a ser removida: ");
                    int indiceRemover = scanner.nextInt();
                    if (indiceRemover >= 0 && indiceRemover < listaDeProdutos.size()) {
                        listaDeProdutos.remove(indiceRemover);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Número de produto inválido.");
                    }
                }
            } else if (escolha == 3) {
                if (listaDeProdutos.isEmpty()) {
                    System.out.println("A lista de produtos está vazia.");
                } else {
                    System.out.println("Produtos disponíveis:");
                    for (Produto produto : listaDeProdutos) {
                        System.out.println(produto);
                    }
                }
            } else if (escolha == 4) {
                System.out.println("Saindo do programa.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }
            System.out.println();
        }
    }
}