public abstract class AbstractShape6 implements Shape6_interface{
    private Color6 color;

    public AbstractShape6(Color6 color) {
        this.color = color;
    }

    public Color6 getColor() {
        return color;
    }

    public void setColor(Color6 color) {
        this.color = color;
    }
}
