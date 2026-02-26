package secao09_estrutura_classe.exemplo01.application;

import secao09_estrutura_classe.exemplo01.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();
        System.out.print("Digite o preço: ");
        double price = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantity = sc.nextInt();

        //Instanciacao vem so depois de definir as variaveis
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Digite um numero para adicionar ao estoque: ");
        quantity = sc.nextInt();
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