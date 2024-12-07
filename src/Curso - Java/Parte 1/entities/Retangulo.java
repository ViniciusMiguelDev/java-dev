package entities;

public class Retangulo {
    public double width;
    public double height;

    // Calcular Area h * w
    public double area() {
        return height * width;
    }

    // Perimetro 2*(h + w)
    public double perimetro() {
        return 2 * (width + height);
    }

    // Diagonal D^2 = h^2 + w^2
    public double diagonal() {
        return Math.ceil(Math.sqrt((height * height)+(width + width)));
    }

}
