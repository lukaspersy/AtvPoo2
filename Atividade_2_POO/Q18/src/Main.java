import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (S/N): ");
            String resposta = scanner.next().trim().toLowerCase();

            if (resposta.equals("s")) {
                respostasPositivas++;
            }
        }

        String classificacao = getClassificacao(respostasPositivas);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }

    public static String getClassificacao(int respostasPositivas) {
        if (respostasPositivas == 2) {
            return "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            return "Cúmplice";
        } else if (respostasPositivas == 5) {
            return "Assassino";
        } else {
            return "Inocente";
        }
    }
}
