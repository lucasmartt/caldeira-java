import java.util.Scanner;
import java.util.TreeMap;

public class AgendaTelefonica {
    public static void main(String[] args) {
        // Exercício 3: TreeMap com agenda
        // Crie um programa Java que utilize uma estrutura de dados do tipo TreeMap
        // para criar uma agenda telefônica. Agenda deve conter: número de telefone,
        // nome, endereço e local da cidade (norte, sul, centro, leste e oeste).
        // Associe nomes a números de telefone e, em seguida, imprima a lista de
        // contatos em ordem alfabética e imprima os contatos com base na localidade.

        TreeMap<String, Contato> agenda = new TreeMap<>();

        agenda.put("João", new Contato("91111-1111", "João", "Rua Abc, Bairro Bcd", "Norte"));
        agenda.put("Maria", new Contato("92222-2222", "Maria", "Avenida Bcd, Bairro Cde", "Sul"));
        agenda.put("Pedro", new Contato("93333-3333", "Pedro", "Rua Cde, Bairro Def", "Leste"));
        agenda.put("Ana", new Contato("94444-4444", "Ana", "Avenida Def, Bairro Efg", "Oeste"));
        agenda.put("Lucas", new Contato("95555-5555", "Lucas", "Avenida Fgh, Bairro Ghi", "Centro"));

        System.out.println("Lista de contatos em ordem alfabética:");
        for (Contato contato : agenda.values()) {
            System.out.println(contato.getNome() + " - " + contato.getNumeroTelefone() + " - " + contato.getLocalidade());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite uma região (Norte, Sul, Leste, Oeste, Centro): ");
        String localidadeDesejada = scanner.nextLine();

        System.out.println("\nContatos na localidade '" + localidadeDesejada + "':");
        for (Contato contato : agenda.values()) {
            if (contato.getLocalidade().equals(localidadeDesejada)) {
                System.out.println(contato.getNome() + " - " + contato.getNumeroTelefone() + " - " + contato.getEndereco());
            }
        }
    }
}