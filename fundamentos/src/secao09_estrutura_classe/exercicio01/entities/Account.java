package secao09_estrutura_classe.exercicio01.entities;

public class Account {

    private String number;
    private String name;
    private double value;

    public Account(String number, String name, double value){
        this.number=number;
        this.name=name;
        deposit(value);
    }
    public Account(String number, String name){
        this.number=number;
        this.name=name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void deposit(double amount){
        this.value += amount;
    }
    public void withdraw(double amount){
        this.value -= amount + 5.0;
    }

    public String toString(){
        return "Account: "
                + number
                + ", Holder: "
                + name
                + ", Balance: "
                + "$ "
                + String.format("%.2f", value);
    }
}
