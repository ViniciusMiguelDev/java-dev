import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExerciciosFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Scanner
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.println("Informe o nome, salário e impostos do funcionário:");
        f.nome = sc.nextLine();
        f.salario = sc.nextDouble();
        f.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + f.toString());

        System.out.println();
        System.out.println("Qual porcentagem você deseja acrescentar no salário?");
        f.aumentoSalario(sc.nextDouble());

        sc.close();
    }
}
