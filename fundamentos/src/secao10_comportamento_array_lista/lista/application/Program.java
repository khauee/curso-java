package secao10_comportamento_array_lista.lista.application;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void  main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("José");
        list.add(1, "João");
        list.remove("José");
        list.remove(0);

        list.add(0, "Maria");
        list.add(1, "José");

        list.removeIf(x -> x.charAt(0) == 'M');
        list.add("Maria");

        List<String> result = list.stream().filter(x-> x.charAt(0) == 'M').collect(Collectors.toList());//usa expressão lambda, tem que converter
        String name = list.stream().filter(x-> x.charAt(0) == 'M').findFirst().orElse(null);//retorna primeiro nome com M, se não achar retorna null
        /*for(String x : result){
            System.out.println(x);
        }*/
        System.out.println(name);
    }
}
