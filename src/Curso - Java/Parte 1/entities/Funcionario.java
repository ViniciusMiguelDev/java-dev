package entities;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;

    double salarioSemImposto;

    public double salarioAtualizado() {
        salarioSemImposto = salario - imposto;
        return salarioSemImposto;
    }

    public void aumentoSalario(double porcentagem) {
        double aumento = (salario * porcentagem) / 100;
        double novoSalario = salarioSemImposto + aumento;
        System.out.println("Salário atualizado é: " + novoSalario);
    }

    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioAtualizado());
    }
}
