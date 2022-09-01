package Store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreCustomerTest {

    private StoreCustomer store;
    private StoreCustomer customer;
    private StoreCustomer mike;


    @BeforeEach
    public void setUp() {
        store = new StoreCustomer(4, 3000, 1000, 500, 2000);
        customer = new StoreCustomer(3000);
    }

    @Test
    void calculateBalance() {
        store.setBalance(3000);
        assertEquals(1000, store.getBalance());
    }

    @Test
    void setAccountNumber() {
        store.setAccountNumber(4);
        store.setBalance(5000);
        store.setCreditLimit(2000);
        store.setTotalCreditApplied(200);
        store.setTotalItemCharged(1000);

        store.getCalculateBalance();
        assertEquals(3000, store.getBalance());
    }

    @Test
    void getNewBalance() {
        customer.setAccountNumber(4);
        customer.setBalance(2000);
        customer.setTotalCreditApplied(2000);
        customer.setTotalItemCharged(10000);
        customer.setCreditLimit(2000);

        customer.getCalculateBalance();
        assertEquals(10000, customer.getBalance());
    }

    @Test
    public void creditLimitIsExceeded() {
        //boolean creditLimitExceeded = false;
        StoreCustomer[] newItem = {customer, store};
        for (int i = 1; i < newItem.length; i++) {
            if (store.getBalance() < customer.getCreditLimit()) {
                System.out.println("Credit limit Exceeded");
            }
            System.out.println("Credit limit is not Exceeded");

        }
    }
}