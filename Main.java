package se.iths.StaffManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {

        StaffManagement.dummy();
        while (loop) {

            System.out.println("\n\n1. Employee Management");
            System.out.println("2. Exit");

            System.out.print("\nMake a choice: ");

            int choice = readNumber();

            if (choice == 1) {
                EmployeeManagement();
            } else if ((choice==2)) {
                loop = false;
                System.out.println("Program terminated");
            }else
                System.out.println("Please choose a number between 1 and 2");

        }
    }


    private static void EmployeeManagement() {
        boolean loop3 = true;

        while (loop3) {
            System.out.println("\n1. Add employee");
            System.out.println("2. Show all employees");
            System.out.println("3. Update employee");
            System.out.println("4. Remove employee");
            System.out.println("5. Calculate bonus of employee");
            System.out.println("6. Sort employees by name");
            System.out.println("7. Sort employees by ID");
            System.out.println("8. Back to main menu");

            System.out.print("\nMake a choice: ");
            int choice1 = readNumber();

            switch (choice1) {
                case 1:
                    StaffManagement.add();
                    break;

                case 2:
                    StaffManagement.showAllEmployee();
                    break;

                case 3:
                    StaffManagement.upDateEmployeeName();
                    break;

                case 4:
                    StaffManagement.removeEmployeeById();
                    break;

                case 5:
                    StaffManagement.showBonusById();
                    break;

                case 6:
                    StaffManagement.sortEmployeesByName();
                    break;

                case 7:
                    StaffManagement.sortEmployeesById();
                    break;

                case 8:
                    loop3 = false;

                default:
                    System.out.println("Choose a number between 1-7. Out of range.");
            }
        }
    }

    public static int readNumber() {
        boolean loop1 = true;
        int no = 0;

        while (loop1) {

            try {
                no = sc.nextInt();
                sc.nextLine();
                loop1 = false;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Only numbers please ");
                System.out.println("Pick a number: ");
            }
        }
        return no;
    }
}
