import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Aula1_Ex_19_ao_23 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 19
        System.out.println("Insira a quantidade de peixes em kg que você pescou:");
        double pescaHoje = entrada.nextDouble();

        if (pescaHoje > 50) {
            double kgExtra = pescaHoje - 50;
            double taxa = kgExtra * 4;
            System.out.println("KG excedente: " + kgExtra + ", " + "Taxa por excedente: " + "R$"+taxa);
        } else if (pescaHoje < 50) {
            System.out.println("Peso dentro do permitido.");
        }

        // 20
        System.out.println("Quanto você recebe por hora?");
        double salarioH = entrada.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mês?");
        double horasT = entrada.nextDouble();

        double salarioBruto = salarioH * horasT;

        double inss = salarioBruto * 8 / 100;

        double sindicato = salarioBruto * 5 / 100;

        double impostoRenda = salarioBruto * 11 / 100;

        double descontos = inss + sindicato + impostoRenda;

        double salarioLiquido = salarioBruto - descontos;

        System.out.println("Valor descontado do salário: " + descontos + " Salário líquido: " + salarioLiquido);

        // 21
        System.out.println("Informe o tamanho da area(metros quadrados) a ser pintada:");
        double areaPintada = entrada.nextDouble();

        if (areaPintada <= 54) {
            double litrosNess = areaPintada / 3;
            BigDecimal litrosNessArred = new BigDecimal(litrosNess).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Você necessita de " + litrosNessArred+"L" + " para pintar a area desejada, apenas uma lata é necessária para o processo. Valor: R$80.00");
        } else if (areaPintada > 54) {
            double litrosNess = areaPintada / 3;
            BigDecimal litrosNessArred = new BigDecimal(litrosNess).setScale(2, RoundingMode.HALF_UP);
            double latasNess = Math.ceil((litrosNess / 18));
            double valorLatas = latasNess * 80;

            System.out.println("Você necessita de " + litrosNessArred+"L" + " para pintar a area desejada é necessario: " + latasNess+" Latas. Valor: R$" + valorLatas);
        }

        // 22
        System.out.println("Informe o tamanho da area a ser pintada:");
        double areaPintada2 = entrada.nextDouble();

        double litrosNess = areaPintada2 / 6;

        double lata18 = litrosNess / 18;

        double lata3_6 = litrosNess / 3.6;

        double full18 = Math.ceil(lata18);
        double valor18 = full18 * 80;
        System.out.println("Apenas latas de 18 Litros: " + full18 + " Latas. " + "Saindo no valor de: R$" + valor18);

        double full3_6 = Math.ceil(lata3_6);
        double valor3_6 = full3_6 * 25;
        System.out.println("Apenas latas de 3,6 Litros: " + full3_6 + " Latas. " + "Saindo no valor de: R$" + valor3_6);

        double litrosNessUp = litrosNess + (litrosNess * 10 / 100);
        double lata18Up = litrosNessUp / 18;

        double parte18 = Math.floor(lata18Up);
        double resto18 = parte18 * 18;
        
        double parteResto = litrosNess - resto18;
        double parte3_6 = Math.ceil((parteResto / 3.6));
        double valorMisto = (parte18 * 80) + (parte3_6 * 25);

        System.out.println("Para evitar desperdício você pode optar por: " + parte18 + " lata(s) de 18 litros" + " e " + parte3_6 + " lata(s) de 3,6 litros." + "Saindo no valor de: R$" + valorMisto);

        // 23
        //1 byte = 8 bits
        //1 Mbps (megabit por segundo) = 1 milhão de bits por segundo
        //1 MB (megabyte) = 8 megabits
        System.out.println("Tamanho do arquivo para download(em MB):");
        double tamanhoArq = entrada.nextDouble();

        System.out.println("Velocidade de download(Mbps):");
        double velocidadeDown = entrada.nextDouble();

        double MBps = velocidadeDown / 8;

        double tempoAproxMin = (tamanhoArq / MBps) / 60;
        BigDecimal tempoArred = new BigDecimal(tempoAproxMin).setScale(2, RoundingMode.UP);

        System.out.println("Seu download levará: " + tempoArred + " Minutos");

    }
}