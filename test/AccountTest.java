import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account bankeAccount;
    //Account celinaAccount;

    @BeforeEach
      public void startWithThis() {
        //celinaAccount = new Account();
        bankeAccount = new Account("1", "Banke Celina", "1234");
    }

    @Test
    public void accountCanBeCreatedTest(){
        //given that account exists
        //check that account exists
        //check that balance is zero
//        Account account = new Account();
        assertNotNull(bankeAccount);
        assertEquals(0, bankeAccount.getBalance("1234"));
    }


    @Test
    public void depositMoney_balanceIncreasesTest(){
        //given that I have and balance is zero
        //when i deposit 200
        //check that balance is 200
//        Account bankeAccount = new Account();
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(200);
        assertEquals(200, bankeAccount.getBalance("1234"));
    }

    @Test
    public void cannotDepositNegativeAmountTest(){
        //given that i have an account and balance is zero
        //when i try to deposit -2500
        //check that balance is zero
//        Account bankeAccount = new Account();
        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(-2500);
        assertEquals(0, bankeAccount.getBalance("1234"));
    }

    @Test
    @DisplayName("Getting balance with valid pin returns real balance")
    public void getBalanceWithWrongPin_returnZeroTest(){
        //given i have money in my account
        //when i check my balance with wrong pin
        //balance is zero
        bankeAccount.deposit(2000);
        int myBalance = bankeAccount.getBalance("1234");
        assertEquals(2000, myBalance);
    }

//    @Test
//    public void acctCanWithDraw(){
//        bankeAccount.deposit(5000);
////        int myBalance = bankeAccount.getBalance("1234");
//        int currentBalance = bankeAccount.withDraw(1000 ,"1236");
//        assertEquals(5000, currentBalance);
//    }

    @Test
    public void acctCanWithDraw(){
        //given that i have account and balance is 5000
        //when i ty to withdraw 2000 with 1234 as pin
        //check that  current balance is 4000
        bankeAccount.deposit(5000);
//        int myBalance = bankeAccount.getBalance("1234");
        bankeAccount.withDraw(2000 ,"1234");
        assertEquals(3000, bankeAccount.getBalance("1234"));
    }

    @Test
    public  void withDrawWithWrongPinAndHighAmountThanBalanceTest(){
        bankeAccount.deposit(5_000);
        bankeAccount.withDraw(10_000, "2727");
        assertEquals(5_000, bankeAccount.getBalance("1234"));
    }
}