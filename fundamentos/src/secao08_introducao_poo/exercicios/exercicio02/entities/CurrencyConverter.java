package secao08_introducao_poo.exercicios.exercicio02.entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double amountToPay(double price, double value) {
        return (price*value) + (price*value) * IOF;
    }
}
