package studentDatabaseApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int studyYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    //Student constructor for name and year and set their ID based on these
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name:");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name:");
        this.lastName = in.nextLine();

        System.out.print(" First Year - 1\n Second Year - 2\n Final Year - 3\n Placement - 4\n Please select year:");
        this.studyYear = in.nextInt();

        setStudentID();

    }

    //Generate an id
    private void setStudentID(){
        //Year of study + id
        id++;
        this.studentID = studyYear + "" + id;

    }

    //Enroll in courses
    public void enroll(){
        do {
            System.out.print("\nEnter course to Enroll, enter q to quit: ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + courseCost;
            }
            else { break; }
        } while (1 != 0);

    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is " + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        System.out.println("Enter how much you want to pay towards your tuition balance: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment);
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nCurrent Tuition Balance: " + tuitionBalance + "\n";
    }


}
