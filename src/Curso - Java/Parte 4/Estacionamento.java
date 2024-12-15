import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Entradas
        ArrayList<Carro> list = new ArrayList<>();
        Carro carro = new Carro();
        int n = 0;
        String cor = " ";
        do {
            System.out.print("Quantos carros entrarão no estacionamento (Capacidade máxima de 10 carros): ");
            n = sc.nextInt();
            System.out.println();
        } while (n < 1 || n > 10);

        for (int i = 1; i <= n; i++) {
            do {
                System.out.println("Sabendo-se que as cores permitidas são (Preto, Branco e Cinza):");
                System.out.print("Insira a cor do #" + i + " carro: ");
                cor = sc.next().toUpperCase();
            } while (!cor.equals("PRETO") && !cor.equals("BRANCO") && !cor.equals("CINZA"));

            System.out.println();
            System.out.print("Insira a placa do #" + i + " carro: ");
            String placa = sc.next();

            System.out.println();
            System.out.print("Insira a velocidade máxima do #" + i + " carro: ");
            double vMaxima = sc.nextDouble();
            System.out.println();

            list.add(new Carro(cor, placa, vMaxima));
        }

        for (Carro carro1 : list) {
            System.out.println(carro1);
            System.out.println();
        }

        sc.close();
    }
}
