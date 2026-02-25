package secao08_introducao_poo.exemplo01_triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;

        //Instanciando o objeto
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("Área do triangulo X: %.4f %n", areax);
        System.out.printf("Área do triangulo Y: %.4f %n", areay);
        sc.close();
    }
}
