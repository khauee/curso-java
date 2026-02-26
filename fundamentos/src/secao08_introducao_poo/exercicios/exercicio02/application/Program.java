package secao08_introducao_poo.exercicios.exercicio02.application;

import secao08_introducao_poo.exercicios.exercicio02.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do dólar: ");
        double price = sc.nextDouble();
        System.out.print("Digite o valor que deseja comprar: ");
        double value = sc.nextDouble();

        double total = CurrencyConverter.amountToPay(price,value);

        System.out.printf("Total a pagar em reais: %.2f ", total);

        sc.close();
    }
}
