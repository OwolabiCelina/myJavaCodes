import java.util.Arrays;

public class Banky {
    public static void main(String[] args) {

        String[] bankyArray = new String[10];
        for (int i = 0; i < bankyArray.length; i++) {
            bankyArray[i] = "String banky " + i;

            System.out.println(bankyArray[i]);
        }
    }
}