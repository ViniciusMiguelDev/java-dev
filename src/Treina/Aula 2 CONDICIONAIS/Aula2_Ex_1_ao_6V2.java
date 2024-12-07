import java.util.Scanner;

public class Aula2_Ex_1_ao_6V2 {
    public static void main(String[] args) {
        // Scanner 
        Scanner sc = new Scanner(System.in);

        // 1
        System.out.println("Insira dois números:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        String comparacao = 
        numero1 > numero2 ? "O número maior é: " + numero1 
        : "O número maior é: " + numero2;

        System.out.println(comparacao);

        sc.close();
    }
}
