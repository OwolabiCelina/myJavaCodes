package arrays;

public class SortArray {
   static int[] array = {20, 11, 21, 15, 5};
   static int count;

   public static void sortArray(){
   for(int i = 0; i < array.length; i++){
       for (int y = i + 1; y < array.length; y++){
           if (array[i] > array[y]){
               count = array[i];
               array[i] = array[y];
               array[y] = count;
           }
       }
       System.out.println(array[i]);
    }

}
}