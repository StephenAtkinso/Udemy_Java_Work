package bankApp;

public abstract class Account implements iBaseRate {

    //List common Properties for savings and checking accounts
    private String name;
    private String sSN;
    private double balance;
    private static int index = 10000;

    protected String accountNumber;
    protected double rate;

    //Constructor to set base properties and initialise the account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;
        //Set account number
        index++;
        this.accountNumber = setAccountNumber();
        getBaseRate();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    //List common methods

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued interest: $" + accruedInterest);
        printBalance();
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now $" + balance);
    }

    public void showInfo(){
        System.out.println("*************");
        System.out.println("Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance +
                "\nRate: " + rate + "%");
    }

}
