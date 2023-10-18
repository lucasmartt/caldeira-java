class Impressao {
    private String nome;
    private int numeroPaginas;

    public Impressao(String titulo, int numeroPaginas) {
        this.nome = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Documento [Nome: " + nome + ", Numero de páginas: " + numeroPaginas + "]";
    }
}
