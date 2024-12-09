package entities_2;

public class AlturaGenero {
    private double altura;
    private char genero;
    
    public AlturaGenero(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
}
