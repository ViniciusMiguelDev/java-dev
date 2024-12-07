import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int inteiro;
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            inteiro = entrada.nextInt();

            if (inteiro >= 10 && inteiro <= 20) {
                in++;
            } else if (inteiro < 10 || inteiro > 20) {
                out++;
            }
        }

        System.out.println(in + " In" + "\n" + out + " Out");

        entrada.close();
    }
}
