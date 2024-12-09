import java.util.Locale;
import java.util.Scanner;

public class ExercicioNega {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        int n;

        do {
            System.out.println("Insira quantos números você deseja testar:");
            n = sc.nextInt();
        } while (n < 0 || n > 10);

        int[] numeros = new int[n];


        for(int i = 0; i < n; i++) {
            System.out.println("Insira o número de indice " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for(int i = 0; i <numeros.length; i++){
            if(numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
        

        sc.close();
    }
}
