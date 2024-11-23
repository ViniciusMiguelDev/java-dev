import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Aula1_Ex_7_ao_12 {

public static void main(String[] args) {
        // 7
        // Formula -> AreaDoQuadrado = Largura ao quadrado
        // Devolver o dobro da area
        Scanner entrada = new Scanner(System.in);

        double larguraT;
        System.out.println("Insira a largura:");
        larguraT = entrada.nextInt();

        double largura = Math.pow(larguraT, 2);

        double AQ = largura * 2;

        System.out.println("O dobro da area do quadrado é:" + " " + AQ );

    // 8
    System.out.println("Quanto você ganha por hora?");
    double salarioPH = entrada.nextDouble();
    System.out.println("Quantas horas você trabalhou esse mês?");
    double horas = entrada.nextDouble();

    double Salario = salarioPH * horas;

    System.out.println("Esse mês você recebeu" + " " + "R$"+Salario);

    // 9
    // C=5/9 . (F-32)
    System.out.println("Qual a temperatura atual em Fahrenheit?");
    double Fahrenheit = entrada.nextDouble();
    double Celsius = 5.0 / 9.0 *(Fahrenheit - 32);
    System.out.println("Sua temperatura em Celsius é:" + " " + Celsius);

    // 10
    // 𝑉 = 4 / 3 × 𝜋 × 𝑟³
    System.out.println("Informe o raio de uma esfera: ");
    double raioEntrada = entrada.nextDouble();
    double Raio = Math.pow(raioEntrada,3);
    double PI = 3.14;
    double Volume = 4.0 / 3.0 * PI * Raio;
    BigDecimal bd = new BigDecimal(Volume).setScale(2, RoundingMode.HALF_UP);

    System.out.println("O volume da esfera é: " + bd);

    // 11
    // A = base x altura / 2
    System.out.println("Insira a base do triangulo:");
    double base = entrada.nextDouble();

    System.out.println("Insira a altura do triangulo:");
    double altura = entrada.nextDouble();

    double Area = base * altura / 2;

    System.out.println("Area do triangulo: " + Area);

    // 12
    // V = PI * r ao quadrado * h
    System.out.println("Insira o raio da base do Cilindro:");
    double rBase = entrada.nextDouble();

    System.out.println("Insira a altura do Cilindro:");
    double alturaCilindro = entrada.nextDouble();

    double volumeCilindro = PI * Math.pow(rBase, 2) * alturaCilindro;
    System.out.println("O volume do cilindro é: " + volumeCilindro);

    entrada.close();
}
}
