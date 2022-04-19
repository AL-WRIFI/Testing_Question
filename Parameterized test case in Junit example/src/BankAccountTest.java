import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("this executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup(){

        account = new BankAccount("Tim", "Backla", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test.....");
    }

    @org.junit.Test
    public void deposit_branch() throws Exception {

        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);

    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch(){
        account.withdraw(600, false);
        fail("should of thrown an illegalArgumentException");
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600, true);
        assertEquals(400.00, account.getBalance(), 0);

    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() throws Exception {
        assertTrue("the account is not a checking account",account.isChecking());

    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("this exectues after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("count = " + count++);
    }
}