import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Reserva {
    private String nome;
    private String local;
    private String cpf;
    private LocalDate dataDeEntrada;
    private LocalDate dataDeSaida;

    public Reserva(String titulo, String local, String cpf, String dataDeEntrada, String dataDeSaida) {
        this.nome = titulo;
        this.local = local;
        this.cpf = cpf;
        this.dataDeEntrada = formataData(dataDeEntrada);
        this.dataDeSaida = formataData(dataDeSaida);
    }

    private LocalDate formataData(String data) {
        DateTimeFormatter formatoDeData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(data, formatoDeData);
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public LocalDate getDataDeSaida() {
        return dataDeSaida;
    }

    @Override
    public String toString() {
        return "Reserva [Nome: " + nome + ", Local de destino: " + local +  ", CPF: " + cpf +  ", Data de entrada: " + dataDeEntrada +  ", Data de saída: " + dataDeSaida + "]";
    }
}
