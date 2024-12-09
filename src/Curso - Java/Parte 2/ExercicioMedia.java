import java.util.Scanner;

public class ExercicioMedia {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Quantos números você deseja tirar a média?");
            n = sc.nextInt();
        } while(n < 2);

        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Digite um número:");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for(int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        System.out.print("Valores: ");
        for(int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println("\n" + "Soma: " + sum);
        System.out.println("Média: " + (sum / vect.length));


        sc.close();
    }
}
