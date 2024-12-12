import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioAbstract {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // Locale
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape " + i + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");
            char RorC = sc.next().toUpperCase().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next().toUpperCase();

            if (RorC == 'R') {
                System.out.print("Width:");
                double width = sc.nextDouble();

                System.out.print("Height:");
                double height = sc.nextDouble();

                Shape geo = new Rectangle(Color.valueOf(color), width, height);
                list.add(geo);
            } else if (RorC == 'C') {
                System.out.print("Radius:");
                double radius = sc.nextDouble();

                Shape geo = new Circle(Color.valueOf(color), radius);
                list.add(geo);
            }
        }

        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.calc()));
        }
        sc.close();
    }
}
