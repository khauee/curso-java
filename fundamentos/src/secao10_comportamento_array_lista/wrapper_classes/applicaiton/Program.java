package secao10_comportamento_array_lista.wrapper_classes.applicaiton;

public class Program {
    public static void main(String[] args) {

        int x = 20;

        Integer obj = x;//classe equivalente ao tipo primitivo "x", faz o boxing e unboxing de forma natural
        //usar wrapper classes é melhor que usar primitivo. ex: permite nulo

        int y = x;// se obj fosse do tipo Object teria que fazer o casting

        System.out.println(y);




    }
}
