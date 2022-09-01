package IntroToJava.c7;

public class Employee {
    private String name;
    private String address;
    private int dateOfBirth;
    private String position;
    private  double salary;
    private static final int MONTHLY_TAX_RATE = 20;
    private  static final double NET_PAY_RATE = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateMonthlyTax(){
        double tax = ((double)MONTHLY_TAX_RATE/100)*salary;
        return tax;
    }

    public static  double calculateAnnualIncome(){
        return 0.0;
    }

    public int calculateNetPay(){
        int netPay = (int) (salary - NET_PAY_RATE);
        return netPay;
    }

    public void setNetPay(double netPay) {
        return;
    }
}


