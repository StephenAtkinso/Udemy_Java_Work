package bankApp;

public class Checking extends Account {

    //List the properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to initialise checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
        System.out.println("Implement rate for checking account...");

        rate = getBaseRate() * 0.15;
    }

    //List any methods specific to the checking account

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account Features: " + "\nDebit Card Number: " + debitCardNumber +
                "\nDebit Card Pin: " + debitCardPin);
    }

}
