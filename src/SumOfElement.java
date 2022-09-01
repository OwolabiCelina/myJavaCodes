import java.util.Arrays;

public class SumOfElement {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 1, 3, 9, 2, 1};

//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int z = i+1; z < numbers.length; z++) {
//                if (numbers[i] > numbers[z]){
//                    int hint = numbers[i];
//                    numbers[i] = numbers[z];
//                    numbers[z] = hint;
//
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    }
        for (int y = 0; y < numbers.length; y++) {
            for (int i = y + 1; i < numbers.length; i++) {
                if (numbers[i] > numbers[y]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[y];
                    numbers[y] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

}