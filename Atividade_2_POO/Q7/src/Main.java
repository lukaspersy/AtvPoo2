import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();

        if (salario <= 280) {
            double aumento = salario * 0.20;
            System.out.println("Salário R$ " + salario);
            System.out.println("Percentual de aumento aplicado: 20%");
            System.out.println("Valor do aumento: R$ " + aumento);
            System.out.println("Novo salário: R$" + (salario + aumento));

        } else if (salario > 280 && salario < 700) {
            double aumento = salario * 0.15;
            System.out.println("Salário R$ " + salario);
            System.out.println("Percentual de aumento aplicado: 15%");
            System.out.println("Valor do aumento: R$ " + aumento);
            System.out.println("Novo salário: R$" + (salario + aumento));

        } else if (salario > 700 && salario < 1500) {
            double aumento = salario * 0.10;
            System.out.println("Salário R$ " + salario);
            System.out.println("Percentual de aumento aplicado: 10%");
            System.out.println("Valor do aumento: R$ " + aumento);
            System.out.println("Novo salário: R$" + (salario + aumento));

        } else if (salario > 1500) {
            double aumento = salario * 0.05;
            System.out.println("Salário R$ " + salario);
            System.out.println("Percentual de aumento aplicado: 5%");
            System.out.println("Valor do aumento: R$ " + aumento);
            System.out.println("Novo salário: R$" + (salario + aumento));
        }
    }
}