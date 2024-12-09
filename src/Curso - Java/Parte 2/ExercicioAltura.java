import java.util.Locale;
import java.util.Scanner;

import entities_2.AlturaGenero;

public class ExercicioAltura {
    public static void main(String[] args) {
        // Locale
        Locale.setDefault(Locale.US);

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Variaveis
        int n, iMulheres = 0, nHomens = 0;
        double menor = 10, maior = 0, mediaM,soma = 0;

        System.out.println("Quantas pessoas serao digitadas?");
        n = sc.nextInt();

        AlturaGenero[] pessoa = new AlturaGenero[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + "a pessoa:");
            double altura = sc.nextDouble();
            sc.nextLine();
            char genero = sc.nextLine().toUpperCase().charAt(0);
            pessoa[i] = new AlturaGenero(altura, genero);
        }

        for (int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getAltura() < menor) {
                menor = pessoa[i].getAltura();
            }
        }

        for (int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getAltura() > maior) {
                maior = pessoa[i].getAltura();
            }
        }

        System.out.println("Menor altura = " + String.format("%.2f", menor));
        System.out.println("Maior altura = " + String.format("%.2f", maior));

        for (int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getGenero() == 'F') {
                soma += pessoa[i].getAltura();
                iMulheres++;
            }
        }

        mediaM = soma / iMulheres;

        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaM));

        for (int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getGenero() == 'M') {
                nHomens++;
            }
        }

        System.out.println("Numero de homens = " + nHomens);

        sc.close();
    }
}
