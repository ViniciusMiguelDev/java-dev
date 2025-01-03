package entities_2;

public class Estudante {
    private String name;
    private String email;

    public Estudante() {

    }

    public Estudante(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return this.name + ", " + this.email;
    }
    
}
