import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReaderBufferedReader {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = null;
        File path = new File("C:\\temp\\in.txt");
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
