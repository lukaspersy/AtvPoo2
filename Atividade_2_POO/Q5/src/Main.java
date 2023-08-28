import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.printf("O primeiro número é o maior: %d\n", n1);
        } else if (n2 > n3 && n2 > n1) {
            System.out.printf("O segundo número é o maior: %d\n", n2);
        } else if (n3 > n2 && n3 > n1) {
            System.out.printf("O segundo número é o maior: %d\n", n3);

        } if (n1 < n2 && n1 < n3) {
            System.out.printf("e o menor número é o primeiro: %d\n", n1);
        } else if (n2 < n3 && n2 < n1) {
            System.out.printf("e o menor número é o segundo: %d\n", n2);
        } else if (n3 < n2 && n3 < n1) {
            System.out.printf("e o menor número é o terceiro: %d\n", n3);

        }
    }
}
