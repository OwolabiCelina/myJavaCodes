package health;


import java.util.Calendar;

public class HealthRecords {

    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private static int year;
    private String day;
    private double heightInInches;
    private double weightInPounds;
    //private int bYear;
    private int age;

//        public HealthRecords(int age){
//            this.age = age;
//        }
    // public static void main(String[] args) {

    public HealthRecords(String firstName, String lastName, int month, String gender, int year, String day, double weight, double height, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.weightInPounds = weightInPounds;
        this.heightInInches = height;
        this.year = year;
       // this.year = bYear;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getGender() {
        return gender;
    }

    public static int getYear() {
        return year;
    }

    public void setYear(int year) {
        HealthRecords.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int setCalculationAge() {
        Calendar thisYear = Calendar.getInstance();
        int myYear = thisYear.getWeekYear();
        int age = myYear - HealthRecords.getYear();
        return this.age = age;
    }



    }




