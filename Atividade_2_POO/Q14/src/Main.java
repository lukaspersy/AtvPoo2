import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            imprimirLinha(i);
            System.out.println(); // Pula para a próxima linha
        }

        scanner.close();
    }

    public static void imprimirLinha(int valor) {
        for (int i = 1; i <= valor; i++) {
            System.out.print(valor + "   ");
        }
    }
}
