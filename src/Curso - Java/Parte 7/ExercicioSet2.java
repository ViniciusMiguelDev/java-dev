import java.util.HashSet;
import java.util.Scanner;


public class ExercicioSet2 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        HashSet<Aluno> A = new HashSet<>();
        HashSet<Aluno> B = new HashSet<>();
        HashSet<Aluno> C = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A.add(new Aluno(sc.nextInt()));
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            B.add(new Aluno(sc.nextInt()));
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            C.add(new Aluno(sc.nextInt()));
        }
        HashSet<Aluno> turma = new HashSet<>(A);
        turma.addAll(B);
        turma.addAll(C);

        System.out.println("Total students: " + turma.size());

        sc.close();
    }
}
