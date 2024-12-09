import java.util.Locale;
import java.util.Scanner;

import entities_2.MaisVelho;

public class ExercicioMaisVelho {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        // Variaveis
        int quantasPessoas, idadeMaisVelho = 0, posiMaisVelho = 0;

        System.out.println("Quantas pessoas serão digitadas?");
        quantasPessoas = sc.nextInt();
        sc.nextLine();

        MaisVelho[] pessoa = new MaisVelho[quantasPessoas];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoa[i] = new MaisVelho(nome, idade);
        }

        for (int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getIdade() > idadeMaisVelho) {
                idadeMaisVelho = pessoa[i].getIdade();
                posiMaisVelho = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoa[posiMaisVelho].getNome());

        sc.close();
    }
}
