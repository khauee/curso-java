package secao08_introducao_poo.exemplo02.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }
     public void AddProducts(int quantity) {
        this.quantity += quantity;
     }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Produto: "
                + name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades, "
                + "Total: $ "
                + String.format("%.2f",totalValueInStock());
    }
}
