package secao08_introducao_poo.exemplo02.application;

import secao08_introducao_poo.exemplo02.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Digite o nome do produto: ");
        product.name = sc.nextLine();
        System.out.print("Digite o preço: ");
        product.price = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Digite um numero para adicionar ao estoque: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.print("Digite um numero para remover do estoque: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();
    }
}
