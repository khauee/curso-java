package secao10_comportamento_array_lista.lista.exercicio01.application;

import secao10_comportamento_array_lista.lista.exercicio01.entities.Employee;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee;//Instaciação

        System.out.print("How many Employees will be registered? ");
        int num = sc.nextInt();

        List<Employee> list = new ArrayList<>();//Criando a lista do tipo Employee

        for(int i=0; i<num; i++){
            System.out.printf("Employee #%d%n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();//sempre após nextInt, nextDouble, para tirar \n
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employee = new Employee(id,name,salary);//criando um novo employee
            list.add(employee);//adicionando na lista
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int find = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        for(Employee x : list){//x é apenas o elemento atual da lista
            if(x.getId()==find){//acho o id de acordo com o número escolhido
                x.increase(percentage);//chamo o metodo de aumento
            }

        }

        System.out.println("List of employees: ");
        for(Employee x : list){
            System.out.println(x);
        }
    }
}
