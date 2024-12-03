import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int inteiro = entrada.nextInt();

        for (int i = 1; i <= inteiro; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
