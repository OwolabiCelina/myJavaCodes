package IntroToJava.c7;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Banke");
        employee.setSalary(500000.00);
//        System.out.println("Employee " +  employee.getName()+
//                " is to pay: "+employee.calculateMonthlyTax()+" as tax.");
        System.out.println(employee.calculateMonthlyTax());

//        employee.setName("Banke");
        employee.setNetPay(500000);
        System.out.println(employee.calculateNetPay());
    }
}
