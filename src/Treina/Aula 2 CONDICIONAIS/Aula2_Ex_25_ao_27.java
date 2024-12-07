import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Aula2_Ex_25_ao_27 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 25
        System.out.println("Insira o combustível vendido A (Álcool) e G (Gasolina):");
        String combu = entrada.next().toUpperCase();

        System.out.println("Insira a quantidade de litros vendidos:");
        double litros = entrada.nextDouble();

        int desconto = 0;

        if (combu.equals("A") || combu.equals("ÁLCOOL") || combu.equals("ALCOOL")) {
            if (litros <= 20) {
                desconto = 3;
            } else if (litros > 20) {
                desconto = 5;
            }

            double alcPr = litros * 1.90;
            BigDecimal alcoCDesc = new BigDecimal(alcPr - (alcPr * desconto / 100)).setScale(2, RoundingMode.HALF_UP);
            System.out.println(
                    "Valor a ser pago pelos:" + "\n" + litros + " Litros de Álcool é: " + alcoCDesc + " Reais");

        } else if (combu.equals("G") || combu.equals("GASOLINA")) {
            if (litros <= 20) {
                desconto = 4;
            } else if (litros > 20) {
                desconto = 6;
            }

            double gasoPr = litros * 2.50;
            BigDecimal gasoCDesc = new BigDecimal(gasoPr - (gasoPr * desconto / 100)).setScale(2, RoundingMode.HALF_UP);
            System.out.println(
                    "Valor a ser pago pelos:" + "\n" + litros + " Litros de Gasolina é: " + gasoCDesc + " Reais");
        }

        // 26
        System.out.println("Quantos kg de morangos você gostaria de comprar?");
        double kgMor = entrada.nextDouble();

        System.out.println("Quantos kg de manga você gostaria de comprar?");
        double kgMang = entrada.nextDouble();

        double precMor = 0;
        double precMang = 0;

        if (kgMor <= 5) {
            precMor = kgMor * 2.5;
        } else if (kgMor > 5) {
            precMor = kgMor * 2.20;
        }

        if (kgMang <= 5) {
            precMang = kgMang * 1.8;
        } else if (kgMang > 5) {
            precMang = kgMang * 1.5;
        }

        BigDecimal precoFrutFinal = new BigDecimal((precMang + precMor)).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Você deverá pagar: " + precoFrutFinal + " Reais.");

        // 27
        System.out.println("Qual carne você deseja comprar? Filé Duplo (F), Alcatra (A), Picanha (P)");
        String carne = entrada.next();
        char carneChar = carne.toUpperCase().charAt(0);

        System.out.println("Quantos kg você deseja comprar?");
        double kgCarne = entrada.nextDouble();

        System.out.println("Pagamento será no cartão tabajara?");
        String cart = entrada.next().toUpperCase();
        char cartChar = cart.toUpperCase().charAt(0);

        boolean cartBoolean;
        double precoPagar = 0;
        String formaPag = "Cartão Tabajara";

        if (cart == "SIM" || cartChar == 'S') {
            cartBoolean = true;
        } else {
            cartBoolean = false;
        }

        if (cartBoolean != true) {
            System.out.println("Qual forma de pagamento?");
            formaPag = entrada.next();
        }

        if (carneChar == 'F') {
            if (kgCarne <= 5) {
                precoPagar = kgCarne * 4.90;
            } else {
                precoPagar = kgCarne * 5.80;
            }
        } else if (carneChar == 'A') {
            if (kgCarne <= 5) {
                precoPagar = kgCarne * 5.90;
            } else {
                precoPagar = kgCarne * 6.80;
            }
        } else if (carneChar == 'P') {
            if (kgCarne <= 5) {
                precoPagar = kgCarne * 6.90;
            } else {
                precoPagar = kgCarne * 7.80;
            }
        }
        double descontCard = 0;
        double precoPagarDesc = precoPagar;
        if (cartBoolean) {
            descontCard = precoPagar * 5 /100;
            precoPagarDesc = precoPagar - (descontCard);
        }

        System.out.println("Tipo de carne: " + carne + "\n" + "Quantidade de carne comprada: " + kgCarne + " KG" + "\n" + "Preço total: R$" + precoPagar + "\n" + "Tipo de pagamento: " + formaPag + "\n" + "Valor do desconto: " + descontCard + " Reais" + "\n" + "Valor a pagar: R$" + precoPagarDesc);

        entrada.close();

    }
}
