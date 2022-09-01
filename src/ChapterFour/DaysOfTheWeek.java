package ChapterFour;

public class DaysOfTheWeek {
    private static void printDaysOfTheWeek(int day) {

        int days;

        int DaysOfTheWeek = 6;
        switch (DaysOfTheWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
            case 6:
                System.out.println("friday, Saturday");
                System.out.println("day is Saturday actually");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }

    public static void daysOfTheWeek(int day) {

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Day is invalid");
        }

    }

    public static void main(String[] args) {
        DaysOfTheWeek.printDaysOfTheWeek(6);
        DaysOfTheWeek.daysOfTheWeek(5);
    }
}

