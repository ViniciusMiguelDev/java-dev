import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExercicioLambda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            /*double[] sum = {0.0};
            list.forEach(p -> sum[0] += p.getPrice());
            System.out.println("Preço medio: " + String.format("%.2f", sum[0] / list.size()));*/

            double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> lessAvg = list.stream().filter(p -> p.getPrice() < avg).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());
            
            lessAvg.forEach(System.out::println);

            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
