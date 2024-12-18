import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate date;
    private Double amout;

    public Installment() {
    }

    public Installment(LocalDate date, Double amout) {
        this.date = date;
        this.amout = amout;
    }

    public LocalDate getDueDate() {
        return date;
    }

    public void setDueDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmout() {
        return amout;
    }

    public void setAmout(Double amout) {
        this.amout = amout;
    }

    @Override
    public String toString() {
        return date.format(fmt) + " - " + String.format("%.2f", amout);
    }

}
