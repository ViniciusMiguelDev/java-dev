import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmpresa {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (y/n)? ");
            char out = sc.next().toUpperCase().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            if (out == 'Y') {
                System.out.print("Additional charge: ");
                double addit = sc.nextDouble();
                list.add(new OutSourcedEmployee(name, hours, value, addit));
            } else if (out == 'N') {
                list.add(new Employee(name, hours, value));
            }
        }
        System.out.println("PAYMENTS:");
        for (Employee employee : list) {
            System.err.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()) );
        }

        sc.close();
    }
}
