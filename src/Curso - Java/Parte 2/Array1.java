import java.util.Locale;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //
        Locale.setDefault(Locale.US);

        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tamnho do Array:");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double maior = 0;
        double menor = 999999;
        double media = 0;

        for(int i = 0; i < n; i++) {
            System.out.println("Insira o valor de indice " + (i + 1) + " do array:");
            vect[i] = sc.nextDouble();
        }

        for(int i = 0; i < vect.length; i++) {
            
            if(vect[i] > maior) {
                maior = vect[i];
            }
        }

        for(int i = 0; i < vect.length; i++) {
            
            if(vect[i] < menor) {
                menor = vect[i];
            }
        }

        for(int i = 0; i < vect.length; i++) {
            
            media += vect[i];
        }
        

        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.println("A media dos numeros é: " + String.format("%.2f" , (media / n)));


        sc.close();
    }
}
