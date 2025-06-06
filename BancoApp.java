package banco;

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DE CONTA BANCÁRIA ===");
        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        String numeroConta = sc.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, numeroConta, saldoInicial);
        System.out.println("Conta bancária criada com sucesso.\n");

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Informe o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.exibirSaldo();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}