import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double resultado = somarTresNumeros(num1, num2, num3);
        System.out.println("A soma dos três números é: " + resultado);

        scanner.close();
    }

    public static double somarTresNumeros(double a, double b, double c) {
        return a + b + c;
    }
}
