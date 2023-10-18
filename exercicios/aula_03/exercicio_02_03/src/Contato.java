class Contato {
    private String numeroTelefone;
    private String nome;
    private String endereco;
    private String localidade;

    public Contato(String numeroTelefone, String nome, String endereco, String localidade) {
        this.numeroTelefone = numeroTelefone;
        this.nome = nome;
        this.endereco = endereco;
        this.localidade = localidade;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalidade() {
        return localidade;
    }
}