import java.util.LinkedList;
import java.util.Scanner;

public class FilaDeImpressao {
    public static void main(String[] args) {
        // Exercício 5: Uso de List e LinkedList:
        // Crie um programa Java que simule um sistema de fila de impressão.
        // O programa deve permitir que os usuários adicionem documentos à fila de impressão
        // e, em seguida, imprimir documentos da fila. Use uma LinkedList para representar a
        // fila de impressão. Impressão deve ser uma classe do seu código com os atributos:
        // nome e numero de páginas e métodos que você julgue necessários.

        LinkedList<Impressao> filaDeImpressao = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar documento à fila de impressão");
            System.out.println("2. Remover documento da fila de impressão");
            System.out.println("3. Exibir documentos");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (escolha == 1) {
                System.out.print("Digite o nome do documento: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o número de páginas: ");
                int validade = scanner.nextInt();
                Impressao novaImpressao = new Impressao(nome, validade);
                filaDeImpressao.add(novaImpressao);
                System.out.println("Documento adicionado com sucesso!");
            } else if (escolha == 2) {
                if (filaDeImpressao.isEmpty()) {
                    System.out.println("A fila de impressão está vazia.");
                } else {
                    System.out.println("Documentos disponíveis:");
                    for (int i = 0; i < filaDeImpressao.size(); i++) {
                        System.out.println(i + ". " + filaDeImpressao.get(i).getNome());
                    }
                    System.out.print("Digite o número do documento a ser removido: ");
                    int indiceRemover = scanner.nextInt();
                    if (indiceRemover >= 0 && indiceRemover < filaDeImpressao.size()) {
                        filaDeImpressao.remove(indiceRemover);
                        System.out.println("Documento removido com sucesso!");
                    } else {
                        System.out.println("Número de documento inválido.");
                    }
                }
            } else if (escolha == 3) {
                if (filaDeImpressao.isEmpty()) {
                    System.out.println("A fila de impressão está vazia.");
                } else {
                    System.out.println("Documentos disponíveis:");
                    for (Impressao impressao : filaDeImpressao) {
                        System.out.println(impressao);
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