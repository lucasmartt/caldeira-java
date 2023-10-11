import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private Calendar horarioAtual;
    private List<String> historicoTransacoes;
    private boolean contaFechada;
    private double taxaManutencaoMensal;

    public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = Calendar.getInstance();
        this.historicoTransacoes = new ArrayList<>();
        this.contaFechada = false;
        this.taxaManutencaoMensal = 10.0;
    }

    public void saque(double valor) {
        if (!contaFechada) {
            if (saldo >= valor) {
                saldo -= valor;
                historicoTransacoes.add("Saque de R$" + valor);
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        } else {
            System.out.println("Conta fechada. Não é possível realizar operações.");
        }
    }

    public void deposito(double valor) {
        if (!contaFechada) {
            saldo += valor;
            historicoTransacoes.add("Depósito de R$" + valor);
        } else {
            System.out.println("Conta fechada. Não é possível realizar operações.");
        }
    }

    public void pix(double valor) {
        if (!contaFechada) {
            if (saldo >= valor) {
                saldo -= valor;
                historicoTransacoes.add("Transferência PIX de R$" + valor);
            } else {
                System.out.println("Saldo insuficiente para a transferência PIX.");
            }
        } else {
            System.out.println("Conta fechada. Não é possível realizar operações.");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        if (!contaFechada) {
            Calendar horarioLimiteInicio = Calendar.getInstance();
            horarioLimiteInicio.set(Calendar.HOUR_OF_DAY, 8);
            horarioLimiteInicio.set(Calendar.MINUTE, 0);
            horarioLimiteInicio.set(Calendar.SECOND, 0);

            Calendar horarioLimiteFim = Calendar.getInstance();
            horarioLimiteFim.set(Calendar.HOUR_OF_DAY, 19);
            horarioLimiteFim.set(Calendar.MINUTE, 0);
            horarioLimiteFim.set(Calendar.SECOND, 0);

            if (horarioAtual.after(horarioLimiteInicio) && horarioAtual.before(horarioLimiteFim)) {
                if (saldo >= valor) {
                    saldo -= valor;
                    destino.deposito(valor);
                    historicoTransacoes.add("Transferência para conta " + destino.identificadorConta + " de R$" + valor);
                } else {
                    System.out.println("Saldo insuficiente para a transferência.");
                }
            } else {
                System.out.println("Operação de transferência permitida apenas das 8h às 19h.");
            }
        } else {
            System.out.println("Conta fechada. Não é possível realizar operações.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void verificarHorario() {
        System.out.println("Horário atual: " + horarioAtual.getTime());
    }

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        verificarSaldo();
        verificarHorario();
    }

    public void alterarEndereco(String novoEndereco) {
        if (!contaFechada) {
            this.endereco = novoEndereco;
        } else {
            System.out.println("Conta fechada. Não é possível realizar operações.");
        }
    }

    public void calcularJuros(double taxa) {
        if (!contaFechada) {
            double juros = saldo * (taxa / 100.0);
            saldo += juros;
            historicoTransacoes.add("Juros de R$" + juros + " aplicados.");
        } else {
            System.out.println("Conta fechada. Não é possível realizar operações.");
        }
    }

    public void fecharConta() {
        if (!contaFechada) {
            contaFechada = true;
            saldo = 0;
            historicoTransacoes.add("Conta fechada. Saldo zerado.");
        } else {
            System.out.println("A conta já está fechada.");
        }
    }

    public void aplicarTaxaManutencaoMensal() {
        if (!contaFechada) {
            saldo -= taxaManutencaoMensal;
            historicoTransacoes.add("Taxa de manutenção mensal de R$" + taxaManutencaoMensal + " aplicada.");
        } else {
            System.out.println("Conta fechada. Não é possível realizar operações.");
        }
    }

    public void exibirHistoricoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }
}
