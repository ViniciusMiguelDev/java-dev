import java.util.Scanner;

public class ExercicioAreaTriangulo {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        // Forumula: area = raiz de -> p( p - a)( p - b)( p - c)

        System.out.println("Insira os lados do primeiro triângulo:");
        double tri1L1 = entrada.nextDouble();
        double tri1L2 = entrada.nextDouble();
        double tri1L3 = entrada.nextDouble();

        double calcular = calcul(tri1L1, tri1L2, tri1L3);

        System.out.println("Insira os lados do segundo triângulo:");
        double tri2L1 = entrada.nextDouble();
        double tri2L2 = entrada.nextDouble();
        double tri2L3 = entrada.nextDouble();

        double calcular2 = calcul(tri2L1, tri2L2, tri2L3);

        System.out.println("Area do primeiro triangulo: " + calcular);
        System.out.println("Area do segundo triangulo: " + calcular2);

        if (calcular > calcular2) {
            System.out.println("O primeiro triangulo é maior.");
        } else {
            System.out.println("O segundo triangulo é maior.");
        }

        entrada.close();
    }

    public static double calcul(double a, double b, double c) {
        double p = (a + b + c) / 2.0;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }
}
