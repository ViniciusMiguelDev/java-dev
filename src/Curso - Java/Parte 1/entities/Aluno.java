package entities;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    double notaFinal;

    public double notaFinal() {
        notaFinal = nota1 + nota2 + nota3;
        return notaFinal;
    }

    public boolean alunoReprovado() {
        if (notaFinal < 60) {
            return true;
        } else {
            return false;
        }
    }

    public String pontosFaltando() {
        if (alunoReprovado() == true) {
            return "Reprovado" + "\n" + "Faltam " + (60 - notaFinal) + " Pontos";
        } else {
            return "Aprovado";
        }
    }
}