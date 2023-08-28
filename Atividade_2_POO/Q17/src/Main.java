import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePrestacoes = 0;
        double totalPagamentos = 0.0;

        while (true) {
            System.out.print("Digite o valor da prestação (ou 0 para sair): ");
            double valorPrestacao = scanner.nextDouble();

            if (valorPrestacao == 0) {
                break; // Sai do loop se o valor for 0
            }

            System.out.print("Digite o número de dias em atraso: ");
            int diasAtraso = scanner.nextInt();

            double valorTotal = valorPagamento(valorPrestacao, diasAtraso);
            System.out.println("Valor a ser pago: " + valorTotal);

            quantidadePrestacoes++;
            totalPagamentos += valorTotal;
        }

        System.out.println("\nRelatório do dia:");
        System.out.println("Quantidade de prestações pagas: " + quantidadePrestacoes);
        System.out.println("Valor total recebido: " + totalPagamentos);

        scanner.close();
    }

    public static double valorPagamento(double prestacao, int diasAtraso) {
        if (diasAtraso <= 0) {
            return prestacao; // Sem atraso, paga o valor da prestação
        }

        double multa = prestacao * 0.03;
        double juros = prestacao * (diasAtraso * 0.001);

        return prestacao + multa + juros;
    }
}
