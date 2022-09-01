import java.util.Scanner;

public class MyDiary {

    private String name;
    private int password;
    private String title;
    private String date;

    public MyDiary(String name, String title, int password, String date){
        this.name = name;
        this.title = title;
        this.password = password;
        this.date = date;
    }

    public  void addText(){

        Scanner input = new Scanner(System.in);
        System.out.println("enter means of recognition");
        name = input.nextLine();

        System.out.println("enter pasword");
        name = input.nextLine();
        System.out.println("I was left speechless after seeing this extremely handsome guy today");
        name = input.nextLine();

    }

    public static void main(String[] args) {

    }

}
