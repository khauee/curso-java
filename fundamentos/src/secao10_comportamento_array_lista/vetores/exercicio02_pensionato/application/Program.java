package secao10_comportamento_array_lista.vetores.exercicio02_pensionato.application;

import secao10_comportamento_array_lista.vetores.exercicio02_pensionato.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student[] vect = new Student[10];

        System.out.print("How many rooms will be rented? ");
        int num = sc.nextInt();
        System.out.println();

        for(int i=0; i<num; i++) {
            sc.nextLine();
            System.out.printf("Rent#%d: %n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            System.out.println();
            vect[room] = new Student(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for(int i=0; i<vect.length; i++){
            if(vect[i]!=null){
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();
    }
}
