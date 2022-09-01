package arrays;

public class NumberReverse {

   private static final int[] array = {2, 3, 4, 5, 6};
//    {6,5,4,3,2}
    public static void sortReverse(int[] arr) {

        for (int i = array.length - 1; i >= 0 ; i--){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {

        System.out.println("Array order");
        NumberReverse.sortReverse(array);
    }
}

