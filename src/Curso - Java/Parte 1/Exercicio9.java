import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
