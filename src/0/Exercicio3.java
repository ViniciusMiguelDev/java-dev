import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        int produtos = entrada.nextInt();
        int alcool = 0;
        int gasosa = 0;
        int diesel = 0;

        while (produtos != 4) {
            
            if (produtos == 1) {
                alcool++;
            } else if (produtos == 2) {
                gasosa++;
            } else if (produtos == 3) {
                diesel++;
            }

            produtos = entrada.nextInt();
        }

            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcool + "\n" + "Gasolina: " + gasosa + "\n" + "Diesel: " + diesel);
        

        entrada.close();
    }
}
