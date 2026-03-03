package secao10_comportamento_array_lista.vetores.exercicio01.application;

import secao10_comportamento_array_lista.vetores.exercicio01.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        System.out.println();
        int num = sc.nextInt();
        Person[] vect = new Person[num];

        for(int i=0; i<vect.length; i++) {
            sc.nextLine();
            System.out.printf("Data of %da person: %n", i+1);
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            System.out.print("Enter a age: ");
            int age = sc.nextInt();
            System.out.print("Enter a height: ");
            double height = sc.nextDouble();
            System.out.println();
            vect[i] = new Person(name, age, height);
        }

        double sum = 0.0;
        double percentAge = 0;

        for(int i=0; i<vect.length; i++) {
            sum += vect[i].getHeight();
            if(vect[i].getAge()<16){
                percentAge += 1;
            }
        }

        double avg = sum/ vect.length;
        double percent = (percentAge/ vect.length)*100;

        System.out.printf("Average height: %.2f %n", avg);
        System.out.printf("People under 16 years old: %.1f%% %n", percent);
        for(int i=0; i< vect.length; i++) {
            if(vect[i].getAge()<16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
