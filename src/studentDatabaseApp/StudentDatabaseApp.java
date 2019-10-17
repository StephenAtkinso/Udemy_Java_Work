package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String args[]){

        //Ask how many students you want to add
        System.out.print("Enter how many students you want to add to the system:");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create the correct number of students
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

            System.out.print(students[n].showInfo());

        }

    }

}
