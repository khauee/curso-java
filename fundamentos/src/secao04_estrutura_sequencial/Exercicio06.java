package secao04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi=3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a*c)/2;
        circulo = pi*(pow(c,2));
        trapezio = ((a+b)/2)*c;
        quadrado = b*b;
        retangulo = a*b;

        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();
    }
}
