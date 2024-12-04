import java.util.Scanner;

import entities.Retangulo;

public class ExercicioWidthHeight {
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);

        Retangulo R = new Retangulo();

        System.out.println("Insira a largura do retangulo:");
        R.width = entrada.nextDouble();

        System.out.println("Insira a altura do retangulo:");
        R.height = entrada.nextDouble();


        System.out.println("Area do retangulo é: " + R.area());
        System.out.println("O perimetro do retangulo é: " + R.perimetro());
        System.out.println("A diagonal do retangulo é: " + R.diagonal());
        

        entrada.close();
    }
}
