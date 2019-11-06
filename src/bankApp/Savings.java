package bankApp;

public class Savings extends Account {

    //List proporties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to init settings for the savings proporties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;

        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        System.out.println("Implement rate for Savings account...");
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    //List methods specific to the savings account

    public void showInfo(){
        super.showInfo();
        System.out.println("Your saving account features: " + "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey);

    }

}
