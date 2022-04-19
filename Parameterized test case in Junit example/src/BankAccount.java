public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    //constructor
    public BankAccount(String firstName, String lastName, double balance,
                       int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }
    // the branch argument is true if the customer is performing the transaction
    //at a branch with a teller
    // its false if the customer is performing the transaction at an atm
    public double deposit(double amount, boolean branch)
    {
        balance += amount;
        return balance;


    }

    // the branch argument is true if the customer is performing the transaction
    //at a branch with a teller
    // its false if the customer is performing the transaction at an atm
    public double withdraw(double amount, boolean branch)
    {
        if(amount > 500 & !branch){
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return balance;


    }
    //get the balance of the account
    public double getBalance()
    {
        return balance;
    }

    //return the Checking account type
    public boolean isChecking()
    {

        return accountType == CHECKING;
    }


}
