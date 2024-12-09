import java.util.Scanner;

public class ExercicioPares {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Variaveis
        int n, numerosPares = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < numeros.length; i++) {
                if((numeros[i] % 2) == 0) {
                    numerosPares++;
                    System.out.println(numeros[i]);
                }
        }

        System.out.println("QUANTIDADE DE PARES: " + numerosPares);

        sc.close();
    }
}
