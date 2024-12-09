import java.util.Scanner;

public class ExercicioMaior {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Variavies
        double maior = 0;
        int n, indice = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indice = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("POSICAO DO MAIOR VALOR: " + indice);

        sc.close();
    }
}
