import java.util.LinkedList;
import java.util.Scanner;

public class ReservaPassagem {
    public static void main(String[] args) {
        // Exercício 6: Uso de List e LinkedList
        // Descrição: Crie um programa Java que represente um sistema de reservas de
        // passagens de avião. O programa deve permitir que os usuários reservem passagens,
        // cancelem reservas e exibam a lista de reservas. Use uma LinkedList para
        // representar as reservas de passagens. Reserva deve ser uma classe do seu código
        // com os atributos: nome, local, cpf de quem reservou, data de entrada e data de
        // saída, e métodos que você julgue necessários.

        LinkedList<Reserva> listaDeReservas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Reservar passagem");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Exibir lista de reservas");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (escolha == 1) {
                System.out.print("Digite o seu nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o seu cpf: ");
                String cpf = scanner.nextLine();
                System.out.print("Digite o local de destino: ");
                String local = scanner.nextLine();
                System.out.print("Digite a data de entrada (\"DD-MM-AAAA\"): ");
                String dataDeEntrada = scanner.nextLine();
                System.out.print("Digite a data de saída (\"DD-MM-AAAA\"): ");
                String dataDeSaida = scanner.nextLine();
                Reserva novaReserva = new Reserva(nome, local, cpf, dataDeEntrada, dataDeSaida);
                listaDeReservas.add(novaReserva);
                System.out.println("Reserva efetuada com sucesso!");
            } else if (escolha == 2) {
                if (listaDeReservas.isEmpty()) {
                    System.out.println("Não há reservas registradas.");
                } else {
                    System.out.println("Reservas disponíveis:");
                    for (int i = 0; i < listaDeReservas.size(); i++) {
                        Reserva reserva = listaDeReservas.get(i);
                        System.out.println(i + ". " + reserva.getLocal() + ", " + reserva.getDataDeEntrada());
                    }
                    System.out.print("Digite o número da Reserva a ser removida: ");
                    int indiceRemover = scanner.nextInt();
                    if (indiceRemover >= 0 && indiceRemover < listaDeReservas.size()) {
                        listaDeReservas.remove(indiceRemover);
                        System.out.println("Reserva removida com sucesso!");
                    } else {
                        System.out.println("Número de reserva inválido.");
                    }
                }
            } else if (escolha == 3) {
                if (listaDeReservas.isEmpty()) {
                    System.out.println("Não há reservas registradas.");
                } else {
                    System.out.println("Reservas disponíveis:");
                    for (Reserva reserva : listaDeReservas) {
                        System.out.println(reserva);
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