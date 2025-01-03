import java.util.Locale;

public class programArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        AbstractShape6 s1 = new Circle6(Color6.BLACK, 2.0);
        AbstractShape6 s2 = new Rectangle6(Color6.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.2f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
    }
}
