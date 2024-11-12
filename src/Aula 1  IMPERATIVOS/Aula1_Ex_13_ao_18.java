import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Aula1_Ex_13_ao_18 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 13
        System.out.println("Insira a largura do retangulo:");
        double larguraRet = entrada.nextDouble();

        System.out.println("Insira a altura do retangulo:");
        double alturaRet = entrada.nextDouble();

        double areaRet = larguraRet * alturaRet;
        System.out.println("Àrea do retangulo é: " + areaRet);

        // 14
        System.out.println("Insira o comprimento da aresta do cubo:");
        double comprimentoAresta = entrada.nextDouble();

        double volumeAresta = Math.pow(comprimentoAresta, 3);
        System.out.println("O volume do cubo é: " + volumeAresta);

        // 15
        // 𝑉 = 1 / 3 × 𝜋 × 𝑟² × ℎ.
        System.out.println("Insira o raio da base do cone: ");
        double raioBase = entrada.nextDouble();

        System.out.println("Insira a altura do cone:");
        double alturaCone = entrada.nextDouble();

        double PI = 3.14;
        double volumeCone = 1.0 / 3.0 * PI * Math.pow(raioBase, 2) * alturaCone;
        System.out.println("O volume do cone é: " + volumeCone);

        // 16
        // 1 kg é equivalente a 2,20462 libras.
        System.out.println("Insira um valor em Kilogramas:");
        double kg = entrada.nextDouble();

        double converterKgToLib = kg * 2.20462;
        System.out.println("O valor em Kilogramas informado quando convertido para libras fica: " + converterKgToLib);

        // 17
        // fórmula: (72.7 * altura) - 58
        System.out.println("Informe sua altura:");
        double alturaP = entrada.nextDouble();

        double pesoIdeal = (72.7 * alturaP) - 58;
        BigDecimal pesoIdealArred = new BigDecimal(pesoIdeal).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Seu peso ideal é: " + pesoIdealArred);

        // 18
        // Para homens: (72.7*h) - 58
        // Para mulheres: (62.1*h) - 44.7

        System.out.println("Insira seu gênero, se homem (h) / mulher (m):");
        char genero = entrada.next().toUpperCase().charAt(0);

        if (genero == 'H') {
            System.out.println("Digite sua altura:");
            double alturaH = entrada.nextDouble();
            double calcH = (72.7 * alturaH) - 58;
            BigDecimal pesoIdealArredH = new BigDecimal(calcH).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Seu peso ideal é: " + pesoIdealArredH);
        } else if (genero == 'M') {
            System.out.println("Digite sua altura:");
            double alturaM = entrada.nextDouble();
            double calcM = (62.1 * alturaM) - 44.7;
            BigDecimal pesoIdealArredM = new BigDecimal(calcM).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Seu peso ideal é: " + pesoIdealArredM);
        }
    }
}
