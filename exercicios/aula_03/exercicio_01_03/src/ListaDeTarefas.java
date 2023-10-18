import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        // Exercício 3: Uso de List e ArrayList
        // Descrição: Crie um programa Java que permita ao usuário criar uma lista de tarefas.
        // O programa deve permitir adicionar tarefas à lista, remover tarefas e exibir
        // todas as tarefas na lista. Use um ArrayList para armazenar as tarefas. Tarefa deve
        // ser uma classe do seu código com os atributos: titulo, data e descrição e métodos
        // que você julgue necessários.

        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (escolha == 1) {
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    Tarefa novaTarefa = new Tarefa(titulo, descricao);
                    listaDeTarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
            } else if (escolha == 2) {
                    if (listaDeTarefas.isEmpty()) {
                        System.out.println("A lista de tarefas está vazia.");
                    } else {
                        System.out.println("Tarefas disponíveis:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            System.out.println(i + ". " + listaDeTarefas.get(i).getTitulo());
                        }
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int indiceRemover = scanner.nextInt();
                        if (indiceRemover >= 0 && indiceRemover < listaDeTarefas.size()) {
                            listaDeTarefas.remove(indiceRemover);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número de tarefa inválido.");
                        }
                    }
            } else if (escolha == 3) {
                    if (listaDeTarefas.isEmpty()) {
                        System.out.println("A lista de tarefas está vazia.");
                    } else {
                        System.out.println("Tarefas disponíveis:");
                        for (Tarefa tarefa : listaDeTarefas) {
                            System.out.println(tarefa);
                        }
                    }
            } else if (escolha == 4) {
                System.out.println("Saindo do programa.");
                scanner.close();
                System.exit(0);
            } else {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        }
    }
}