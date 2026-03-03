package secao10_comportamento_array_lista.vetores.exemplo01.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    //Objetos alocados dinamicamente, quando não tem mais referência são desalocados pelo garbage collector. Variaveis locais são desalocadas assim que seu escopo sai de execução

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double sum = 0;
        double vect[] = new double[num];

        for(int i=0; i<num; i++){
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double avg = sum/num;

        System.out.printf("Média das alturas: %.2f", avg);

        sc.close();
    }
}
