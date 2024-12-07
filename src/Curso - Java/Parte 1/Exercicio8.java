import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        entrada.close();
    }
}
