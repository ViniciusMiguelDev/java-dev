import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetores {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }


        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorA[i] + vetorB[i]);
        }

        sc.close();
    }
}
