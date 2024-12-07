package entities;

public class Currency {
    public static final double doll = 3.10;
   
    
    public static String Formula(double dollars) {
        double calculo = (dollars * doll);
        double calculoMjuros = calculo + ((calculo * 6) / 100);

        return "O valor a ser pago é: " + calculoMjuros;
    }

}
