package com.javarush.test;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.*;

public class Project {
    public static HashMap<Integer, String> list = new HashMap<>();
    public static HashMap<String, String> list1 = new HashMap<>();
    public static Date dateTime;
    public static String name;
    boolean isPatientPayedMoney = false;
    boolean isMassageDone;
    boolean isPatientWasPleased;
    public Project(HashMap<Integer, String> list) {

        this.list = list;
    }
    public static void main(String[] args) {
        System.out.println("***THE REGISTRATION OF THE COURSES OF THE MASSAGE***");

        Project project = new Project(list);
        boolean loopAgain = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter ID number ");
            Integer idNumber = Integer.parseInt(scanner.nextLine());
          //  project.dateTime();
            dateTime = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM-dd-YYYY");
            String message = simpleDateFormat.format(dateTime);

            System.out.println(message);
            System.out.print("Enter Name ");
            name = scanner.nextLine();
            list.put(idNumber, name);
            System.out.print("Enter another patient (y/n)?");
            String answer = scanner.nextLine();
            if (answer.equals("y") || answer.equals("Y")) {
                continue;
            } else {
                break;
            }
        } while (loopAgain);
        scanner.close();
        System.out.println("\n**********************************");
        System.out.println("The following patients are in database");
        System.out.println(" ID Number  " + "     Name");
        for (int id : list.keySet()) {

            System.out.println("  " + id + "     " + list.get(id));

        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM-dd-YYYY HH-mm");
        String message = simpleDateFormat.format(dateTime);
        list1.put(message, name);
        System.out.println("dateTime           name");
        for (String id1 : list1.keySet()) {
            System.out.println("  " + id1 + "     " + list1.get(id1));
        }

        System.out.println("\n**********************************");


        if (project.isPatientPayedMoney) {
            project.patientPayedMoney();
            project.massageDone();
            project.patientWasPleased();
        } else {
            System.out.println("No money - no massage!");
        }
        try {
            project.resultsOfMassage();
        } catch (DogIsNotReadyException dogIsNotReadyException) {
            System.out.println(dogIsNotReadyException.getMessage());
            System.out.println("Where is wrong!\r\n Is the patient has paid money? " + project.isPatientPayedMoney
            + "\r\n Is massage was done? " + project.isMassageDone + "\r\n Is the patient was pleased? " + project.isPatientWasPleased);
        }
    }
    public void dateTime() {
        Date dateTime = new Date();
        System.out.print(dateTime);
        System.out.println();
    }
    public void patientPayedMoney() {
        System.out.println("The patient " + list.get(10)
        + " has payed money.");
        this.isPatientPayedMoney = true;
    }

    public void massageDone() {
        System.out.println("The course of the massage for " + list.get(10) + " has done!");
        this.isMassageDone = true;
    }
    public void patientWasPleased() {
        System.out.println("The patient " + list.get(10) + " was pleased with massage.");
        this.isPatientWasPleased = true;
    }
    public void resultsOfMassage() throws DogIsNotReadyException {
        System.out.println("We check the results of the course of massage for the doctor and for the patient "
        + list.get(10) + "");
        if (isPatientPayedMoney && isMassageDone && isPatientWasPleased) {
            System.out.println("The doctor and the patient " + list.get(10) + " were pleased.");
        } else {
            throw new DogIsNotReadyException("The doctor not pleased or the patient " + list.get(10) + " doesn't pleased((((");
        }
    }


}
