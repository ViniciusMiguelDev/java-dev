import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        double x;
        double y;

        for (int i = 0; i < n; i++) {
            x = entrada.nextDouble();
            y = entrada.nextDouble();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(x / y);
            }
        }

        

        entrada.close();
    }
}
