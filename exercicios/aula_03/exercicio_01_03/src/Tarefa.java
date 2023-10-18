import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {
    private String titulo;
    private LocalDate data;
    private String descricao;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.data = LocalDate.now();
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa [Título: " + titulo + ", Data: " + data + ", Descrição: " + descricao + "]";
    }
}
