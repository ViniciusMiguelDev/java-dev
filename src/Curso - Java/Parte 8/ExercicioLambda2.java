import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import models.entities01.funcionarioLambda;

public class ExercicioLambda2 {
    public static void main(String[] args) {
        String path = "C:\\temp\\in.txt";

        Scanner sc = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<funcionarioLambda> list = new ArrayList<>();

            String file = br.readLine();
            while (file != null) {
                String[] fields = file.split(",");
                list.add(new funcionarioLambda(fields[0], fields[1], Double.parseDouble(fields[2])));
                file = br.readLine();
            }

            System.out.print("Insira o valor de salario base: ");
            double valor = sc.nextDouble();

            List<String> st1 = list.stream().filter(e -> e.getSalary() > valor).map(e -> e.getEmail()).sorted()
                    .collect(Collectors.toList());
            st1.forEach(System.out::println);

            double sum = list.stream().filter(e -> e.getName().toUpperCase().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
