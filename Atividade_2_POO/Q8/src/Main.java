import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: R$ ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horaMes = sc.nextInt();

        double bruto = valorHora * horaMes;

//        Descontos
        double sindicato = bruto * 0.03;
        double inss = bruto * 0.10;

        if (bruto < 900) {
            System.out.println("Salário bruto: R$" + bruto);
            System.out.println("IR: Isento");
            System.out.println("INSS: R$" + inss);
            System.out.println("Sindicato: R$" + sindicato);
            System.out.println("FGTS: R$" + (bruto * 0.11));
            System.out.println("Total de descontos: R$ " + (sindicato + inss));
            double liquido = bruto - (inss + sindicato);
            System.out.println("Salário líquido: R$ " + liquido);

        } else if (bruto > 900 && bruto <= 1500) {
            double ir = bruto * 0.05;
            System.out.println("Salário bruto: R$" + bruto);
            System.out.println("IR R$:" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("Sindicato: R$" + sindicato);
            System.out.println("FGTS: R$" + (bruto * 0.11));
            System.out.println("Total de descontos: R$ " + (sindicato + inss + ir));
            double liquido = bruto - (inss + sindicato + ir);
            System.out.println("Salário líquido: R$ " + liquido);

        } else if (bruto > 1500 && bruto <= 2500) {
            double ir = bruto * 0.10;
            System.out.println("Salário bruto: R$" + bruto);
            System.out.println("IR R$:" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("Sindicato: R$" + sindicato);
            System.out.println("FGTS: R$" + (bruto * 0.11));
            System.out.println("Total de descontos: R$ " + (sindicato + inss + ir));
            double liquido = bruto - (inss + sindicato + ir);
            System.out.println("Salário líquido: R$ " + liquido);

        } else if (bruto > 2500) {
            double ir = bruto * 0.20;
            System.out.println("Salário bruto: R$" + bruto);
            System.out.println("IR R$:" + ir);
            System.out.println("INSS: R$" + inss);
            System.out.println("Sindicato: R$" + sindicato);
            System.out.println("FGTS: R$" + (bruto * 0.11));
            System.out.println("Total de descontos: R$ " + (sindicato + inss + ir));
            double liquido = bruto - (inss + sindicato + ir);
            System.out.println("Salário líquido: R$ " + liquido);
        }
    }
}