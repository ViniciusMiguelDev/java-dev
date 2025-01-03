public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return price + customsFee;
    }

    @Override
    public final String priceTag() {
        price = totalPrice();
        return super.priceTag() + " (Customs fee: $ " + customsFee + ")";
    }

}
