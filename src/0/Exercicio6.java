import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            double nota1 = entrada.nextDouble();
            double nota2 = entrada.nextDouble();
            double nota3 = entrada.nextDouble();

            BigDecimal media = new BigDecimal((nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10).setScale(1, RoundingMode.HALF_UP);
            System.out.println(media);
        }

        entrada.close();
    }
}
