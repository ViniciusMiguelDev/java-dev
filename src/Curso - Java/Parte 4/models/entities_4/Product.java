import java.util.Locale;

public class Product {
    protected String name;
    protected Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        Locale.setDefault(Locale.US);
        return name + " $ " + String.format("%.2f", price);
    }

    public static boolean staticProductPredicate(Product p) { // Trabalha com produto do argumento
        return p.getPrice() >= 100.0;
    }
    public boolean nonStaticProductPredicate() { // trabalha com o objeto onde está
        return getPrice() >= 100.0;
    }

    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }
    public void nonStaticPriceUpdate(){
        setPrice(getPrice() * 1.1);
    }

    public static String staticUpperCaseName(Product p) {
        return p.getName().toUpperCase();
    }
    public String nonStaticUpperCaseName() {
        return getName().toUpperCase();
    }

    @Override
    public String toString() {
        return getName() + ", " + String.format("%.2f", getPrice());
    }

}
