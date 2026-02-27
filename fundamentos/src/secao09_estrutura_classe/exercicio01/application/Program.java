package secao09_estrutura_classe.exercicio01.application;

import secao09_estrutura_classe.exercicio01.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;
        double value;

        System.out.print("Enter the account number: ");
        String number = sc.nextLine();
        System.out.print("Enter the name account: ");
        String name = sc.nextLine();
        System.out.print("Do you want to enter the initial deposit amount: 1-YES | 2-NO: ");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter a initial deposit: ");
            value = sc.nextDouble();
            account = new Account(number,name,value);
        }
        else {
            account = new Account(number,name);
        }

        System.out.println("Account data: " + account);

        System.out.print("Which value you want deposit: ");
        value = sc.nextDouble();
        account.deposit(value);
        System.out.println("Update data: " + account);

        System.out.print("Wich value you want withdraw: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("Update data: " + account);

    }
}
