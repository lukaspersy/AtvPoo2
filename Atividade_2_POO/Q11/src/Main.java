import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para a tabuada: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o valor inicial da tabuada: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o valor final da tabuada: ");
        int valorFinal = scanner.nextInt();

        System.out.println("Tabuada de " + numero + " entre " + valorInicial + " e " + valorFinal + ":");

        for (int i = valorInicial; i <= valorFinal; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
