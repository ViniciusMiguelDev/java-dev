import java.util.Scanner;

public class Aula3_Ex_1_ao_3 {
    public static void main(String[] args) {

        // Scanner
        Scanner entrada = new Scanner(System.in);

        // 1
        int entrada1_Q1;

        do {
            System.out.println("Digite uma nota entre 0 e 10:");
            entrada1_Q1 = entrada.nextInt();
        } while (entrada1_Q1 < 0);

        // 2

        String entrada1_Q2;
        String entrada2_Q2;

        do {
            System.out.println("Digite o nome de usuário:");
                entrada1_Q2 = entrada.next();

            System.out.println("Digite a senha:");
                entrada2_Q2 = entrada.next();
        } while (entrada1_Q2.equals(entrada2_Q2));

        // 3
        String entrada1_Q3;
        int entrada2_Q3;
        int entrada3_Q3;
        char entrada4_Q3;
        char entrada5_Q3;


        do {
            System.out.println("Digite seu nome (maior que 3 caracteres):");
            entrada1_Q3 = entrada.next();
        } while (entrada1_Q3.length() < 4);

        do {
            System.out.println("Digite sua idade (entre 0 e 150):");
            entrada2_Q3 = entrada.nextInt();

        } while(entrada2_Q3 < 0 || entrada2_Q3 > 150);

        do {
            System.out.println("Digite seu salário (maior que zero):");
            entrada3_Q3 = entrada.nextInt();

        } while(entrada3_Q3 <= 0);

        do {
            System.out.println("Digite seu sexo ('f' para feminino, 'm' para masculino):");
            entrada4_Q3 = entrada.next().toUpperCase().charAt(0);
        } while(entrada4_Q3 != 'F' && entrada4_Q3 != 'M');

        do {
            System.out.println("Digite seu estado civil ('s' para solteiro, 'c' para casado, 'v' para viúvo, 'd' para divorciado):");
            entrada5_Q3 = entrada.next().charAt(0);
        } while (entrada5_Q3 != 's' && entrada5_Q3 != 'c' && entrada5_Q3 != 'v' && entrada5_Q3 != 'd');


        entrada.close();

    }
}
