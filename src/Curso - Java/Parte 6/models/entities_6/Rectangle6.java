public class Rectangle6 extends AbstractShape6{
    private Double height;
    private Double width;
    public Rectangle6(Color6 color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    @Override
    public double area() {
        return width * height;
    }
}
