import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int x = 9;
        int y = 9;

        while (x != 0 || y != 0) {
            x = entrada.nextInt();
            y = entrada.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } 

        }

        entrada.close();
    }
}
