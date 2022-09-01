package dataStructure;

public class ArrayPractice {
   public static void arrayOne(){
       int[] array = new int[5];
       array[0] = 2;
       array[1] = 2;
       array[2] = 3;
       array[3] = 4;
       array[4] = 3;
       for (int index = 0; index < array.length; index++) {
           System.out.printf("%d%s",array[index], " ");
       }
       System.out.println("bye!!");
   }
}
