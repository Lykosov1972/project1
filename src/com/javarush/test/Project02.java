package com.javarush.test;

import com.javarash.test1.Computer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Project02 {
    public static int numberOfPatient;
    public static String nameOfPatient;
    public static int ageOfPatient;
    public Project02(int numberOfPatient, String nameOfPatient, int ageOfPatient) {
        this.numberOfPatient = numberOfPatient;
        this.nameOfPatient = nameOfPatient;
        this.ageOfPatient = ageOfPatient;
    }
    public static void main(String[] args) {
        System.out.println("***THE REGISTRATION OF THE COURSES OF THE MASSAGE***");
        Scanner scanner = new Scanner(System.in);
        boolean loopAgain = true;
        do {
            Project02 project02 = new Project02(numberOfPatient, nameOfPatient, ageOfPatient);
            System.out.print("Enter Number of the patient: ");
            project02.numberOfPatient = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Name: ");
            project02.nameOfPatient = scanner.nextLine();
            System.out.print("Enter Age: ");
            project02.ageOfPatient = scanner.nextInt();

            System.out.println("Do you want to enter another patients?");
            String answer = scanner.nextLine();
            if (answer.equals("y") || answer.equals("Y")) {
                continue;
            } else {
                break;
            }
        } while (loopAgain);
        scanner.close();
        printList(numberOfPatient, nameOfPatient, ageOfPatient);
    }
    public static void printList(Integer numberOfPatient1, String nameOfPatient1, int ageOfPatient1) {
        System.out.println("\n**********************************");
        System.out.println("The following patients are in database");
        System.out.println(" ID Number  " + "     Name" + "        Age");
        System.out.println("  " + numberOfPatient1 + "           " + nameOfPatient1 + "          " + ageOfPatient1);
        System.out.println("\n**********************************");
    }
}

