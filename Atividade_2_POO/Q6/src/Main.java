import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Em qual turno você estuda? Digite 'M' para matutino, 'V' para vespertino e 'N' para noturno: ");
        String turno = sc.next().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

    }
}