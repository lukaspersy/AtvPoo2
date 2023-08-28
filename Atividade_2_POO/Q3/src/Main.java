import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) /2;

        if(media < 10){
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media < 7){
            System.out.println("Reprovado");
        } else {
            System.out.println("Média inválida");

        }


    }
}