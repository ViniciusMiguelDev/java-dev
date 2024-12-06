import java.util.Scanner;
import entities.Currency;

public class ExercicioCurrency {

    public static void main(String[] args) {
        
        // Scanner
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o valor do Dollar?");
        System.out.println(Currency.doll);

        System.out.println();
        System.out.println("Quantos Dollars você deseja comprar?");
        double dollars = sc.nextDouble();

        System.err.println();
        System.out.println(Currency.Formula(dollars));


        sc.close();
    }
}