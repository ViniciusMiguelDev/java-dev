import java.util.Scanner;

public class testeFunction {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira 3 números:");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        entrada.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if(x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    } 

    public static void showResult(int value) {
        System.out.println("O maior valor é: " + value);
    }
}
