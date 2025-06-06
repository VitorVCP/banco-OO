package banco;

public class ContaBancaria {
    private String nome;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nome, String numeroConta, double saldoInicial) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
    }

    public void sacar(double valor) {
        if (valor > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
    }
}
