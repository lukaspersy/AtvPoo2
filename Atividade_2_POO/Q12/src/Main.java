import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do atleta: ");
        String nomeAtleta = scanner.nextLine();

        ArrayList<Double> saltos = new ArrayList<Double>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a distância do " + getOrdinal(i) + " salto: ");
            double distancia = scanner.nextDouble();
            saltos.add(distancia);
        }

        double melhorSalto = saltos.get(0);
        double piorSalto = saltos.get(0);
        double somaSaltos = 0;

        for (double salto : saltos) {
            if (salto > melhorSalto) {
                melhorSalto = salto;
            }
            if (salto < piorSalto) {
                piorSalto = salto;
            }
            somaSaltos += salto;
        }

        double mediaSaltos = (somaSaltos - melhorSalto - piorSalto) / 3;

        System.out.println("\nResultado:");
        System.out.println("Atleta: " + nomeAtleta);
        for (int i = 0; i < 5; i++) {
            System.out.println(getOrdinal(i + 1) + " Salto: " + saltos.get(i) + " m");
        }
        System.out.println("\nMelhor salto: " + melhorSalto + " m");
        System.out.println("Pior salto: " + piorSalto + " m");
        System.out.println("Média dos demais saltos: " + mediaSaltos + " m");
        System.out.println("\nResultado final:");
        System.out.println(nomeAtleta + ": " + mediaSaltos + " m");

        scanner.close();
    }

    public static String getOrdinal(int number) {
        int remainder = number % 10;
        if (remainder == 1 && number != 11) {
            return number + "st";
        } else if (remainder == 2 && number != 12) {
            return number + "nd";
        } else if (remainder == 3 && number != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }
}
