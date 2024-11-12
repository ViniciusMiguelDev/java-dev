import java.util.Scanner;

public class Aula1_Ex_1_ao_6 {
    public static void main(String... args) {
        // 1
        String apreset = "Ola Mundo";
        System.out.println(apreset);

        // 2
        int a;
        int b;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor 1");
        a = entrada.nextInt();
        System.out.println("Insira o valor 2");
        b = entrada.nextInt();

        // 3
        int soma = a + b;
        System.out.println(soma);

        // 4
        byte n1;
        System.out.println("Insira a nota 1");
        n1 = entrada.nextByte();
        byte n2;
        System.out.println("Insira a nota 2");
        n2 = entrada.nextByte();
        byte n3;
        System.out.println("Insira a nota 3");
        n3 = entrada.nextByte();
        byte n4;
        System.out.println("Insira a nota 4");
        n4 = entrada.nextByte();

        float soma0 = 0;
        float media = 0;

        int[] notas = { n1, n2, n3, n4 };

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] <= 10) {
                soma0 = soma0 + notas[i];
            }

        }
        media = soma0 / notas.length;
        System.out.println(media);

        // 5
        double Metro = 7.5;
        double Centimetro = Metro * 100;
        System.out.println(Centimetro);

        // 6
        double raio = 12;
        double PI = 3.14;
        //double AC = 2 * PI * raio * raio;
        double AC = 2 * PI * Math.pow(raio, 2);
        System.out.println(AC);
    }
};

/*
 * 4-
 * a= nota1
 * b= nota2
 * c= nota3
 * d= nota4
 * 
 * array notas = [a, b, c, d]
 * 
 * for notas
 * se nota < 0 || > 10 -> invalido
 * se valido soma = -> a + b + c + d
 * media = soma / array.length
 * print media
 * 
 * 5-
 * string comprimentoMetro;
 * comprimentoCenti = comprimentoMetro * 100
 * print comprimentoCenti
 * 
 * 6-
 * double raio;
 * double PI = 3,14;
 * 
 * double AC = 2 * PI * raio
 * print AC
 */