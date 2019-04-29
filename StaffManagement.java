package se.iths.StaffManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManagement {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void add() {
        System.out.print("\nEnter the name of Employee: ");
        String name = sc.nextLine();

        System.out.print("Enter the experience of Employee: ");
        int a =  Main.readNumber();

        System.out.print("Enter the Salery of Employee: ");
        int b =  Main.readNumber();

        System.out.println("\nEnter the designation of Employee: ");

        System.out.println("1.Programmer");
        System.out.println("2.Secretary");

        int choiceOfProfession =  Main.readNumber();

        switch (choiceOfProfession) {
            case 1:
                Programmer p1 = new Programmer(name, a, b, "Programmer");
                employees.add(p1);
                break;

            case 2:
                Secretary s1 = new Secretary(name, a, b, "Secretary");
                employees.add(s1);
                break;

        }

    }

    public static void showAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void upDateEmployeeName() {
        System.out.println("\nList of all employees is");

        showAllEmployee();
        System.out.print("\nEnter the id of employee you want to change name of:");

        int id = Main.readNumber();

        System.out.print("Enter the new name: ");

        String name = sc.nextLine();

        for (Employee employee : employees) {

            if (employee.getId() == id) {
                employee.setName(name);
            }

        }

        showAllEmployee();

    }

    public static void dummy() {

        Secretary secretary1 = new Secretary("Qasim", 10, 20000, "Manager");
        Programmer programmer = new Programmer("Asim", 10, 25000, "Programmer");
        Programmer programmer1 = new Programmer("Arshad", 15, 30000, "Programmer");
        Secretary secretary = new Secretary("Bilal", 10, 22000, "Secretary");

        employees.add(secretary1);
        employees.add(programmer);
        employees.add(programmer1);
        employees.add(secretary);

    }

    public static void removeEmployeeById() {
        System.out.println("List of all employees is given below");
        showAllEmployee();
        System.out.println("Enter the ID of employee you want to remove");
        int id =  Main.readNumber();
        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
            }
        }
    }

    public static void showBonusById() {
        showAllEmployee();
        System.out.println("\nEnter the ID of employee you want to calculate bonus");
        int id =  Main.readNumber();

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.calculateBonusOfEmployee();
            }
        }

    }

    public static void sortEmployeesByName(){
        showAllEmployee();
        System.out.println("\nSorted list of employees by name in assending order\n");
        employees.sort((o1, o2)->  o1.getName().compareTo(o2.getName()));
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }
    public static void sortEmployeesById(){
        showAllEmployee();
        System.out.println("\nSorted list of employees by ID in descending order\n");
        employees.sort((o1, o2)->  o2.getId()-o1.getId());
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }
}
