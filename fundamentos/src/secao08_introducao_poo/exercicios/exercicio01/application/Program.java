package secao08_introducao_poo.exercicios.exercicio01.application;

import secao08_introducao_poo.exercicios.exercicio01.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.name = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        aluno.nota3 = sc.nextDouble();


        System.out.printf("Nota final: %.2f %n", aluno.notaFinal());
        if(aluno.aprovado()){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
            System.out.printf("Pontos faltantes para passar: %.2f %n", aluno.pontosFaltantes());
        }

        sc.close();
    }
}
