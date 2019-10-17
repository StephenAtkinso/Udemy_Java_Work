package bankApp;

public class BankApp {

    public static void main(String args[]){

        Checking chk1 = new Checking("Andrew Jackson", "123456789", 1500);

        Savings sv1 = new Savings("Fart gas", "987654321", 2500);

        sv1.showInfo();
        chk1.showInfo();

        //Read a CSV file and create accounts based on that data

    }

}
