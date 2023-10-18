import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Produto {
    private String nome;
    private LocalDate validade;

    public Produto(String titulo, String validade) {
        this.nome = titulo;
        this.validade = formataData(validade);
    }

    private LocalDate formataData(String data) {
        DateTimeFormatter formatoDeData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(data, formatoDeData);
    }

    public String getTitulo() {
        return nome;
    }

    public LocalDate getData() {
        return validade;
    }

    @Override
    public String toString() {
        return "Produto [Nome: " + nome + ", Data de validade: " + validade + "]";
    }
}
