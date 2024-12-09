import java.util.Locale;
import java.util.Scanner;

import entities_2.Estudante;

public class ExercicioPensionato {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        Estudante[] quartosAlugados = new Estudante[10];
        
        System.out.println("Quantos quartos vão ser alugados?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Nome do estudante:");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println();
            System.out.println("Email do estudante:");
            String email = sc.nextLine();

            System.out.println();
            System.out.println("Em qual quarto você deseja ficar?");
            int quarto = sc.nextInt();

            quartosAlugados[quarto] = new Estudante(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < quartosAlugados.length; i++) {
            if(quartosAlugados[i] != null) {
                System.out.println(i + ": " + quartosAlugados[i].getData());
            }
        }

        sc.close();
    }
}
