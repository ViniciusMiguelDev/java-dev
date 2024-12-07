import java.util.Scanner;

public class Aula2_Ex_28_ao_31 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 28
        System.out.println("Digite um número inteiro de 1 a 10.");
        int entrada1_Q28 = entrada.nextInt();
        
        if (entrada1_Q28 >= 1 && entrada1_Q28 <= 10) {

            switch (entrada1_Q28) {
                case 1:
                  System.out.println("O número por extenso é: Um.");
                  break;
                case 2:
                System.out.println("O número por extenso é: Dois.");
                  break;
                case 3:
                System.out.println("O número por extenso é: Três.");
                  break;
                case 4:
                System.out.println("O número por extenso é: Quatro.");
                  break;
                case 5:
                System.out.println("O número por extenso é: Cinco.");
                  break;
                case 6:
                System.out.println("O número por extenso é: Seis.");
                  break;
                case 7:
                System.out.println("O número por extenso é: Sete.");
                  break;
                case 8:
                System.out.println("O número por extenso é: Oito.");
                  break;
                case 9:
                System.out.println("O número por extenso é: Nove.");
                  break;
                case 10:
                System.out.println("O número por extenso é: Dez.");
                  break;
              }

        } else {
            System.err.println("Número inválido.");
        }


        // 29
        System.out.println("Digite um número inteiro de três dígitos:");
        int entrada1_Q29 = entrada.nextInt();

        if (entrada1_Q29 >= 100 && entrada1_Q29 <= 999) {
            int cent = entrada1_Q29 / 100;
            int dez = (entrada1_Q29 / 10) % 10;
            int unid = entrada1_Q29 % 10;
    
            int soma3Digitos = cent + dez + unid;
    
            System.out.println("A soma dos algarismos é: " + soma3Digitos);
        } else {
            System.err.println("Número inválido. Digite um número com três dígitos.");
        }


        // 30
        System.out.println("Digite um número para verificar se ele é múltiplo de 3 e de 7:");
        int entrada1_Q30 = entrada.nextInt();

        int mult3 = entrada1_Q30 % 3;
        int mult7 = entrada1_Q30 % 7;


        if (mult3 == 0 && mult7 == 0) {
           System.out.println("O número é múltiplo de 3 e de 7."); 
        } else {
            System.out.println("O número não é múltiplo de 3 e 7.");
        }

        // 31
        System.out.println("Digite a sua idade:");
        int entrada1_Q31 = entrada.nextInt();

        if (entrada1_Q31 >= 1 && entrada1_Q31 <= 21) {
            System.out.println("Classificação: Menor de idade.");
        } else if (entrada1_Q31 > 21 && entrada1_Q31 < 65) {
            System.out.println("Classificação: Maior de idade.");
        } else if (entrada1_Q31 >= 65){
            System.out.println("Classificação: Pessoa idosa.");
        } else {
            System.out.println("Idade inválida.");
        }


        entrada.close();
    }
}
