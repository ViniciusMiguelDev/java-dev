import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities_2.Funcionario;

public class ExercicioFuncionarios {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Emplyoee #" + (i + 1) + ":");

            System.out.println("Id:");
            int id = sc.nextInt();
            while (hasId(funcionarios, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.println("Name:");
            String nome = sc.nextLine();

            System.out.println("Salary:");
            double salary = sc.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Funcionario plusSalary = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (plusSalary == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            plusSalary.increaseSalary(percentage);
            sc.close();
        }
        System.out.println("List of employees:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.getId() + ", " + funcionario.getName() + ", " + String.format("%.2f", funcionario.getSalary()));
            }
    }

    public static boolean hasId(ArrayList<Funcionario> list, int id) {
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}