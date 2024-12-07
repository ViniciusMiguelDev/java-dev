import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int senha = 0;

        while (senha != 2002) {
            senha = entrada.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }
        }

        System.out.println("Acesso Permitido");



        entrada.close();
    }
}
