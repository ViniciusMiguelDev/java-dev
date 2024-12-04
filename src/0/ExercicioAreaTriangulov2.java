import java.util.Scanner;
import entities.Triangle;

public class ExercicioAreaTriangulov2 {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // Forumula: area = raiz de -> p( p - a)( p - b)( p - c)

        // Triangle
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        // Entradas
        // X -> primeiro triângulo
        System.out.println("Insira os lados do primeiro triângulo:");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();

        // Y -> segundo triângulo
        System.out.println("Insira os lados do segundo triângulo:");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        // Formulas
        // X
        double calcX = x.area();

        // Y
        double calcY = y.area();

        // Saídas

        // Areas
        System.out.println("Area do primeiro triangulo: " + calcX);
        System.out.println("Area do segundo triangulo: " + calcY);

        // Saída condicional
        if (calcX > calcY) {
            System.out.println("O primeiro triangulo é maior.");
        } else {
            System.out.println("O segundo triangulo é maior.");
        }
    }
}
