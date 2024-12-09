import java.util.Scanner;

import entities_2.Alunos;;

public class ExercicioAlunos {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int n = sc.nextInt();

        Alunos[] aluno = new Alunos[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do aluno:");
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            aluno[i] = new Alunos(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < aluno.length; i++) {
            if(aluno[i].getMedia() >= 6) {
                System.out.println(aluno[i].getName());
            }
        }

        sc.close();
    }
}
