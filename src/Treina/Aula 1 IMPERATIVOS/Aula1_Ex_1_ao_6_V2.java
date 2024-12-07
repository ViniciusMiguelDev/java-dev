import javax.swing.JOptionPane;

public class Aula1_Ex_1_ao_6_V2 {
    public static void main(String[] args) {

        // 1
        String apresent = "Ola Mundo";
        JOptionPane.showMessageDialog(null, apresent);

        // 2
        int a;
        int b;

        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor 1" ));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o valor 2" ));

        // 3
        int soma = a + b;
        JOptionPane.showMessageDialog(null,"Valor da soma é:\n" + soma);

        // 4
        byte n1;
        n1 = Byte.parseByte(JOptionPane.showInputDialog
        (null,"Insira a nota 1:" ));

        byte n2;
        n2 = Byte.parseByte(JOptionPane.showInputDialog
        (null,"Insira a nota 2:" ));

        byte n3;
        n3 = Byte.parseByte(JOptionPane.showInputDialog
        (null,"Insira a nota 3:" ));

        byte n4;
        n4 = Byte.parseByte(JOptionPane.showInputDialog
        (null,"Insira a nota 4:" ));

        float soma0 = 0;
        float media = 0;

        int[] notas = { n1, n2, n3, n4 };

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] <= 10) {
                soma0 = soma0 + notas[i];
            }

        }
        media = soma0 / notas.length;
        JOptionPane.showMessageDialog(null, "A média é:\n" + media);

        // 5
        double Metro = 7.5;
        double Centimetro = Metro * 100;
        JOptionPane.showMessageDialog(null, Centimetro);

        // 6
        double raio = 12;
        double PI = 3.14;
        //double AC = 2 * PI * raio * raio;
        double AC = 2 * PI * Math.pow(raio, 2);
        JOptionPane.showMessageDialog(null, AC);
        
    }
}
