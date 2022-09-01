package classwork;

import java.util.Objects;

public class ArrayString {

   private static String[] array1 = {"I love", "You", "Mummy"};
   private static String[] array2 = {"I love", "You", "Mummy"};

   private  static boolean isNotTrue;

   public static void myArrays(String[] array1, String[] array2){
       for (int i = 0; i < array1.length; i++){
          for (int y = 0; y < array2.length; y++){
               if (Objects.equals(array1[i], array2[y])){
                  isNotTrue = true;
               }
               else isNotTrue = false;
          }
       }
      System.out.println(isNotTrue);

   }

   public static void main(String[] args) {
      myArrays(array1, array2);
   }
}

