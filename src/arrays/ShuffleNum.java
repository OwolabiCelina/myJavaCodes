package arrays;

import java.security.SecureRandom;
import java.util.Arrays;

public class ShuffleNum {

    public static void shuffle(int[] array) {
        SecureRandom random = new SecureRandom();
        int temp;
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(array.length);
            temp = array[number];
            array[number] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

}

