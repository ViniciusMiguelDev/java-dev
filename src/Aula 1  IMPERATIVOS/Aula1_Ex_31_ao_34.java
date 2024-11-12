import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Aula1_Ex_31_ao_34 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner (System.in);

        // 31
        System.out.println("Insira sua idade em anos, meses e dias (separados por espaço):");
        String idadeFull = entrada.nextLine();

        String[] partesIdade = idadeFull.split(" ");

        int anos = Integer.parseInt(partesIdade[0]);
        int meses = Integer.parseInt(partesIdade[1]);
        int dias = Integer.parseInt(partesIdade[2]);

        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Sua idade em dias é: " + totalDias);

        // 32
        System.out.println("Insira o preço de custo do produto:");
        double custo = entrada.nextDouble();

        System.out.println("Insira o valor da porcetagem do acrescimo no valor do produto:");
        double porcetagem = entrada.nextDouble();

        double acrescimo = custo + (custo * porcetagem / 100);
        BigDecimal bdAcrescimo = new BigDecimal(acrescimo).setScale(2, RoundingMode.HALF_UP);

        System.out.println("O valor de venda do produto é: R$" + bdAcrescimo);

        // 33
        System.out.println("Insira o preço do carro:");
        double precoCarro = entrada.nextDouble();

        double carroPrecoFinal = precoCarro + (precoCarro * 28 / 100) + (precoCarro * 45 / 100);

        System.out.println("O preço final do carro é: R$" + carroPrecoFinal);

        // 34
        System.out.println("Insira um valor inteiro menor que 1000:");
        int inteiro = entrada.nextInt();
        
        String toString = Integer.toString(inteiro);

        char centena = toString.charAt(0);
        char dezena = toString.charAt(1);
        char unidade = toString.charAt(2);

        System.out.println("Centena: " + centena + "\n" + "Dezena: " + dezena + "\n" + "Unidade: " + unidade);
    }
}
