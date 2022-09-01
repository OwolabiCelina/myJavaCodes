package ac;

public class MaxArray {
    public static int maxi(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {

        int[] array = {50,3,4,5,6,7,10,20};

        System.out.println(maxi(array));

    }
}