import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank wemaBank;

    @BeforeEach
    public void startWithThis() {
        wemaBank = new Bank();
    }

    @Test
    public void bankExistsTest() {
        Bank wemaBank = new Bank();
        assertNotNull(wemaBank);
    }

    @Test
    public void accountCanBeCreatedTest() {
        //given that there is a bank
        //when i create an account
        //check that number of accounts created is 1
        wemaBank.createAccountFor("Banke Celina Owolabi", "1234");
        assertEquals(1, wemaBank.getNumberOfCustomers());
    }

    @Test
    public void createAccount_findAccountByAccountNumberTest() {
        wemaBank.createAccountFor("Banke Celina Owolabi", "1234");
        assertEquals(1, wemaBank.getNumberOfCustomers());

        Account account = wemaBank.findAccount("1");
        assertEquals("Banke Celina Owolabi", account.getName());
    }

    @Test
    public void customerCanDepositInHerAccountTest() {
        wemaBank.createAccountFor("Banke Celina Owolabi", "1234");
        wemaBank.deposit(3900, "1");

        Account bankeAccount = wemaBank.findAccount("1");
        assertEquals(2_000, bankeAccount.getBalance("1234"));
    }

    @Test
    public void accountCanWithdrawTest() {
        wemaBank.createAccountFor("Banke Celina Owolabi", "1234");
        Account bankeAccount = wemaBank.findAccount("1");
        bankeAccount.deposit(3000);
        bankeAccount.withDraw(2000, "1234");
        assertEquals(1000, bankeAccount.getBalance("1234"));
//    }


    }
}