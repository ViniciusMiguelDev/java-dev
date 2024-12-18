import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;


public class ExercicioSet1 {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            HashSet<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
