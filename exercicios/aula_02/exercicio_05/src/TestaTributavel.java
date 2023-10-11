public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        SeguroDeVida seguro = new SeguroDeVida();

        cc.depositar(1000.0);
        cp.depositar(2000.0);

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        gerenciador.adicionar(cc);
        gerenciador.adicionar(cp);
        gerenciador.adicionar(seguro);

        System.out.println("Imposto da Conta Corrente: " + cc.calculaTributos());
        System.out.println("Imposto da Conta Poupança: " + cp.calculaTributos());
        System.out.println("Imposto do Seguro de Vida: " + seguro.calculaTributos());
        System.out.println("Total de Impostos: " + gerenciador.getTotalImpostos());
    }
}