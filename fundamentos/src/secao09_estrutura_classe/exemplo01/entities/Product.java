package secao09_estrutura_classe.exemplo01.entities;

public class Product {

    //private para não expor nenhum atributo
    private String name;
    private double price;
    private int quantity;

    //Criando um construtor
    public Product (String name, double price, int quantity){
        //this acessa os campos do objeto
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Sobrecarga: Mesmo construtor com parametros diferentes
    public Product (String name, double price){
        //this acessa os campos do objeto
        this.name = name;
        this.price = price;
    }

    //get e set -> metodos para acessar e modificar valores do produto
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

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

