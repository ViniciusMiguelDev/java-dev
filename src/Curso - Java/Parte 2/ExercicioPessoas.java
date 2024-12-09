import java.util.Locale;
import java.util.Scanner;

import entities_2.Pessoa;

public class ExercicioPessoas {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serão digitadas?");
        int quantasPessoas = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoa = new Pessoa[quantasPessoas];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            float altura = sc.nextFloat();

            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        float somaAltura = 0;

        for(int i = 0; i < pessoa.length; i++) {
            somaAltura += pessoa[i].getAltura();
        }

        int menor16 = 0;

        for(int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getIdade() < 16) {
                menor16++;
            }
        }
        String[] menor16Name = new String[menor16];

        int j = 0;
        for(int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getIdade() < 16) {
                menor16Name[j] = pessoa[i].getName();
                j++;
            }
        }

        double formula = (100 / pessoa.length) * menor16;

        String stringMenor16 = "Pessoas com menos de 16 anos: " + formula + "%";

        System.out.println("Altura média: " + String.format("%.2f", (somaAltura / pessoa.length)));
        System.out.println(stringMenor16);
        System.out.println("Nome das pessoas com menos de 16 anos: ");
        for (int i = 0; i < menor16Name.length; i++) {
            System.out.println(menor16Name[i]);
        }

        sc.close();
    }
}
