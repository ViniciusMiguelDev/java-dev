import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Scanner 
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println((i)+ " " + (i * i) + " " + (i * i * i));
        }

        entrada.close();
    }
}
