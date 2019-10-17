package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "aeyCompany.com";

    //Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the department and return the department
        this.department = setDepartment();

        //Call a method that returns a random password
        this.password = generateRandomPassword(defaultPasswordLength);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." +
                companySuffix;
    }

    //Ask for the department
    private String setDepartment(){

        System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n4 for None\nEnter " +
                "department code >>>");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if (departmentChoice == 1){ return "Sales"; }
        else if (departmentChoice == 2){ return "Development"; }
        else if (departmentChoice == 3){ return "Accounting"; }
        else {return "";}
    }

    //Generate a random password
    private String generateRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@";
        char[] password = new char[length];

        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Change email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change password
    public void changePassword(String password){
        this.password = password;
    }

    //Mailbox capacity getter
    public int getMailboxCapacity(){ return mailboxCapacity; }
    //Alternate email getter
    public String getAlternateEmail(){ return alternateEmail; }
    //Password getter
    public String getPassword(){ return password;}

    public String showInfo(){

        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }

}
