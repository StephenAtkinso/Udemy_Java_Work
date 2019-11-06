package bankApp;

import java.util.LinkedList;
import java.util.List;

public class BankApp {

    public static void main(String args[]){
        List<Account> accounts = new LinkedList<Account>();

        String file = "/Users/stephenatkinson/IdeaProjects/Udemy_Project_1/NewBankCustomers.CSV";

        //Read a CSV file and create accounts based on that data
        List<String[]> newAccounts = utilities.CSV.read(file);
        for(String[] accountHolder : newAccounts){

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else{
                System.out.println("Error reading account type from data");
            }

        }

        for(Account acc : accounts){
            acc.showInfo();
        }

    }

}
