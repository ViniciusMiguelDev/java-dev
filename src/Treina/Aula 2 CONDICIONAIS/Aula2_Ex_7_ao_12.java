import java.util.ArrayList;
import java.util.Scanner;

public class Aula2_Ex_7_ao_12 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 7
        System.out.println("Insira o primeiro numero:");
        double valor1 = entrada.nextDouble();

        System.out.println("Insira o segundo numero:");
        double valor2 = entrada.nextDouble();

        System.out.println("Insira o terceiro numero:");
        double valor3 = entrada.nextDouble();

        double menor = valor1;
        double maior = valor1;

        if (valor2 > maior && valor2 > valor3) {
            maior = valor2;
        } else if (valor3 > maior && valor3 > valor2) {
            maior = valor3;
        }

        if (valor2 < menor && valor2 < valor3) {
            menor = valor2;
        } else if (valor3 < menor && valor3 < valor2) {
            menor = valor3;
        }

        System.out.println("Menor valor: " + menor + "\n" + "Maior valor: " + maior);

        // 8
        System.out.println("Insira o primeiro preço:");
        double preço1 = entrada.nextDouble();

        System.out.println("Insira o segundo preço:");
        double preço2 = entrada.nextDouble();

        System.out.println("Insira o terceiro preço:");
        double preço3 = entrada.nextDouble();

        double menorpreço = preço1;

        if (preço2 < menorpreço && preço2 < preço3) {
            menorpreço = preço2;
        } else if (preço3 < menorpreço && preço3 < preço2) {
            menorpreço = preço3;
        }

        System.out.println("Mais barato é:" + menorpreço);

        // 9
        System.out.println("Insira o primeiro numero:");
        double numero1 = entrada.nextDouble();

        System.out.println("Insira o segundo numero:");
        double numero2 = entrada.nextDouble();

        System.out.println("Insira o terceiro numero:");
        double numero3 = entrada.nextDouble();

        ArrayList<Double> numeros = new ArrayList<Double>();

        if (numero1 > numero2 && numero1 > numero3) {
            numeros.add(numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            numeros.add(numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            numeros.add(numero3);
        }

        if (numero1 > numero2 || numero1 > numero3) {
            numeros.add(numero1);
        } else if (numero2 > numero1 || numero2 > numero3) {
            numeros.add(numero2);
        } else if (numero3 > numero1 || numero3 > numero2) {
            numeros.add(numero3);
        }

        if (numero1 < numero2 && numero1 < numero3) {
            numeros.add(numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            numeros.add(numero2);
        } else if (numero3 < numero1 && numero3 < numero2) {
            numeros.add(numero3);
        }

        System.out.println("Numeros em ordem decrescente: " + numeros);

        // 10
        System.out.println("Insira o turno que você estuda Matutino(M), Vespertino(V) ou Noturno(N):");
        char turno = entrada.next().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia!");
        } else if (turno == 'V') {
            System.out.println("Boa tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor Inválido");
        }

        // 11
        System.out.println("Insira o salario do colaborador:");
        double salario = entrada.nextDouble();

        double novoSalario = 0;
        int percentual = 0;
        double aumento = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario <= 700) {
            percentual = 15;
        } else if (salario <= 1500) {
            percentual = 10;
        } else if (salario > 1500) {
            percentual = 5;
        }

        aumento =(salario * percentual / 100);
        novoSalario = salario + aumento;

        System.out.println("Salario anterior: " + salario
                + "\n" + "Novo salario é: " + novoSalario
                + "\n" + "O percentual de aumento aplicado: " + percentual
                + "\n" + "O valor do aumento: " + aumento);

        // 12
        // O Salário Líquido corresponde ao Salário Bruto menos os descontos.

        System.out.println("Quantas horas você trabalhou esse mês?");
        int horas = entrada.nextInt();
        System.out.println("Qual valor da sua hora de trabalho?");
        int valorH = entrada.nextInt();

        double salarioT = horas * valorH;

        double ir = 0;
        double inss = salarioT * 10 / 100;
        double fgts = salarioT * 11 / 100;

        if (salarioT <= 900) {
            ir = 0;
        } else if (salarioT > 900 && salarioT <= 1500) {
            ir = salarioT * 5 / 100;
        } else if (salarioT > 1500 && salarioT <= 2500) {
            ir = salarioT * 10 / 100;
        } else if (salarioT > 2500) {
            ir = salarioT * 20 / 100;
        }

        double totalDesc = ir + inss;
        double salarioLiq = salarioT - totalDesc;

        System.out.println("Salario bruto: R$ " + salarioT + "\n" + "IR: R$ " + ir + "\n" + "INSS: R$ " + inss + "\n"
                + "FGTS: R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDesc);
        System.out.println("Salário Líquido R$ " + salarioLiq);

        entrada.close();
    }
}
