import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Aula2_Ex_32_ao_34 {
    public static void main(String[] args) {

        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 32
        System.out.println("Digite um número inteiro de 5 dígitos:");
        String entrada1_Q32 = entrada.next().toUpperCase();

        char digito1 = entrada1_Q32.charAt(0);
        char digito2 = entrada1_Q32.charAt(1);
        char digito3 = entrada1_Q32.charAt(2);
        char digito4 = entrada1_Q32.charAt(3);
        char digito5 = entrada1_Q32.charAt(4);

        if (digito1 == digito5 && digito2 == digito4) {
            System.out.println("O número " + entrada1_Q32 + " é um palíndromo.");
        } else {
            System.out.println("O número " + entrada1_Q32 + " não é um palíndromo.");
        }

        // 33
        System.out.println("Digite o seu peso (em kg):");
        double entrada1_Q33 = entrada.nextFloat();

        System.out.println("Digite a sua altura (em metros):");
        double entrada2_Q33 = entrada.nextDouble();

        double imc = entrada1_Q33 / Math.pow(entrada2_Q33, 2);

        if (imc >= 1 && imc < 20.00) {
            System.out.println("Abaixo do Peso");
        } else if (imc >= 20.00 && imc < 25.00) {
            System.out.println("Peso Normal");
        } else if (imc >= 25.00 && imc < 30.00) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.00 && imc < 40.00) {
            System.out.println("Obeso");
        } else if (imc > 40) {
            System.out.println("Obeso Mórbido");
        } else {
            System.err.println("Valores inválidos.");
        }

        // 34
        System.out.println("Digite a sua idade:");
        int entrada1_Q34 = entrada.nextInt();

        if (entrada1_Q34 >= 1 && entrada1_Q34 < 16) {
            System.out.println("Não-eleitor");
        } else if (entrada1_Q34 >= 16 && entrada1_Q34 < 18) {
            System.out.println("Eleitor facultativo");
        } else if (entrada1_Q34 >= 18 && entrada1_Q34 < 65) {
            System.out.println("Eleitor obrigatório");
        } else if (entrada1_Q34 >= 65) {
            System.out.println("Eleitor facultativo");
        } else {
            System.err.println("Idade inválida. Digite um número inteiro positivo.");
        }

        entrada.close();
    }
}
