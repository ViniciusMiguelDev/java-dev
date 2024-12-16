import java.util.Scanner;

import entities.Aluno;

public class ExercicioAlunos1 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.println("Insira o nome e as 3 notas do primeiro aluno:");
        a.nome = entrada.nextLine();
        a.nota1 = entrada.nextDouble();
        a.nota2 = entrada.nextDouble();
        a.nota3 = entrada.nextDouble();

        System.out.println();
        System.out.println("Nota Final: " + a.notaFinal());
        System.out.println(a.pontosFaltando());

        entrada.close();
    }
}