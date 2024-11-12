import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Aula1_Ex_24_ao_30 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 24
        System.out.println("Insira o primeiro valor:");
        double valor1 = entrada.nextDouble();
        
        System.out.println("Insira o segundo valor:");
        double valor2 = entrada.nextDouble();

        double soma = valor1 + valor2;
        double sub = valor1 - valor2;
        double mult = valor1 * valor2;
        double div = valor1 / valor2;
        
        System.out.println("Resultados:" + "\n" + "Soma: " + soma + "\n" + "Subtração: " + sub + "\n" + "Multiplicação: " + mult + "\n" + "Divisão: " + div);

        // 25
        //O produto do dobro do primeiro com metade do segundo.
        //b. A soma do triplo do primeiro com o terceiro.
        //c. O terceiro elevado ao cubo.
        System.out.println("Insira o primeiro valor inteiro:");
        double valor3 = entrada.nextDouble();
        
        System.out.println("Insira o segundo valor inteiro:");
        double valor4 = entrada.nextDouble();

        System.out.println("Insira o segundo valor inteiro:");
        double valor5 = entrada.nextDouble();

        double dobroMetade =  (valor3 * 2) + (valor4 / 2);
        double somaTriplo = (valor3 * 3) + valor5;
        double terceiroCubo = Math.pow(valor5, 3);

        System.out.println("Resultados:" + "\n" + "A: " + dobroMetade + "\n" + "B: " + somaTriplo + "\n" + "C: " + terceiroCubo);

        // 26
        System.out.println("Insira a variavel A:");
        double A = entrada.nextDouble();
        
        System.out.println("Insira a variavel B:");
        double B = entrada.nextDouble();

        double C = B;
        B = A;
        A = C;

        System.out.println("Valor A: " + A + "\n" + "Balor B: " + B);

        // 27
        System.out.println("Quantos dólares você tem:");
        double saldo = entrada.nextDouble();

        System.out.println("Qual a cotação atual do dolar?");
        double cotação = entrada.nextDouble();

        double converter = saldo * cotação;
        BigDecimal bd = new BigDecimal(converter).setScale(2, RoundingMode.HALF_UP); 
        System.out.println("Seu saldo em reais é: \n" + "R$ " + bd);

        // 28
        System.out.println("Insina o valor do deposito:");
        double deposito = entrada.nextDouble();

        double taxaCalc = deposito + (deposito *0.5 / 100);
        System.out.println("Seu deposito rendeu e o valor atual nesse 1 mês é de: \n" + taxaCalc);

        // 29
        System.out.println("Insira o nome do produto:");
        String nome = entrada.next();

        System.out.println("Insira o valor do produto:");
        double preço = entrada.nextDouble();

        double prestação5x = preço / 5;

        System.out.println("Você comprou o produto: " + nome + "\n" + "No valor de: " + preço + "\n" + "com o parcelamento em 5x o valor a ser pago mensalmente é de: " + prestação5x);

        // 30
        System.out.println("Insira seu nome:");
        String vendedor = entrada.next();

        System.out.println("Insira seu salário fixo:");
        double salario = entrada.nextDouble();

        System.out.println("Insira o valor em R$ equivalente as suas vendas esse mês:");
        double comiss = entrada.nextDouble();

        double calcularComiss = (comiss * 15) / 100;
        double salarioFinal = salario + calcularComiss;

        System.out.println("Querido colaborador: " + vendedor + "\n" + "Seu salário fixo é de: " + salario + "\n" + "Salário + comissão: " + salarioFinal);
    }
}