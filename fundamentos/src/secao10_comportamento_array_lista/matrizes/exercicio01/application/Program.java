package secao10_comportamento_array_lista.matrizes.exercicio01.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number M: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number N: ");
        int num2 = sc.nextInt();
        int[][] mat = new int[num1][num2];

        System.out.println("Enter matriz numbers");
        for(int i=0; i<num1; i++){
            for(int j=0; j<num2; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a number X: ");
        int num = sc.nextInt();

        for(int i=0; i<num1; i++){
            for(int j=0; j<num2; j++){
                if(mat[i][j]==num){// 0|1
                    if(j-1 >= 0) {
                        System.out.print(mat[i][j - 1] + " ");// 0|0
                    }
                    if(j+1 < num2){
                        System.out.print(mat[i][j+1] + " ");//0|2
                    }
                    if(i-1 >= 0) {
                        System.out.print(mat[i-1][j] + " ");//-1|1
                    }
                    if(i+1 < num1){
                        System.out.print(mat[i+1][j] + " ");//1|1
                    }
                }
            }
        }

        sc.close();
    }
}
