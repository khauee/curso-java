package secao08_introducao_poo.exemplo01_triangulo;

public class Triangle {
    public double a;
    public double b;
    public double c;

    //Criando metodo
    public double area() {
        double p = (a+b+c) / 2.0;
        return Math.sqrt(p* (p-a) * (p-b) * (p-c));
    }
}
