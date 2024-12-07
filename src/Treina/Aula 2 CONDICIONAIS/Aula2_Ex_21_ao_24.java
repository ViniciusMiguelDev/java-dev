import java.util.Scanner;

public class Aula2_Ex_21_ao_24 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 21
        System.out.println("Insira o valor que deseja sacar (de 10 a 600 reais): ");
        int saque = entrada.nextInt();

        int saqueTemp = saque;
        String nota1 = "";
        String nota5 = "";
        String nota10 = "";
        String nota50 = "";
        String nota100 = "";

        if (saque > 100) {
            int div100 = saque / 100;
            saqueTemp = saque - (div100 * 100);
            if (div100 > 1) {
                nota100 = div100 + " Notas de 100 Reais";
            } else {
                nota100 = div100 + " Nota de 100 Reais";
            }
        }
        if (saqueTemp >= 50) {
            int div50 = saqueTemp / 50;
            saqueTemp = saqueTemp - (div50 * 50);
            if (div50 > 1) {
                nota50 = div50 + " Notas de 50 Reais";
            } else {
                nota50 = div50 + " Nota de 50 Reais";
            }
        }
        if (saqueTemp >= 10) {
            int div10 = saqueTemp / 10;
            saqueTemp = saqueTemp - (div10 * 10);
            if (div10 > 1) {
                nota10 = div10 + " Notas de 10 Reais";
            } else {
                nota10 = div10 + " Nota de 10 Reais";
            }
        }
        if (saqueTemp >= 5) {
            int div5 = saqueTemp / 5;
            saqueTemp = saqueTemp - (div5 * 5);
            if (div5 > 1) {
                nota5 = div5 + " Notas de 5 Reais";
            } else {
                nota5 = nota5 + div5 + " Nota de 5 Reais";
            }
        }
        if (saqueTemp >= 1) {
            int div1 = saqueTemp / 1;
            saqueTemp = saqueTemp - (div1 * 1);
            if (div1 > 1) {
                nota1 = div1 + " Notas de 1 Real";
            } else {
                nota1 = nota1 + div1 + " Nota de 1 Real";
            }
        }

        String frase = "Você receberá:" + "\n" + nota100 + "\n" + nota50 + "\n" + nota10 + "\n" + nota5 + "\n" + nota1;
        System.out.println(frase);

        // 22
        System.out.println("Insira um número inteiro:");
        int valorPoI = entrada.nextInt();

        int resto = valorPoI % 2;

        if (resto == 0) {
            System.out.println("O número é par!");
        } else if (resto != 0) {
            System.out.println("O número é impar!");
        } else {
            System.out.println("Valor inválido!!!!");
        }

        // 23
        System.out.println("Qual operação de 2 numeros você deseja fazer? (soma, subtração, multiplicação ou divisão)");
        String opera = entrada.nextLine().toUpperCase();

        if (opera.isEmpty()) {
            opera = entrada.nextLine().toUpperCase();
        }

        System.out.println("Insira o primeiro número:");
        double valor1 = entrada.nextDouble();

        System.out.println("Insira o segundo número:");
        double valor2 = entrada.nextDouble();

        double result = 0;

        if (opera.equals("SOMA") ) {
            result = valor1 + valor2;
        } else if (opera.equals("SUBTRAÇÃO") || opera.equals("SUBTRACAO")) {
            result = valor1 - valor2;
        } else if (opera.equals("MULTIPLICAÇÃO") || opera.equals("MULTIPLICACAO") ) {
            result = valor1 * valor2;
        } else if (opera.equals("DIVISÃO" ) || opera.equals("DIVISAO"))  {
            result = valor1 / valor2;
        }

        System.out.println("O resultado da " + opera + " é:" + "\n" + result + "\n" + "E o número é: ");

        double resultPoI = result % 2;
        if (resultPoI == 0) {
            System.out.println("O número é par!");
        } else if (resultPoI != 0) {
            System.out.println("O número é impar!");
        } else {
            System.out.println("Valor inválido!!!!");
        }

        // 24 
        System.out.println("Telefonou para a vítima?");
        String resp1 = entrada.next().toUpperCase();

        System.out.println("Esteve no local do crime?");
        String resp2 = entrada.next().toUpperCase();

        System.out.println("Mora perto da vítima?");
        String resp3 = entrada.next().toUpperCase();

        System.out.println("Devia para a vítima?");
        String resp4 = entrada.next().toUpperCase();

        System.out.println("Já trabalhou com a vítima?");
        String resp5 = entrada.next().toUpperCase();

        int contagem = 0;

        if (resp1.equals("SIM")) {
            contagem = contagem +1;
        }
        if (resp2.equals("SIM")) {
            contagem = contagem +1;
        }
        if (resp3.equals("SIM")) {
            contagem = contagem +1;
        }
        if (resp4.equals("SIM")) {
            contagem = contagem +1;
        }
        if (resp5.equals("SIM")) {
            contagem = contagem +1;
        }

        if (contagem == 5) {
            System.out.println("Assassino!");
        } else if (contagem == 4 || contagem == 3) {
            System.out.println("Cúmplice!");
        } else if (contagem == 2) {
            System.out.println("Suspeito!");
        } else {
            System.out.println("Inocente!");
        }

        entrada.close();
    }
}