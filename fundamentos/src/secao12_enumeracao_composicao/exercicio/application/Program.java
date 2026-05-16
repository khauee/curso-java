package secao12_enumeracao_composicao.exercicio.application;

import secao12_enumeracao_composicao.exercicio.entities.Client;
import secao12_enumeracao_composicao.exercicio.entities.Order;
import secao12_enumeracao_composicao.exercicio.entities.OrderItem;
import secao12_enumeracao_composicao.exercicio.entities.Product;
import secao12_enumeracao_composicao.exercicio.entitiesenum.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //CLiente
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String nameCliente = sc.nextLine();
        System.out.print("Email: ");
        String emailCliente = sc.nextLine();
        System.out.print("Birthday date (DD/MM/YYYY): ");
        Date birthDay = sdf.parse(sc.next());
        sc.nextLine();
        Client client = new Client(nameCliente, emailCliente, birthDay);


        //Order
        Date r1 = new Date();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.println("How many items to this order: ");
        int items = sc.nextInt();
        sc.nextLine();
        Order order =  new Order(r1, OrderStatus.valueOf(status), client);



        //OrderItem
        for(int i=0; i<items; i++){
            System.out.printf("Enter #%d item data: \n", i+1);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity,product.getPrice(), product);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);


        sc.close();
    }
}
