/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/

package secao06_estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Exercicio07_for {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        for(int i=1; i<=numero; i++){
            System.out.printf("%d %d %d %n", i, i*i, i*i*i);
        }

        sc.close();
    }
}
