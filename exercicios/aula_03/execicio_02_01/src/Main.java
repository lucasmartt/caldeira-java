import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Exercício 1: Stack com livros
        // Crie um programa Java que utilize uma estrutura de dados do tipo
        // Stack para armazenar objetos da classe Livros. Implemente a classe
        // Livro, com título e categoria, inicialize a pilha com alguns
        // livros, imprimir os elementos da pilha, imprimir com base na
        // categoria e implemente um loop para remover até que ela esteja vazia.

        Stack<Livro> pilhaDeLivros = new Stack<>();

        pilhaDeLivros.push(new Livro("Livro 1", "Aventura"));
        pilhaDeLivros.push(new Livro("Livro 2", "Romance"));
        pilhaDeLivros.push(new Livro("Livro 3", "Ficção Científica"));
        pilhaDeLivros.push(new Livro("Livro 4", "Aventura"));

        System.out.println("Elementos na pilha:");
        for (Livro livro : pilhaDeLivros) {
            System.out.println(livro.getTitulo() + " - " + livro.getCategoria());
        }

        String categoriaDesejada = "Aventura";
        System.out.println("\nLivros na categoria '" + categoriaDesejada + "':");
        for (Livro livro : pilhaDeLivros) {
            if (livro.getCategoria().equals(categoriaDesejada)) {
                System.out.println(livro.getTitulo() + " - " + livro.getCategoria());
            }
        }

        System.out.println("\nRemovendo livros da pilha:");
        while (!pilhaDeLivros.isEmpty()) {
            Livro livroRemovido = pilhaDeLivros.pop();
            System.out.println("Removido: " + livroRemovido.getTitulo() + " - " + livroRemovido.getCategoria());
        }
    }
}
