import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Employee1
        Employee employee1 = new Employee("Kseniya", "QA Engineer", 24, 150000, "kseniya@mail.ru", "+375(29)555-22-33");

        //Employee2
        Employee employee2 = new Employee("Sergei", "Salesman", 30, 100000, "sergei@mail.ru", "+375(44)344-66-78");

        //Employee3
        Employee employee3 = new Employee("Egor", "Manager", 22, 90000, "egor@mail.ru", "+375(33)324-77-77");

        //Employee4
        Employee employee4 = new Employee("Maria", "Engineer", 41, 140000, "maria@mail.ru", "+375(29)655-66-88");

        //Employee5
        Employee employee5 = new Employee("Maksim", "Developer", 45, 200000, "maksim@mail.ru", "+375(44)311-15-00");

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};


        System.out.println("Emloyees over 40 years old:");
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getAge() > 40) {
                System.out.println("Name " + employees[i].getName()
                        + ", Profession " + employees[i].getProfession()
                        + ", Age " + employees[i].getAge()
                        + ", Salary " + employees[i].getSalary()
                        + ", Email " + employees[i].getEmail()
                        + ", Phone number " + employees[i].getPhone() + ".");
            }
        }


    }

}
