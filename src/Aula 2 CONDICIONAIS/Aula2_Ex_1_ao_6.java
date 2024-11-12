import java.util.Scanner;

public class Aula2_Ex_1_ao_6 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 1
        System.out.println("Insira o primeiro valor:");
        double valor1 = entrada.nextDouble();

        System.out.println("Insira o segundo valor:");
        double valor2 = entrada.nextDouble();

        if (valor1 > valor2) {
            System.out.println(valor1);
        } else if (valor2 > valor1) {
            System.out.println(valor2);

        }

        // 2
        System.out.println("Insira um valor:");
        double maisOuMenos = entrada.nextDouble();

        if (maisOuMenos > 0) {
            System.out.println("Valor positivo.");
        } else if (maisOuMenos < 0) {
            System.out.println("Valor negativo.");
        }

        // 3
        System.out.println("Insira seu genero, Masculino(M) ou Feminino(F):");
        String genero = entrada.next();

        char sigla = genero.toUpperCase().charAt(0);

        if (sigla == 'M') {
            System.out.println("Masculino");
        } else if (sigla == 'F') {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }

        // 4
        System.out.println("Insira uma letra:");
        String letra = entrada.next();

        char letraChar = letra.toUpperCase().charAt(0);

        if (letraChar == 'A' || letraChar == 'E' || letraChar == 'I' || letraChar == 'O' || letraChar == 'U') {
            System.out.println("A letra é uma vogal.");
        } else if (Character.isLetter(letraChar)) {
            System.out.println("A letra é uma consoante.");
        } else {
            System.out.println("O caractere digitado não é uma letra.");
        }

        // 5
        System.out.println("Insira a primeira nota do aluno:");
        double nota1 = entrada.nextDouble();

        System.out.println("Insira a segunda nota do aluno:");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10.0) {
            System.out.println("Aprovado com Mérito");
        } else if (media > 7.0 && media < 10.0) {
            System.out.println("Aprovado");
        } else if (media < 7.0) {
            System.out.println("Reprovado");
        }

        // 6
        System.out.println("Insira o primeiro numero:");
        int numero1 = entrada.nextInt();

        System.out.println("Insira o segundo numero:");
        int numero2 = entrada.nextInt();

        System.out.println("Insira o terceiro numero:");
        int numero3 = entrada.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2);
        }else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3);
        }
    }  
}