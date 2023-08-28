import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}