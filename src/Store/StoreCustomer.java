package Store;

public class StoreCustomer {
    private int accountNumber;
    private int balance;
    private int totalItemCharged;
    private int totalCreditApplied;
    private int creditLimit;


        public StoreCustomer(int balance){
            balance = balance;
        }

    public StoreCustomer (int account, int itemCharged, int balance, int credit, int creditApplied){
        this.accountNumber = account;
        itemCharged = totalItemCharged;
        balance = balance;
        credit = creditLimit;
        creditApplied = creditApplied;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public  void setAccountNumber(int accountNumber){
            this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
            return 0;
        }
    public  void setTotalItemCharged(int totalItemCharged){
            this.totalItemCharged = totalItemCharged;
    }
    public int getTotalItemCharged(){
            return 0;
    }
    public void setCreditLimit(int creditLimit){
            this.creditLimit = creditLimit;
    }
    public int getCreditLimit(){
            return 0;
    }
    public void setTotalCreditApplied(int totalCreditApplied){
            this.totalCreditApplied = totalCreditApplied;
    }
    public int getTotalCreditApplied(){
            return 0;
    }
    public int getCalculateBalance (){
            balance = getBalance() + totalItemCharged - creditLimit;
            return balance;
    }
    public boolean creditLimitExceeded(){
            if (getBalance() > creditLimit){
                return true;
            }
            return false;
    }
}

