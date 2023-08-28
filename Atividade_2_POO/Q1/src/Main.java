import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.printf("O primeiro número é maior: %d\n" ,n1);

        } else {
            System.out.printf("O segundo número é maior: %d\n" ,n2);

        }
    }
}