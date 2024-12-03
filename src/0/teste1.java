import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int soma = 0;

        for(int i = 0; i < n; i++) {
            int x = entrada.nextInt();
            soma += x;
        }

        System.out.println(soma);

        entrada.close();
    }
}
