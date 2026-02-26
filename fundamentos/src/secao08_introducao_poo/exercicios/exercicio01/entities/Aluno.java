package secao08_introducao_poo.exercicios.exercicio01.entities;

public class Aluno {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return (nota1 + nota2 + nota3);
    }

    public boolean aprovado() {
        return notaFinal() >= 60.00;
    }

    public double pontosFaltantes() {
        if (aprovado()){
            return 0.0;
        }
        else {
            return  60.00 - notaFinal();
        }
    }

}
