import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Aula2_Ex_17_ao_20 {
    public static void main(String[] args) {

        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 17
        System.out.println("Insira um ano:");
        int ano = entrada.nextInt();

        if (ano < 0) {
            System.out.println("Ano inválido!");
        }

        boolean formularBiss = (ano % 4) == 0;

        if (formularBiss) {
            System.out.println("Ano Bissexto.");
        } else {
            System.out.println("Não é ano Bissexto");
        }

        // 18
        System.out.println("Insira uma data no formato dd/mm/aaaa:");
        String dataEntr = entrada.nextLine();

        if (dataEntr.isEmpty()) {
            dataEntr = entrada.nextLine();
        }

        String[] data = dataEntr.split("/");

        int dd = Integer.parseInt(data[0]);
        int mm = Integer.parseInt(data[1]);
        int aaaa = Integer.parseInt(data[2]);

        if (aaaa < 1) {
            System.out.println("Ano inválido!");
        } else if (mm < 1 || mm > 12) {
            System.out.println("Mês inválido!");
        } else if (mm == 02 && !formularBiss && dd < 1 || dd >= 29) {
            System.out.println("Dia inválido");
        } else if (dd < 1 || dd > 31) {
            System.out.println("Dia inválido");
        } else {
            System.out.println("Data Válida!");
        }

        // 19 (versão 1)
        // valor / 100 = primeiro digito
        // (valor / 10) % 10 = segundo digito
        // valor % 10 = terceiro digito
        System.out.println("Insira um número inteiro menor que 1000: ");
        String inteiro = entrada.next();
        int inteiroInt = Integer.parseInt(inteiro);

        int primeiroDigitoInt;
        int segundoDigitoInt;
        int terceiroDigitoInt;

        char primeiroDigito;
        char segundoDigito;
        char terceiroDigito;

        String frase1 = "";
        String frase2 = "";
        String frase3 = "";

        if (inteiroInt > 1000 || inteiroInt < 0) {
            System.out.println("Insira um numero menor que 1000 e maior ou igual a 0");
        }

        if (inteiroInt >= 100) {
            terceiroDigito = inteiro.charAt(2);
            segundoDigito = inteiro.charAt(1);
            primeiroDigito = inteiro.charAt(0);

            String terceiroDigitoS = Character.toString(terceiroDigito);
            String segundoDigitoS = Character.toString(segundoDigito);
            String primeiroDigitoS = Character.toString(primeiroDigito);

            terceiroDigitoInt = Integer.parseInt(terceiroDigitoS);
            segundoDigitoInt = Integer.parseInt(segundoDigitoS);
            primeiroDigitoInt = Integer.parseInt(primeiroDigitoS);

            if (primeiroDigitoInt == 1) {
                frase1 = "1 Centena";
            } else if (primeiroDigitoInt > 1) {
                frase1 = primeiroDigitoInt + " Centenas";
            }

            if (segundoDigitoInt == 1) {
                frase2 = "1 Dezena";
            } else if (segundoDigitoInt > 1) {
                frase2 = segundoDigitoInt + " Dezenas";
            }

            if (terceiroDigitoInt == 1) {
                frase3 = "1 Unidade";
            } else if (terceiroDigitoInt > 1) {
                frase3 = terceiroDigitoInt + " Unidades";
            }
        } else if (inteiroInt < 100 && inteiroInt >= 10) {
            segundoDigito = inteiro.charAt(1);
            primeiroDigito = inteiro.charAt(0);

            String segundoDigitoS = Character.toString(segundoDigito);
            String primeiroDigitoS = Character.toString(primeiroDigito);

            segundoDigitoInt = Integer.parseInt(segundoDigitoS);
            primeiroDigitoInt = Integer.parseInt(primeiroDigitoS);

            if (primeiroDigitoInt == 1) {
                frase1 = "1 Dezena";
            } else if (primeiroDigitoInt > 1) {
                frase1 = primeiroDigitoInt + " Dezenas";
            }

            if (segundoDigitoInt == 1) {
                frase2 = "1 Unidade";
            } else if (segundoDigitoInt > 1) {
                frase2 = segundoDigitoInt + " Unidades";
            }
        } else if (inteiroInt < 10) {
            primeiroDigito = inteiro.charAt(0);

            String primeiroDigitoS = Character.toString(primeiroDigito);

            primeiroDigitoInt = Integer.parseInt(primeiroDigitoS);

            if (primeiroDigitoInt == 1) {
                frase1 = "1 Unidade";
            } else if (primeiroDigitoInt > 1) {
                frase1 = primeiroDigitoInt + " Unidades";
            }
        }

        System.out.println("Numero escolhido: " + inteiroInt + "\n" + frase1 + "\n" + frase2 + "\n" + frase3);

        // 19 (versão 2)
        // valor / 100 = primeiro digito
        // (valor / 10) % 10 = segundo digito
        // valor % 10 = terceiro digito

        System.out.println("Insira um número inteiro menor que 1000: ");
        int inteirov2 = entrada.nextInt();

        int cent = inteirov2 / 100;
        int dez = (inteirov2 / 10) % 10;
        int unid = inteirov2 % 10;

        String fraseCent = "";
        String fraseDez = "";
        String fraseUnid = "";

        if (inteirov2 <= 0) {
            System.out.println("Numero Inválido!");
        }

        if (cent == 1) {
            fraseCent = "1 Centena";
        } else if (cent > 1 && cent <= 9) {
            fraseCent = cent + " Centenas";
        } else if (cent == 0) {
            fraseCent = "";
        }

        if (dez == 1) {
            fraseDez = "1 Dezena";
        } else if (dez > 1 && dez <= 9) {
            fraseDez = dez + " Dezenas";
        } else if (dez == 0) {
            fraseDez = "";
        }

        if (unid == 1) {
            fraseUnid = "1 Unidade";
        } else if (unid > 1 && unid <= 9) {
            fraseUnid = unid + " Unidades";
        } else if (unid == 0) {
            fraseUnid = "";
        }

        System.out.println("Numero escolhido: " + inteirov2 + "\n" + fraseCent + "\n" + fraseDez + "\n" + fraseUnid);

        // 20
        System.out.println("Insira a primeira nota:");
        double nota1 = entrada.nextDouble();

        System.out.println("Insira a segunda nota:");
        double nota2 = entrada.nextDouble();

        System.out.println("Insira a terceira nota:");
        double nota3 = entrada.nextDouble();

        double calculoMedia = (nota1 + nota2 + nota3) / 3;
        BigDecimal media = new BigDecimal(calculoMedia).setScale(2, RoundingMode.UP);

        if (calculoMedia == 10) {
            System.out.println("Sua média foi: " + media + "\n" + "Aprovado com Mérito!");
        } else if (calculoMedia >= 7 && calculoMedia < 10) {
            System.out.println("Sua média foi: " + media + "\n" + "Aprovado!");
        } else if (calculoMedia < 7 && calculoMedia >= 0) {
            System.out.println("Sua média foi: " + media + "\n" + "Reprovado!");
        } else {
            System.out.println("Nota inválida!");
        }

        entrada.close();
    }
}
