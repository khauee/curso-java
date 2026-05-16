package secao12_enumeracao_composicao.exercicio.entities;

import secao12_enumeracao_composicao.exercicio.entitiesenum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    List<OrderItem> orderitem = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }



    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderitem() {
        return orderitem;
    }

    public void addItem(OrderItem item) {
        orderitem.add(item);
    }

    public void removeItem(OrderItem item) {
        orderitem.remove(item);
    }

    public Double total() {
        double soma = 0;
        for(OrderItem o : orderitem) {
            soma += o.subTotal();
        }
        return soma;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");  // chama o toString() do Client
        sb.append("Order items:\n");

        for(OrderItem o : orderitem){
            sb.append(o + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }

}
