import java.util.ArrayList;
import java.util.Scanner;

public class Aula2_Ex_13_ao_16 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 13
        System.out.println("Insira o dia da semana (1-Domingo, 2- Segunda, etc.): ");
        int diaDaSemana = entrada.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.err.println("Número inválido!");
                break;
        }

        // 14
        System.out.println("Insira a primeira nota do aluno:");
        double nota1 = entrada.nextDouble();

        System.out.println("Insira a segunda nota do aluno:");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 10.0 || media < 0) {
            System.err.println("Nota invalida");
        }
        else if (media >= 9 && media <= 10) {
            System.out.println("Nota A - Aprovado");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Nota B - Aprovado");
        }else if (media >= 6 && media < 7.5) {
            System.out.println("Nota C - Aprovado");
        }else if (media >= 4 && media < 6) {
            System.out.println("Nota D - Reprovado");
        }else if (media < 4) {
            System.out.println("Nota E - Reprovado");
        }

        // 15
        System.out.println("Insira 3 lados de um triângulo: ");
        String entradaLados = entrada.nextLine();

        if (entradaLados.isEmpty()) {
            entradaLados = entrada.nextLine();
        }

        String[] lados = entradaLados.split(" ");

        if (lados.length != 3) {
            System.out.println("Insira 3 números");
        }
        
        double lado1 = Double.parseDouble(lados[0]);
        double lado2 = Double.parseDouble(lados[1]);
        double lado3 = Double.parseDouble(lados[2]);

        boolean equi = lado1 == lado2 && lado1 == lado3;
        boolean iso = lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2;
        boolean esc = lado1 != lado2 && lado1 != lado3;

            if (equi) {
                System.out.println("Triângulo Equilátero");
            } if (esc) {
                System.out.println("Triângulo Escaleno");
            } if (iso) {
                System.out.println("Triângulo Isósceles");
            }

        // 16
        System.out.println("Insira o valor de A, B, C:");
        String valoresBhask = entrada.nextLine();

        String[] arrayVari = valoresBhask.split(" ");
        
        int A = Integer.parseInt(arrayVari[0]);
        int B = Integer.parseInt(arrayVari[1]);
        int C = Integer.parseInt(arrayVari[2]);
        
            if(A == 0) {
                System.out.println("A = 0 (Valor inválido)");
            }

        double delta = Math.pow(B, 2) - (4 * A * C);

            if (delta < 0) {
                System.out.println("Delta negativo (não possui raízes reais)");
            }

            if (delta == 0) {
                double x = (-B + delta) / (2 * A);
                System.out.println(x);
            }

        double x1 = (-B + delta) / (2 * A);
        double x2 = (-B - delta) / (2 * A);

        System.out.println("X1 = " + x1 + "\n" + "X2 = " + x2);

        entrada.close();
    }
}
