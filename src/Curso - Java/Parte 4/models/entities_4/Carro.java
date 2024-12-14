import java.util.Locale;

public class Carro {

    private String cor;
    private String placa;
    private Double vMaxima;

    public Carro() {
    }

    public Carro(String cor, String placa, double vMaxima) {
        this.cor = cor;
        this.placa = placa;
        this.vMaxima = vMaxima;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getvMaxima() {
        return vMaxima;
    }

    public void setvMaxima(double vMaxima) {
        this.vMaxima = vMaxima;
    }

    @Override
    public String toString() {
        Locale.setDefault(Locale.US);
        StringBuilder sb = new StringBuilder();
        sb.append("Cor: ");
        sb.append(cor);
        sb.append(" Placa: ");
        sb.append(placa);
        sb.append(" Velocidade máxima: ");
        sb.append(String.format("%.1f", vMaxima));
        return sb.toString();
    }

}
